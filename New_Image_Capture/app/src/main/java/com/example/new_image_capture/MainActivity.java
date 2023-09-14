package com.example.new_image_capture;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    int CAMERA_REQUEST=1;
    Button capt;
    ImageView img;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        img=findViewById(R.id.imageView);
        capt=findViewById(R.id.clickbtn);

        capt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i=new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(i,CAMERA_REQUEST);
            }
        });
    }
    @Override
    protected void onActivityResult(int RequestCode, int ResultCode, @Nullable Intent data){
        super.onActivityResult(RequestCode,ResultCode,data);

        if(CAMERA_REQUEST==CAMERA_REQUEST){
            Bitmap image=(Bitmap) data.getExtras().get("data");
            img.setImageBitmap(image);
        }
    }
}