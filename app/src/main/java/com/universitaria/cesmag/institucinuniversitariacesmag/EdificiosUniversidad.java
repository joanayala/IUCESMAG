package com.universitaria.cesmag.institucinuniversitariacesmag;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class EdificiosUniversidad extends AppCompatActivity {
    TextView a,b,c,d,e,f,g,h,w,x,damian;
    ImageView gotomapa,backimage;
    String massege;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edificios_universidad);
        gotomapa = (ImageView) findViewById(R.id.gotomapa);
        gotomapa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent main = new Intent(EdificiosUniversidad.this,MapsDeCESMAG.class);
                startActivity(main);
            }
        });
        backimage = (ImageView) findViewById(R.id.backimage);
        backimage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent map = new Intent(EdificiosUniversidad.this, MainActivity.class);
                startActivity(map);
                finish();
            }
        });


        a = (TextView)findViewById(R.id.a);
        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                massege = "a";
                Intent myIntent = new Intent(EdificiosUniversidad.this,EdificiosUniversidadItem.class);
                myIntent.putExtra("massege",massege);
                myIntent.putExtra("bulid","SEDE ADMINISTRATIVA");
                startActivity(myIntent);

            }
        });

        b = (TextView)findViewById(R.id.b);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                massege = "b";
                Intent myIntent = new Intent(EdificiosUniversidad.this,EdificiosUniversidadItem.class);
                myIntent.putExtra("massege",massege);
                myIntent.putExtra("bulid","SEDE B");
                startActivity(myIntent);

            }
        });

        c = (TextView)findViewById(R.id.c);
        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                massege = "c";
                Intent myIntent = new Intent(EdificiosUniversidad.this,EdificiosUniversidadItem.class);
                myIntent.putExtra("massege",massege);
                myIntent.putExtra("bulid","SEDE C");
                startActivity(myIntent);
            }
        });

        d = (TextView)findViewById(R.id.d);
        d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                massege = "d";
                Intent myIntent = new Intent(EdificiosUniversidad.this,EdificiosUniversidadItem.class);
                myIntent.putExtra("massege",massege);
                myIntent.putExtra("bulid","ITALIA - HOLANDA");
                startActivity(myIntent);
            }
        });

        f = (TextView)findViewById(R.id.f);
        f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                massege = "f";
                Intent myIntent = new Intent(EdificiosUniversidad.this,EdificiosUniversidadItem.class);
                myIntent.putExtra("massege",massege);
                myIntent.putExtra("bulid","SAN FRANCISCO");
                startActivity(myIntent);
            }
        });

        g = (TextView)findViewById(R.id.g);
        g.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                massege = "g";
                Intent myIntent = new Intent(EdificiosUniversidad.this,EdificiosUniversidadItem.class);
                myIntent.putExtra("massege",massege);
                myIntent.putExtra("bulid","CONSULTORIO JURIDICO");
                startActivity(myIntent);
            }
        });

        h = (TextView)findViewById(R.id.h);
        h.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                massege = "h";
                Intent myIntent = new Intent(EdificiosUniversidad.this,EdificiosUniversidadItem.class);
                myIntent.putExtra("massege",massege);
                myIntent.putExtra("bulid","ESPACIOS GENERALES");
                startActivity(myIntent);
            }
        });

        e = (TextView)findViewById(R.id.e);
        e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                massege = "e";
                Intent myIntent = new Intent(EdificiosUniversidad.this,EdificiosUniversidadItem.class);
                myIntent.putExtra("massege",massege);
                myIntent.putExtra("bulid","Entradas");
                startActivity(myIntent);
            }
        });

        w = (TextView)findViewById(R.id.w);
        w.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                massege = "w";
                Intent myIntent = new Intent(EdificiosUniversidad.this,EdificiosUniversidadItem.class);
                myIntent.putExtra("massege",massege);
                myIntent.putExtra("bulid","Coliseo Guillermo de Castellana");
                startActivity(myIntent);
            }
        });

        x = (TextView)findViewById(R.id.x);
        x.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                massege = "x";
                Intent myIntent = new Intent(EdificiosUniversidad.this,EdificiosUniversidadItem.class);
                myIntent.putExtra("massege",massege);
                myIntent.putExtra("bulid","SEDE SANTIAGO PROGRAMA DE DISEÑO GRAFICO");
                startActivity(myIntent);
            }
        });
        damian = (TextView)findViewById(R.id.damian);
        damian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                massege = "damian";
                Intent myIntent = new Intent(EdificiosUniversidad.this,EdificiosUniversidadItem.class);
                myIntent.putExtra("massege",massege);
                myIntent.putExtra("bulid","SAN DAMIAN");
                startActivity(myIntent);
            }
        });

//

    }
}
