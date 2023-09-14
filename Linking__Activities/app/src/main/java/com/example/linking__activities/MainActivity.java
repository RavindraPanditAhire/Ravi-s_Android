package com.example.linking__activities;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=findViewById(R.id.btn1);

        b1.setOnClickListener(this);


    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btn1) {
            Toast.makeText(this, "this is Activity 1..", Toast.LENGTH_LONG).show();
            Intent i1 = new Intent(getApplicationContext(), a.class);
            startActivity(i1);
        }
    }
}