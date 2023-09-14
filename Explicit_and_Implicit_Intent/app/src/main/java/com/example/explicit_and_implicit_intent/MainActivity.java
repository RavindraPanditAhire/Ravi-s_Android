package com.example.explicit_and_implicit_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button google,secactivity;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        google=findViewById(R.id.googlebtn);
        secactivity=findViewById(R.id.secbtn);
        
        google.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse("https://www.google.com"));
                startActivity(i);
                Toast.makeText(MainActivity.this,"Implicit Intent Example...", Toast.LENGTH_SHORT).show();

            }
        });

        secactivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),a.class);
                i.putExtra("value1: ","This is Explicit Intent Example...");
                startActivity(i);
                Toast.makeText(MainActivity.this,"Explicit Intent Example...", Toast.LENGTH_SHORT).show();
            }
        });
        
    }
}