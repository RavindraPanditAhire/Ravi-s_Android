package com.example.practicalno222;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

   AirplaneModeChangeReceiver airplaneModeChangeReceiver=new AirplaneModeChangeReceiver();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        }
        @Override
    protected void onStart(){
        super.onStart();
            IntentFilter intentFilter=new IntentFilter(Intent.ACTION_AIRPLANE_MODE_CHANGED);
            registerReceiver(intentFilter,airplaneModeChangeReceiver);
        }

    private void registerReceiver(IntentFilter intentFilter, AirplaneModeChangeReceiver airplaneModeChangeReceiver) {
    }

    protected void onStop(){
        super.onStop();
        unregisterReceiver(airplaneModeChangeReceiver);
    }

    private void unregisterReceiver(AirplaneModeChangeReceiver airplaneModeChangeReceiver) {
    }


}
