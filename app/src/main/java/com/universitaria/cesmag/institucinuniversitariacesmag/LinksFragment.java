package com.universitaria.cesmag.institucinuniversitariacesmag;

import android.app.Fragment;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.Toast;

public class LinksFragment extends Fragment {
    LinearLayout facebook,twitter,gmail,cesmag,game;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.links_fragment, container, false);
        return v;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);


        facebook = (LinearLayout)getActivity().findViewById(R.id.facebooklink);
        facebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                facebook_open();
            }
        });

        twitter = (LinearLayout)getActivity().findViewById(R.id.twitterlink);
        twitter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                twitter_open();
            }
        });


        gmail = (LinearLayout)getActivity().findViewById(R.id.gmaillink);
        gmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                composeEmail();
            }
        });


        cesmag = (LinearLayout)getActivity().findViewById(R.id.cesmaglink);
        cesmag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                web_open();
            }
        });

        game = (LinearLayout)getActivity().findViewById(R.id.gamelink);
        game.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                open_game();
            }
        });



    }


    public void composeEmail() {
        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("mailto:"));
        intent.putExtra(Intent.EXTRA_EMAIL, new String[]{"webmaster@iucesmag.edu.co"});
        intent.putExtra(Intent.EXTRA_SUBJECT, "");
        intent.putExtra(Intent.EXTRA_TEXT, "");
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        try {
            startActivity(Intent.createChooser(intent, "Send mail..."));
        } catch (android.content.ActivityNotFoundException ex) {
            Toast.makeText(getActivity(), "There are no email clients installed.", Toast.LENGTH_SHORT).show();
        }
    }

    public void facebook_open(){
        Intent facebookIntent = null;
        try {
            facebookIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("fb://page/448759031837402"));
            startActivity(facebookIntent);
        } catch (Exception e) {
            facebookIntent =  new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/448759031837402"));
            startActivity(facebookIntent);

        }
    }

    public void twitter_open(){

        Intent twitterIntent = null;
        try {
            twitterIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("twitter://user?screen_name=iucesmag"));
            startActivity(twitterIntent);

        } catch (Exception e) {
            twitterIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://twitter.com/iucesmag"));
            startActivity(twitterIntent);

        }
    }

    public void web_open(){
        Intent web = new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.iucesmag.edu.co"));
        startActivity(web);
    }

    public void open_game(){
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("market://details?id=co.edu.iucesmag.quierolau"));
        startActivity(intent);
    }

}
