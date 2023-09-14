package com.example.date_and_time_picker;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.DialogInterface;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.TimePicker;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    EditText res1,res;
    Button b1,b2;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        res=findViewById(R.id.editText1);
        res1=findViewById(R.id.editText2);
        b1=findViewById(R.id.button1);
        b2=findViewById(R.id.button2);
        Calendar cal=Calendar.getInstance();
        Date time= new Date();
        final int year= Calendar.YEAR;
        final int month= Calendar.YEAR;
        final int date1= Calendar.DAY_OF_MONTH;
        final int hour= time.getHours();;
        final int min= time.getMinutes();
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DatePickerDialog dialog=new DatePickerDialog(MainActivity.this, android.R.style.Theme_Holo_Dialog_MinWidth, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                        res.setText(SimpleDateFormat.getDateInstance().format(cal.getTime()));
                    }
                }, year, month, date1);
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                dialog.show();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog dia=new TimePickerDialog(MainActivity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
                        res1.setText(hourOfDay+":"+minute);
                    }
                },hour,min,true);
                dia.show();
            }
        });
    }
}