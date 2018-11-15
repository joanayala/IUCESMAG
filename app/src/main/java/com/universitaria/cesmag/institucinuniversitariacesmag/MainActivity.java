package com.universitaria.cesmag.institucinuniversitariacesmag;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    LinearLayout search_button;
    DBManager dbManager;
    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.noticas:
                    NoticesFragment fragment = new NoticesFragment();
                    MainActivity.this.getFragmentManager().beginTransaction().replace(R.id.framelayout, fragment).commit();
                    return true;
                case R.id.map:
                    MapaFragment mapaFragment = new MapaFragment();
                    MainActivity.this.getFragmentManager().beginTransaction().replace(R.id.framelayout, mapaFragment).commit();
                    return true;
                case R.id.links:
                    LinksFragment links = new LinksFragment();
                    MainActivity.this.getFragmentManager().beginTransaction().replace(R.id.framelayout, links).commit();
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String mode = SharedPreferencesHelper.getStringSharedPref(getApplicationContext(),"land") ;


        if(this.getResources().getConfiguration().orientation==Configuration.ORIENTATION_LANDSCAPE) {
            if (mode.equals("p")) { Intent intent = new Intent(MainActivity.this, MainActivity.class);startActivity(intent);finish();
                SharedPreferencesHelper.setSharePref(getApplicationContext(),"land","l"); }
        } else if(this.getResources().getConfiguration().orientation==Configuration.ORIENTATION_PORTRAIT) {
            if (mode.equals("l")) { Intent intent = new Intent(MainActivity.this, MainActivity.class);startActivity(intent);finish();
                SharedPreferencesHelper.setSharePref(getApplicationContext(),"land","p"); }
        }
        dbManager = new DBManager(this);
        NoticesFragment fragment = new NoticesFragment();
        MainActivity.this.getFragmentManager().beginTransaction().replace(R.id.framelayout, fragment).commit();

        search_button = (LinearLayout)findViewById(R.id.search_button);
        search_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent search = new Intent(MainActivity.this,SearchAulas.class);
                startActivity(search);
            }
        });

        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }
}