package com.example.grid__15__buttons;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.GridView;

public class MainActivity extends Activity {

    GridView list;
    String[] button ={"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15"};
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list=findViewById(R.id.gridView);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_gallery_item,button);
        list.setAdapter(adapter);

    }
}