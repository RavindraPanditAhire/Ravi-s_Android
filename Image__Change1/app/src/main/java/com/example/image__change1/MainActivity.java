package com.example.image__change1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private static ImageView img1;
    private static int count;
    int imgs[]={R.drawable.pexels2,R.drawable.pexels3,R.drawable.pexels4,R.drawable.pexels5};
    private static ImageButton imgbtn1;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonClick();
    }
    private void buttonClick () {
        imgbtn1 = findViewById(R.id.button);
        img1 = findViewById(R.id.imageView);
       imgbtn1.setOnClickListener(
               new View.OnClickListener() {
                   @Override
                   public void onClick(View v) {
                       count++;
                       count=count%imgs.length;
                       img1.setImageResource(imgs[count]);
                   }
               }
       );
    }
}