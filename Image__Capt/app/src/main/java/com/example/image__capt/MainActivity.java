package com.example.image__capt;

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

    ImageView imgv;
    Button capt;
    int REQ_CODE=1;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        imgv=findViewById(R.id.imageView);
        capt=findViewById(R.id.button);
        
        capt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                
                Intent intent=new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(intent,REQ_CODE);
                
            }
        });
    }
    @Override
    public void onActivityResult(int req_code,int res_code,Intent data){
        super.onActivityResult(req_code,res_code,data);
        if(req_code==REQ_CODE){
            Bitmap image= (Bitmap) data.getExtras().get("data");
            imgv.setImageBitmap(image);
        }
    }
}