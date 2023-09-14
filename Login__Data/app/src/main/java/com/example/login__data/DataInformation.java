package com.example.login__data;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class DataInformation extends AppCompatActivity {

    TextView data;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_information);
        TextView textView = findViewById(R.id.infoCollector);
        textView.setText(MainActivity.getdata());

    }
}