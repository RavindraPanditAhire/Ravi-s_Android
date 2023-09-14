package com.example.toast_position;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    ListView list;
    GridView grid;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        list=findViewById(R.id.listView1);

        grid=findViewById(R.id.gridContainer);

        String[] sub ={"java","Advance Java","Perl","Python","HTML","CSS","Javascript","Hypertext preProcessor","Kotlin"};

        String[] button ={"1","2","3","4","5","6","7","8","9","9","10","11","12","13","14","15","16","17"};

        ArrayAdapter<String> adapter=new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_dropdown_item_1line,sub);

        ArrayAdapter<String> adapter1=new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_gallery_item,button);
        list.setAdapter(adapter);
        grid.setAdapter(adapter1);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, sub[position]+" is Clicked......", Toast.LENGTH_SHORT).show();
            }
        });

        grid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, "Button "+button[position]+" is Clicked.....", Toast.LENGTH_SHORT).show();

            }
        });

    }
}