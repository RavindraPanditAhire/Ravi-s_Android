package com.example.p_2_ractice;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    ImageView img;
    int count=0;
    int imgs[]={R.drawable.hero_bg,R.drawable.oip};
    Button nxt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        img=findViewById(R.id.imageView3);
        nxt=findViewById(R.id.button);

        nxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                count++;
                count=count%imgs.length;
                img.setImageResource(imgs[count]);

            }
        });

    }
}