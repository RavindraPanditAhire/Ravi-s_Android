package com.example.checkbox__example;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity  {
    CheckBox c1,c2,c3,c4,c5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Toast.makeText(getApplicationContext(),"You have Checked: "+c1.getText().toString(),Toast.LENGTH_LONG).show();

//        c1.findViewById(R.id.checkBox2);
//        c2.findViewById(R.id.checkBox1);
//        c3.findViewById(R.id.checkBox3);
//        c4.findViewById(R.id.checkBox4);
//        c5.findViewById(R.id.checkBox5);

//        if(c1.isChecked()==true){
//            Toast.makeText(getApplicationContext(),"You have Checked: "+c1.getText().toString(),Toast.LENGTH_LONG).show();
//
//        }
//        else{
//            Toast.makeText(getApplicationContext(),"You have UnChecked: "+c1.getText().toString(),Toast.LENGTH_LONG).show();
//
//        }

//        c1.setOnClickListener(this);
//        c2.setOnClickListener(this);
//        c3.setOnClickListener(this);
//        c4.setOnClickListener(this);
//        c5.setOnClickListener(this);
//        c1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(getApplicationContext(),"You have Checked: "+c1.getText().toString(),Toast.LENGTH_LONG).show();
//            }
//        });


//    @Override
//    public void onClick(View v) {
//        if(c1.isChecked()==true){
//            Toast.makeText(getApplicationContext(),"You have Checked: "+c1.getText().toString(),Toast.LENGTH_LONG).show();
//        }
//        else if(c2.isChecked()==true){
//            Toast.makeText(getApplicationContext(),"You have Checked: "+c2.getText().toString(),Toast.LENGTH_LONG).show();
//        }
//        else if(c3.isChecked()==true){
//            Toast.makeText(getApplicationContext(),"You have Checked: "+c3.getText().toString(),Toast.LENGTH_LONG).show();
//        }
//        else if(c4.isChecked()==true){
//            Toast.makeText(getApplicationContext(),"You have Checked: "+c4.getText().toString(),Toast.LENGTH_LONG).show();
//        }
//        else if(c5.isChecked()==true){
//            Toast.makeText(getApplicationContext(),"You have Checked: "+c5.getText().toString(),Toast.LENGTH_LONG).show();
//        }
//        else {
//            Toast.makeText(getApplicationContext(),"Something Went Wrong",Toast.LENGTH_LONG).show();
//
//        }
    }
}