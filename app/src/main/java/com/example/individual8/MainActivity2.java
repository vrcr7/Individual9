package com.example.individual8;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import timber.log.Timber;

public class MainActivity2 extends AppCompatActivity {
Button volver;
Button cerrar;
ImageView imagen1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent intento=getIntent();
        String imagen=intento.getStringExtra("imagen");
        String color1=intento.getStringExtra("color");
        Timber.d("Actividad Creada");

        //vinculación objetos
        volver=(Button) findViewById(R.id.bVolver);
        cerrar=(Button) findViewById(R.id.bCerrar);
        imagen1=(ImageView) findViewById(R.id.imageFinal);
        imagen1.setImageResource(Integer.parseInt(imagen));
        imagen1.setImageTintList(getColorStateList(Integer.parseInt(color1)));
        //botones con click
        volver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent atras= new Intent(MainActivity2.this,MainActivity.class);
                startActivity(atras);
            }
        });

        cerrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finishAffinity();
            }
        });

        //cargar imagen


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