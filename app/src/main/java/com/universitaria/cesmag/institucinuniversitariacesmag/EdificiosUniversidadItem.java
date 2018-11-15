package com.universitaria.cesmag.institucinuniversitariacesmag;

import android.content.Intent;
import android.database.Cursor;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;


import java.util.ArrayList;

public class EdificiosUniversidadItem extends AppCompatActivity {
    ImageButton back;
    DBManager dbManager;
    View myView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edificios_universidad_item);
        dbManager=new DBManager(this);
        back = (ImageButton)findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent main = new Intent(EdificiosUniversidadItem.this,EdificiosUniversidad.class);
                startActivity(main);
                finish();
            }
        });

        TextView nameofbulid = (TextView)findViewById(R.id.nameofbulid);
        nameofbulid.setText(getIntent().getStringExtra("bulid"));
        LoadElement();
        }

    ArrayList<Adapter> listnewsData = new ArrayList<Adapter>();
    MyCustomAdapter myadapter;
    void LoadElement() {
        listnewsData.clear();
        Cursor cursor = dbManager.query(null, " bulid='"+getIntent().getStringExtra("massege")+"' ", null, DBManager.ColID);
        if (cursor.moveToFirst()) {
            do {
                listnewsData.add(new Adapter(cursor.getString( cursor.getColumnIndex(DBManager.ColID)),
                        cursor.getString( cursor.getColumnIndex(DBManager.ColName)),
                        cursor.getString( cursor.getColumnIndex(DBManager.ColBiso)),
                        cursor.getString( cursor.getColumnIndex(DBManager.ColBulids)),
                        cursor.getString( cursor.getColumnIndex(DBManager.ColBulidName))));
            } while (cursor.moveToNext());
        }
        myadapter = new MyCustomAdapter(listnewsData);
        ListView lsNews = (ListView) findViewById(R.id.LVNews);
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

            if (s.biso.equals("no")){
                myView = mInflater.inflate(R.layout.edificiso_item, null);
                TextView name=(TextView)myView.findViewById(R.id.name);
                TextView biso=(TextView)myView.findViewById(R.id.biso);
                biso.setVisibility(View.GONE);
                name.setText(s.name);
            } else if (s.biso.equals("image")){
                myView = mInflater.inflate(R.layout.image_edificios_universidad, null);
                ImageView image=(ImageView)myView.findViewById(R.id.image);
                if (s.bulid.equals("a")){ if (s.name.equals("image")) image.setBackgroundResource(R.mipmap.collage_a);
                    else image.setBackgroundResource(R.mipmap.collage_aa);
                }
                else if (s.bulid.equals("b")){ image.setBackgroundResource(R.mipmap.collage_b); }
                else if (s.bulid.equals("c")){ image.setBackgroundResource(R.mipmap.collage_c); }
                else if (s.bulid.equals("d")){ image.setBackgroundResource(R.mipmap.college_f); }
                else if (s.bulid.equals("f")){ image.setBackgroundResource(R.mipmap.collage_g); }
                else if (s.bulid.equals("g")){ image.setBackgroundResource(R.mipmap.collage_z); }
                else if (s.bulid.equals("h")){ image.setBackgroundResource(R.mipmap.college_d); }
                else if (s.bulid.equals("x")){ image.setBackgroundResource(R.mipmap.collage_y); }
                else if (s.bulid.equals("e")){ image.setBackgroundResource(R.drawable.background_layout);
                    if (s.name.equals("ee")) image.setImageResource(R.mipmap.entrance1);
                    else image.setImageResource(R.mipmap.collage_gg); }
                else if (s.bulid.equals("w")){ image.setBackgroundResource(R.drawable.background_layout);
                    if (s.name.equals("ww")) image.setImageResource(R.mipmap.college_e);
                    else image.setImageResource(R.mipmap.college_ee); }
                else if (s.bulid.equals("damian")){
                    image.setBackgroundResource(R.drawable.background_layout);
                    if (s.name.equals("damian")) image.setImageResource(R.mipmap.damian);
                    else image.setImageResource(R.mipmap.damian1);
                }
            } else {
                myView = mInflater.inflate(R.layout.edificiso_item, null);
                TextView name=(TextView)myView.findViewById(R.id.name);
                TextView biso=(TextView)myView.findViewById(R.id.biso);
                if (s.biso.equals("1er piso"))biso.setTextColor(Color.RED);
                else if (s.biso.equals("3er piso"))biso.setTextColor(Color.BLACK);
                else if (s.biso.equals("5to piso"))biso.setTextColor(Color.RED);
                else if (s.biso.equals("Mezzanine 2") || s.biso.equals("Sotano"))biso.setTextColor(Color.GRAY);
                biso.setText(s.biso);
                name.setText(s.name);
            }
            return myView;
        }
    }

}
