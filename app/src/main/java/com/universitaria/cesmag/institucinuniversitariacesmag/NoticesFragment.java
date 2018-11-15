package com.universitaria.cesmag.institucinuniversitariacesmag;
        import android.app.AlertDialog;
        import android.app.Fragment;
        import android.content.Context;
        import android.net.ConnectivityManager;
        import android.net.NetworkInfo;
        import android.os.Bundle;
        import android.support.annotation.Nullable;
        import android.view.LayoutInflater;
        import android.view.View;
        import android.view.ViewGroup;
        import android.widget.BaseAdapter;
        import android.widget.ImageView;
        import android.widget.ListView;
        import android.widget.ProgressBar;
        import android.widget.TextView;
        import android.widget.Toast;
        import com.android.volley.RequestQueue;
        import com.android.volley.toolbox.Volley;
        import com.android.volley.Response;
        import com.github.ybq.android.spinkit.style.FadingCircle;
        import com.squareup.picasso.Picasso;
        import org.json.JSONArray;
        import org.json.JSONException;
        import org.json.JSONObject;
        import org.jsoup.Jsoup;
        import java.util.ArrayList;
public class NoticesFragment extends Fragment {
    ImageView lista;
    ArrayList<Adapter> listnewsData = new ArrayList<Adapter>();
    public MyCustomAdapter myadapter;
    static ProgressBar progressBar;
    static FadingCircle doubleBounce;
    ListView list;
    View myView;
    String title,description,image;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.notices_fragment, container, false);
        return v;
    }
    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        progressBar = (ProgressBar)getActivity().findViewById(R.id.spin_kit);
        doubleBounce = new FadingCircle();
        progressBar.setIndeterminateDrawable(doubleBounce);
        stopProgress();
        if (isInternetConnected(getActivity())){
            myadapter=new MyCustomAdapter(listnewsData);
            list=(ListView)getActivity().findViewById(R.id.listView);
            list.setAdapter(myadapter);
            request();
        }
        else {
            Toast.makeText(getActivity(),"Sin conexión a Internet",Toast.LENGTH_LONG).show();
        }
    }
    private class MyCustomAdapter extends BaseAdapter {
        public ArrayList<Adapter> listnewsDataAdpater;
        public MyCustomAdapter(ArrayList<Adapter> listnewsDataAdpater) {
            this.listnewsDataAdpater = listnewsDataAdpater;
        }
        @Override
        public int getCount() {
            return listnewsDataAdpater.size();
        }
        @Override
        public String getItem(int position) {
            return null;
        }
        @Override
        public long getItemId(int position) {
            return position;
        }
        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            final Adapter s = listnewsDataAdpater.get(position);
            LayoutInflater mInflater =getActivity().getLayoutInflater();
                myView = mInflater.inflate(R.layout.notices_item, null);
                TextView name = (TextView) myView.findViewById(R.id.name);
                name.setText(s.title);
                ImageView image = (ImageView)myView.findViewById(R.id.image);
                if (!s.url.isEmpty()){
                    Picasso.with(getActivity()).load(s.url).into(image);
                }else {
                    image.setImageResource(R.mipmap.cesmag);
                }
                myView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        LayoutInflater layoutInflater = LayoutInflater.from(getActivity());
                        final View promptView = layoutInflater.inflate(R.layout.description_item_notices, null);
                        final AlertDialog alertD = new AlertDialog.Builder(getActivity()).create();
                        TextView title = (TextView)promptView.findViewById(R.id.title_item);
                        TextView desc = (TextView)promptView.findViewById(R.id.description_item);
                        ImageView image_desc = (ImageView)promptView.findViewById(R.id.image_item);
                        ImageView exit = (ImageView)promptView.findViewById(R.id.exit);
                        if (!s.url.isEmpty()){ Picasso.with(getActivity()).load(s.url).into(image_desc); }
                            else { image_desc.setImageResource(R.mipmap.cesmag); }
                        String cleanString = Jsoup.parse(s.content).wholeText();
                        if (cleanString.isEmpty()){ desc.setVisibility(View.GONE); }
                        else { desc.setText(cleanString); }
                        title.setText(s.title);
                        exit.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                alertD.dismiss();
                            }
                        });
                        alertD.setView(promptView);
                        alertD.show();
                    }
                });
            return myView;
        }
    }

    public void request(){
        startProgress();
        Response.Listener<String> responseListener = new Response.Listener<String>(){
            @Override
            public void onResponse(String response) {
                try{
                    JSONObject json=new JSONObject(response);
                    JSONArray j = json.getJSONArray("posts");
                    for(int i=0;i<j.length();i++){
                        JSONObject user=j.getJSONObject(i);

                        try{ title = user.getString("title"); }
                        catch (Exception e){ title = " "; }

                        try { description = user.getString("content"); }
                        catch (Exception e){ description = " "; }

                        try { image = user.getJSONObject("thumbnail_images").getJSONObject("full").getString("url"); }
                        catch (Exception e){
                            try { image = user.getJSONArray("full").getJSONObject(0).getString("url"); }
                            catch (Exception e1){image = ""; }
                        }

                        listnewsData.add(new Adapter(image,title,description));


//                        try {
//                            listnewsData.add(new Adapter(user.getJSONObject("thumbnail_images").getJSONObject("full").getString("url"),
//                                    user.getString("title"),
//                                    user.getString("content")
//                            ));
//                            Log.d("test","first");
//                        }catch (Exception e){
//                            try {
//                                listnewsData.add(new Adapter(user.getJSONArray("full").getJSONObject(0).getString("url"),
//                                        user.getString("title"),
//                                        user.getString("content")
//                                ));
//                                Log.d("test","second");
//                            }catch (Exception e1){
//                                listnewsData.add(new Adapter("",
//                                        user.getString("title"),
//                                        user.getString("content")
//                                ));
//                                Log.d("test","thierd");
//                            }
//                        }

                    }
                    myadapter.notifyDataSetChanged();
                    stopProgress();
                }catch (JSONException e){
                    Toast.makeText(getActivity(),"wrong",Toast.LENGTH_SHORT).show();
                }
            }
        };
        Request request = new Request(responseListener);
        RequestQueue queue = Volley.newRequestQueue(getActivity());
        queue.add(request);
    }


    public static void startProgress(){ progressBar.setVisibility(View.VISIBLE); }
    public static void stopProgress(){ progressBar.setVisibility(View.GONE); }

    public static boolean isInternetConnected(Context context) {
        ConnectivityManager cm = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo activeNetwork = cm.getActiveNetworkInfo();
        return activeNetwork != null && activeNetwork.isConnectedOrConnecting();}


}
