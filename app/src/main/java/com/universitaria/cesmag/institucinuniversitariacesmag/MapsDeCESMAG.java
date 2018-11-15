package com.universitaria.cesmag.institucinuniversitariacesmag;
import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.Polyline;
import com.google.android.gms.maps.model.PolylineOptions;

public class MapsDeCESMAG extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private static final String TAG = "MapActivity";
    Button information;
    ImageView backimage;
    private static final String FINE_LOCATION = Manifest.permission.ACCESS_FINE_LOCATION;
    private static final String COURSE_LOCATION = Manifest.permission.ACCESS_COARSE_LOCATION;
    private static final int LOCATION_PERMISSION_REQUEST_CODE = 1234;
    private Boolean mLocationPermissionsGranted = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps_de_cesmag);
        getLocationPermission();
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
        backimage = (ImageView) findViewById(R.id.backimage);
        backimage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent map = new Intent(MapsDeCESMAG.this, EdificiosUniversidad.class);
                startActivity(map);
                finish();
            }
        });

    }


    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        LatLng sydney = new LatLng(1.2091286, -77.2783537);
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(sydney, 18));
        mMap.getUiSettings().setZoomControlsEnabled(true);
        mMap.getUiSettings().setMyLocationButtonEnabled(true);
        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            return;
        }
        mMap.setMyLocationEnabled(true);
        mMap.getUiSettings().setCompassEnabled(true);
        mMap.setMapType(GoogleMap.MAP_TYPE_SATELLITE);
        mMap.getUiSettings().setIndoorLevelPickerEnabled(true);
        mMap.getUiSettings().setMapToolbarEnabled(true);

        Polyline polyline1 = googleMap.addPolyline(new PolylineOptions()
                .clickable(true)
                .color(Color.WHITE)
                .width(1)
                .add(
                        new LatLng(1.209543, -77.279245),
                        new LatLng(1.209787, -77.278951),
                        new LatLng(1.209935, -77.278557),
                        new LatLng(1.209823, -77.278475),
                        new LatLng(1.209884, -77.278286),
                        new LatLng(1.209843, -77.278132),
                        new LatLng(1.208415, -77.277420),
                        new LatLng(1.208249, -77.277812),
                        new LatLng(1.208986, -77.278512),
                        new LatLng(1.209040, -77.278470),
                        new LatLng(1.209196, -77.278381),
                        new LatLng(1.209595, -77.278828),
                        new LatLng(1.209420, -77.279318),
                        new LatLng(1.209543, -77.279245)));
        polyline1.setTag("A");

        LatLng num1 = new LatLng(1.209770, -77.278744);
        mMap.addMarker(new MarkerOptions().position(num1).icon(BitmapDescriptorFactory.fromResource(R.mipmap.sedeb)));
//        mMap.setOnMarkerClickListener(new GoogleMap.OnMarkerClickListener() {
//            @Override
//            public boolean onMarkerClick(Marker marker) {
//                LayoutInflater layoutInflater = LayoutInflater.from(MapsDeCESMAG.this);
//                final View promptView = layoutInflater.inflate(R.layout.listsedeb, null);
//                final AlertDialog alertD = new AlertDialog.Builder(MapsDeCESMAG.this).create();
//                alertD.setView(promptView);
//                alertD.show();
//
//                return false;
//            }
//        });

        LatLng num2 = new LatLng(1.209790, -77.278385 );
        mMap.addMarker(new MarkerOptions().position(num2).icon(BitmapDescriptorFactory.fromResource(R.mipmap.sedec)));

        LatLng num3 = new LatLng(1.209569, -77.278329);
        mMap.addMarker(new MarkerOptions().position(num3).icon(BitmapDescriptorFactory.fromResource(R.mipmap.espacios)));

        LatLng num4 = new LatLng(1.209023, -77.278323);
        mMap.addMarker(new MarkerOptions().position(num4).icon(BitmapDescriptorFactory.fromResource(R.mipmap.coliseo)));

        LatLng num5 = new LatLng(1.208798, -77.278138 );
        mMap.addMarker(new MarkerOptions().position(num5).icon(BitmapDescriptorFactory.fromResource(R.mipmap.holanda)));

        LatLng num6 = new LatLng(1.208553, -77.277745);
        mMap.addMarker(new MarkerOptions().position(num6).icon(BitmapDescriptorFactory.fromResource(R.mipmap.sanfrancesco)));


        LatLng num7 = new LatLng(1.208759, -77.277872);
        mMap.addMarker(new MarkerOptions().position(num7).icon(BitmapDescriptorFactory.fromResource(R.mipmap.italia)));


        LatLng num8 = new LatLng(1.209616, -77.279016);
        mMap.addMarker(new MarkerOptions().position(num8).icon(BitmapDescriptorFactory.fromResource(R.mipmap.sedea)));


    }


    private void initMap(){
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map);
        mapFragment.getMapAsync(MapsDeCESMAG.this);
    }

    private void getLocationPermission(){
        String[] permissions = {Manifest.permission.ACCESS_FINE_LOCATION,
                Manifest.permission.ACCESS_COARSE_LOCATION};

        if(ContextCompat.checkSelfPermission(this.getApplicationContext(), FINE_LOCATION) == PackageManager.PERMISSION_GRANTED){
            if(ContextCompat.checkSelfPermission(this.getApplicationContext(), COURSE_LOCATION) == PackageManager.PERMISSION_GRANTED){ mLocationPermissionsGranted = true; }
            else { ActivityCompat.requestPermissions(this, permissions, LOCATION_PERMISSION_REQUEST_CODE); }
        }
        else{
            ActivityCompat.requestPermissions(this, permissions, LOCATION_PERMISSION_REQUEST_CODE);
        }
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        mLocationPermissionsGranted = false;

        switch(requestCode){
            case LOCATION_PERMISSION_REQUEST_CODE:{
                if(grantResults.length > 0){
                    for(int i = 0; i < grantResults.length; i++){
                        if(grantResults[i] != PackageManager.PERMISSION_GRANTED){
                            mLocationPermissionsGranted = false;
                            return;
                        }
                    }
                    mLocationPermissionsGranted = true;
                    //initialize our map
                    initMap();
                }
            }
        }
    }


}


