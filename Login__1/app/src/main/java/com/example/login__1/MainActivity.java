package com.example.login__1;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;

import android.app.Activity;

public class MainActivity extends Activity {



    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
        protected void onStart(){
            super.onStart();
            Log.d("lifecycle","onStart Invoked");
        }

        public void onResume(){
            super.onResume();
            Log.d("lifecycle","onResume Invoked");
        }

        public void onPause(){
            super.onPause();
            Log.d("lifecycle","onPause Invoked");
        }

        public void onRestart(){
            super.onRestart();
            Log.d("lifecycle","onRestart Invoked");
        }

        public void onDestroy(){
            super.onDestroy();
            Log.d("lifecycle","onDestroy Invoked");
        }

}