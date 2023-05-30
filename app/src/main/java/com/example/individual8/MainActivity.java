package com.example.individual8;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import timber.log.Timber;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Timber.d("Actividad Creada");
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
        Timber.d("Actividad en Destruida");
    }
}