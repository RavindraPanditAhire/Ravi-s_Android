package com.example.rating_bar_application;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RatingBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button login;
    EditText stdname,tcrname;
    RatingBar rating;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        stdname=findViewById(R.id.studname);
        tcrname=findViewById(R.id.teacher_name);
        rating=findViewById(R.id.ratingBar);
        login=findViewById(R.id.subButton);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Thank You...." + stdname.getText().toString(), Toast.LENGTH_SHORT).show();
            }

            });

        }
    }
