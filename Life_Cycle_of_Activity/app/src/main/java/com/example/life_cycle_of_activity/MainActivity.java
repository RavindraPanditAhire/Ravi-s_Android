package com.example.life_cycle_of_activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart(){
        super.onStart();
        Log.d("lifecycle"," OnStart invoke...");
    }

    @Override
    protected void onResume(){
        super.onResume();
        Log.d("lifecycle"," OnResume invoke...");
    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.d("lifecycle"," OnPause invoke...");
    }

    @Override
    protected void onRestart(){
        super.onRestart();
        Log.d("lifecycle"," onRestart invoke...");
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.d("lifecycle"," onDestroy invoke...");
    }
}