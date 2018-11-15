package com.universitaria.cesmag.institucinuniversitariacesmag;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

public class MapaFragment extends Fragment {
    LinearLayout mapaCESMAG,ubicacion;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.mapa_fragment, container, false);
        return v;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        mapaCESMAG = (LinearLayout)getActivity().findViewById(R.id.mapacesmag);
        mapaCESMAG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cesmag = new Intent(getActivity(),EdificiosUniversidad.class);
                startActivity(cesmag);
            }
        });

        ubicacion = (LinearLayout)getActivity().findViewById(R.id.ubicacion);
        ubicacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cesmag = new Intent(getActivity(),Ubicacion.class);
                startActivity(cesmag);
            }
        });

    }
}
