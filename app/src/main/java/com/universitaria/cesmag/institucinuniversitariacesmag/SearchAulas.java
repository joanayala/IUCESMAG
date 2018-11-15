package com.universitaria.cesmag.institucinuniversitariacesmag;

import android.app.AlertDialog;
import android.content.Intent;
import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.BaseAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.TextView;

import java.util.ArrayList;

public class SearchAulas extends AppCompatActivity {
    TextView flag_image;
    SearchView search;
    ImageButton back;
    String strtext;
    DBManager dbManager;
    View myView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_aulas);
        dbManager=new DBManager(this);
        back = (ImageButton)findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent main = new Intent(SearchAulas.this,MainActivity.class);
                startActivity(main);
                finish();
            }
        });


        search = (SearchView) findViewById(R.id.search_aulas);
        search.requestFocus();
        search.onActionViewExpanded();
        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_VISIBLE);
        search.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                Log.d("text",query);
                LoadElement(query);
                return false;
            }

            @Override
            public boolean onQueryTextChange(String query) {
                Log.d("text",query);
                LoadElement(query);
                return false;
            }
        });
        LoadElement("");

    }

    ArrayList<Adapter> listnewsData = new ArrayList<Adapter>();
    SearchAulas.MyCustomAdapter myadapter;
    void LoadElement(String text) {
        listnewsData.clear();
        Cursor cursor = dbManager.query(null, "name like '%"+text+"%' OR bulid like '%"+text+"%' ", null, DBManager.ColID);
        if (cursor.moveToFirst()) {
            do {
                listnewsData.add(new Adapter(cursor.getString( cursor.getColumnIndex(DBManager.ColID)),
                        cursor.getString( cursor.getColumnIndex(DBManager.ColName)),
                        cursor.getString( cursor.getColumnIndex(DBManager.ColBiso)),
                        cursor.getString( cursor.getColumnIndex(DBManager.ColBulids)),
                        cursor.getString( cursor.getColumnIndex(DBManager.ColBulidName))));
            } while (cursor.moveToNext());
        }
        myadapter = new SearchAulas.MyCustomAdapter(listnewsData);
        ListView lsNews = (ListView) findViewById(R.id.listView);
        lsNews.setAdapter(myadapter);
    }


    private class MyCustomAdapter extends BaseAdapter {
        public ArrayList<Adapter> listnewsDataAdpater ;
        public MyCustomAdapter(ArrayList<Adapter>  listnewsDataAdpater) {
            this.listnewsDataAdpater=listnewsDataAdpater;
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
        public View getView(int position, View convertView, ViewGroup parent)
        {
            LayoutInflater mInflater = getLayoutInflater();
            final   Adapter s = listnewsDataAdpater.get(position);

             if (s.biso.equals("image")){
                myView = mInflater.inflate(R.layout.image_edificios_universidad, null);
                ImageView image=(ImageView)myView.findViewById(R.id.image);
//                if (s.bulid.equals("a")){
//                    image.setImageResource(R.mipmap.mapaimage);
//                }
//                else if (s.bulid.equals("b")){}
//                else if (s.bulid.equals("c")){}
//                else if (s.bulid.equals("d")){}
//                else if (s.bulid.equals("f")){}
//                else if (s.bulid.equals("g")){}
//                else if (s.bulid.equals("h")){}
                image.setVisibility(View.GONE);


            } else {
                 myView = mInflater.inflate(R.layout.edificiso_item, null);

                 myView.setOnClickListener(new View.OnClickListener() {
                     @Override
                     public void onClick(View v) {
                         LayoutInflater layoutInflater = LayoutInflater.from(SearchAulas.this);
                         final View promptView = layoutInflater.inflate(R.layout.aulas_information_click, null);
                         final AlertDialog alertD = new AlertDialog.Builder(SearchAulas.this).create();

                         TextView name = (TextView)promptView.findViewById(R.id.name);
                         TextView bulid = (TextView)promptView.findViewById(R.id.bulid);
                         TextView bais = (TextView)promptView.findViewById(R.id.bais);
                         ImageView image = (ImageView)promptView.findViewById(R.id.image);

                         name.setText(s.name);
                         bulid.setText(s.bulidName);
                         if (s.biso.equals("no")){ bais.setVisibility(View.GONE); }
                         else{bais.setText(s.biso);}


                         if (s.bulid.equals("a")){ image.setImageResource(R.mipmap.collage_a); }
                         else if (s.bulid.equals("b")){ image.setImageResource(R.mipmap.collage_b); }
                         else if (s.bulid.equals("c")){ image.setImageResource(R.mipmap.collage_c); }
                         else if (s.bulid.equals("d")){ image.setImageResource(R.mipmap.college_f); }
                         else if (s.bulid.equals("f")){ image.setImageResource(R.mipmap.collage_g); }
                         else if (s.bulid.equals("g")){ image.setImageResource(R.mipmap.collage_z); }
                         else if (s.bulid.equals("h")){
                             if (s.name.equals("Cancha 1")){image.setImageResource(R.mipmap.cancha1);}
                             else if (s.name.equals("Cancha 2")){image.setImageResource(R.mipmap.cancha2);}
                             else if (s.name.equals("Cancha 3")){image.setImageResource(R.mipmap.cancha3);}
                             else {image.setImageResource(R.mipmap.college_d);} }
                         else if (s.bulid.equals("x")){ image.setImageResource(R.mipmap.collage_y); }


                         ImageView exit = (ImageView)promptView.findViewById(R.id.exit);
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
                TextView name=(TextView)myView.findViewById(R.id.name);
                TextView biso=(TextView)myView.findViewById(R.id.biso);
                biso.setText(s.bulidName);
                name.setText(s.name);
            }
            return myView;
        }
    }

    final void endFocusAulas(){
        if (search != null) {
            search.setQuery("", false);
            search.clearFocus();
            search.onActionViewCollapsed();
        }

    }

    @Override
    public void onPause() {
        endFocusAulas();
        super.onPause();
    }

}
