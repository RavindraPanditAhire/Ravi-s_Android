package com.example.search_engine_text;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final AutoCompleteTextView autoCompleteTextView=findViewById(R.id.autoCompleteTextView);
        ArrayList<Object> arrayList=new ArrayList<>();
        arrayList.add("Android");
        arrayList.add("JAVA");
        arrayList.add("CPP");
        arrayList.add("C Programming");
        arrayList.add("Kotlin");
        arrayList.add("CSS");
        arrayList.add("HTML");
        arrayList.add("PHP");
        arrayList.add("Swift");
        ArrayAdapter<Object> arrayAdapter=new ArrayAdapter<>(this, android.R.layout.simple_dropdown_item_1line, arrayList);
        autoCompleteTextView.setAdapter(arrayAdapter);
        autoCompleteTextView.setThreshold(1);

    }
}