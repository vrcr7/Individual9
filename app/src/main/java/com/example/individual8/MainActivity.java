package com.example.individual8;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import timber.log.Timber;

public class MainActivity extends AppCompatActivity {
    ImageView imagen1;
    ImageView imagen2;
    ImageView imagen3;
    ImageView imagen4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Timber.d("Actividad Creada");
        imagen1 = (ImageView) findViewById(R.id.imageView2);
        imagen2 = (ImageView) findViewById(R.id.imageView3);
        imagen3 = (ImageView) findViewById(R.id.imageView4);
        imagen4 = (ImageView) findViewById(R.id.imageView5);

        imagen1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                llamar2(""+R.drawable.zen, ""+R.color.verde);
            }
        });


        imagen2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                llamar2(""+R.drawable.skate, ""+R.color.rojo);
            }
        });

        imagen3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                llamar2(""+R.drawable.medalla, ""+R.color.naranjo);
            }
        });

        imagen4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                llamar2(""+R.drawable.ola, ""+R.color.celeste);
            }
        });

    }
    protected void llamar2(String image, String color){
        Intent intento = new Intent(MainActivity.this, MainActivity2.class);
        intento.putExtra("imagen", image);
        intento.putExtra("color", color);
        startActivity(intento);
    }
    @Override
    protected void onResume(){
        super.onResume();
        Timber.d("Actividad en Resumen");
    }

    @Override
    protected void onPause(){
        super.onPause();
        Timber.d("Actividad en Pausa");
    }

    @Override
    protected void onStart(){
        super.onStart();
        Timber.d("Actividad Iniciada");
    }

    @Override
    protected void onStop(){
        super.onStop();
        Timber.d("Actividad en Detenida");
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Timber.d("Actividad Destruida");
    }
}