package com.example.listview__example;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends Activity {

    ListView list;
    String sub[]={"Android","java","Php","Hadoop","Sap","Python","Ajax","C++","Ruby","Rails","Java","Python","CSS","HTTP","Javascript","Servlets","JSP","Perl"};
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list=findViewById(R.id.listContainer);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_dropdown_item_1line,sub);
        list.setAdapter(adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, sub[position]+" is Clicked NOW", Toast.LENGTH_SHORT).show();
            }
        });


    }

}