package com.example.checkbox__example1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    CheckBox c1,c2,c3,c4,c5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        c1=findViewById(R.id.checkBox1);
        c2=findViewById(R.id.checkBox2);
        c3=findViewById(R.id.checkBox3);
        c4=findViewById(R.id.checkBox4);
        c5=findViewById(R.id.checkBox5);
        c1.setChecked(true);
        c1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(c1.isChecked()){
                    Toast.makeText(MainActivity.this, c1.getText()+" is CHECKED NOW", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(MainActivity.this, c1.getText()+" is UNCHECKED NOW", Toast.LENGTH_SHORT).show();
                }
            }
        });
        c2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(c2.isChecked()){
                    Toast.makeText(MainActivity.this, c2.getText()+" is CHECKED NOW", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(MainActivity.this, c2.getText()+" is UNCHECKED NOW", Toast.LENGTH_SHORT).show();
                }
            }
        });
        c3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(c3.isChecked()){
                    Toast.makeText(MainActivity.this, c3.getText()+" is CHECKED NOW", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(MainActivity.this, c3.getText()+" is UNCHECKED NOW", Toast.LENGTH_SHORT).show();
                }
            }
        });
        c4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(c4.isChecked()){
                    Toast.makeText(MainActivity.this, c4.getText()+" is CHECKED NOW", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(MainActivity.this, c4.getText()+" is UNCHECKED NOW", Toast.LENGTH_SHORT).show();
                }
            }
        });
        c5.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(c5.isChecked()){
                    Toast.makeText(MainActivity.this, c5.getText()+" is CHECKED NOW", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(MainActivity.this, c5.getText()+" is UNCHECKED NOW", Toast.LENGTH_SHORT).show();
                }
            }
        });


    }
}