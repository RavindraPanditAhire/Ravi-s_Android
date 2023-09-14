package com.example.togglebuttonexample;

import static android.widget.Toast.*;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    ToggleButton tb1,tb2;
    TextView t1,t2;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tb1=findViewById(R.id.toggleButton1);
        tb2=findViewById(R.id.toggleButton2);
        t1=findViewById(R.id.textView1);
        t2=findViewById(R.id.textView2);

        tb1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                t1.setText("Toggle Button: "+tb1.getText());

            }
        });
        tb2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                t2.setText("Toggle Button: "+tb2.getText());
            }
        });
    }
}