package com.example.fragments;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    boolean pulsado = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.boton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pulsado = !pulsado;
                FragmentManager fm = getSupportFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                FragmentUno f1 = new FragmentUno();
                FragmentDos f2 = new FragmentDos();
                if (pulsado){
                    ft.replace(R.id.contenedor,f2);
                }else
                {
                    ft.replace(R.id.contenedor,f1);
                }

                ft.commit();


            }
        });
    }
}
