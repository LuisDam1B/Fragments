package com.example.fragments;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.ListFragment;

import java.util.ArrayList;
import java.util.zip.Inflater;

public class FragmentUno extends ListFragment {

    ArrayList<String> datos;
    OnSelectItemListener listener;

    public FragmentUno(ArrayList<String> datos){
        this.datos = datos;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setListAdapter(new ArrayAdapter(getActivity(),android.R.layout.simple_list_item_1,datos));
    }

    @Override
    public void onListItemClick(@NonNull ListView l, @NonNull View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        Toast.makeText(getActivity(),"Pulsado" + datos.get(position),Toast.LENGTH_SHORT).show();
        listener.onItemSelected(datos.get(position));
    }

    // en el ciclo de vida esto es lo primero que se ejecuta
    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        listener = (OnSelectItemListener) context;
    }
}
