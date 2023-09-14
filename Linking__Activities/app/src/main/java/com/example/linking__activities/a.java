package com.example.linking__activities;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.Notification;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class a extends AppCompatActivity {

    Button b1;
    ImageView img;
    TextView text;
    String str;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a);
        b1=findViewById(R.id.button);
        img=findViewById(R.id.imageView);
        text=findViewById(R.id.textView);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                str= text.getText().toString();
                Intent i=new Intent();
                i.setAction(Intent.ACTION_SEND);
                i.setType("text/plain");
                i.putExtra(Intent.EXTRA_TEXT,str );
                startActivity(i);



            }
        });
    }
}