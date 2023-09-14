package com.example.url_navigator;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {


    TextView url;
    Button b1;
    ImageButton insta,whats,face,twit;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=findViewById(R.id.button1);
        url=findViewById(R.id.urlText);

        insta=findViewById(R.id.instaButton);
        whats=findViewById(R.id.whatButton);
        face=findViewById(R.id.faceButton);
        twit=findViewById(R.id.twitButton);

        b1.setOnClickListener(v -> {
            String URL="https://"+url.getText().toString();
            Intent i=new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse(URL));
            startActivity(i);
        });

        insta.setOnClickListener(v -> {
            String url="https://instagram.com/_ravi_ahire_?igshid=ZDdkNTZiNTM=";
            Intent i=new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse(url));
            startActivity(i);

        });

        whats.setOnClickListener(v -> {
            String url="https://wa.me/qr/HWHYF3WWFFYZI1";
            Intent i=new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse(url));
            startActivity(i);

        });

        face.setOnClickListener(v -> {
            String url="https://m.facebook.com/story.php?story_fbid=pfbid03tDYJGQ5mZybtBCLx17Rtvp6zHzzoQ6qBhkwUtCH92rPQG2U31EduJtEho6yMNaSl&id=100090444980553&mibextid=Nif5oz";
            Intent i=new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse(url));
            startActivity(i);

        });

        twit.setOnClickListener(v -> {
            String url="https://twitter.com/Ravi6193?t=O2PY0vqXnOnyvXaDndYAUw&s=08";
            Intent i=new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse(url));
            startActivity(i);

        });

    }
}