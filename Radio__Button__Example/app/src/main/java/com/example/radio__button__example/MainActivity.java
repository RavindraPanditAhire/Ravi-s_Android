package com.example.radio__button__example;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RadioButton rb1,rb2,rb3,rb4;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rb1=findViewById(R.id.radioButton1);
        rb2=findViewById(R.id.radioButton2);
        rb3=findViewById(R.id.malebtn);
        rb4=findViewById(R.id.femalebtn);
        rb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (rb1.isChecked()) {
                    Toast.makeText(MainActivity.this, rb1.getText() + " is CLICKed NOW...", Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(MainActivity.this, rb1.getText() + " is UNCLICKed NOW...", Toast.LENGTH_LONG).show();
                }
            }
        });
        rb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (rb2.isChecked()) {
                    Toast.makeText(MainActivity.this, rb2.getText() + " is CLICKed NOW...", Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(MainActivity.this, rb2.getText() + " is UNCLICKed NOW...", Toast.LENGTH_LONG).show();
                }
            }
        });
        rb3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (rb3.isChecked()) {
                    Toast.makeText(MainActivity.this, rb3.getText() + " is CLICKed NOW...", Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(MainActivity.this, rb3.getText() + " is UNCLICKed NOW...", Toast.LENGTH_LONG).show();
                }
            }
        });
        rb4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (rb4.isChecked()) {
                    Toast.makeText(MainActivity.this, rb4.getText() + " is CLICKed NOW...", Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(MainActivity.this, rb4.getText() + " is UNCLICKed NOW...", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}