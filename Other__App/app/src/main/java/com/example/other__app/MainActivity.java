package com.example.other__app;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_main);

        Log.d("LifeCycle","OnCreate Invoked........");
        Toast.makeText(getApplicationContext(),"OnCreate Invoked........",Toast.LENGTH_LONG).show();
    }

    @Override
    public void onResume(){
        super.onResume();
        Log.d("LifeCycle","onResume Invoked........");
        Toast.makeText(getApplicationContext(),"onResume Invoked........",Toast.LENGTH_LONG).show();

    }

    @Override
    public void onPause(){
        super.onPause();
        Log.d("LifeCycle","onPause Invoked........");
        Toast.makeText(getApplicationContext(),"onPause Invoked........",Toast.LENGTH_LONG).show();

    }

    @Override
    public void onStop(){
        super.onStop();
        Log.d("LifeCycle","onStop Invoked........");
        Toast.makeText(getApplicationContext(),"onStop Invoked........",Toast.LENGTH_LONG).show();

    }

    @Override
    public void onDestroy(){
        super.onDestroy();
        Log.d("LifeCycle","onDestroy Invoked........");
        Toast.makeText(getApplicationContext(),"onDestroy Invoked........",Toast.LENGTH_LONG).show();

    }

    @Override
    public void onStart(){
        super.onStart();
        Log.d("LifeCycle","onStart Invoked........");
        Toast.makeText(getApplicationContext(),"onStart Invoked........",Toast.LENGTH_LONG).show();

    }
}