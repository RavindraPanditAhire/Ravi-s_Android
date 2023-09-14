package com.example.digital__clock1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;

import java.util.Calendar;
import java.util.Date;

public class MainActivity extends AppCompatActivity {
    TimePicker time;
    Button button;
    TextView text;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        time = findViewById(R.id.timePicker1);
        time.setIs24HourView(true);
        text = findViewById(R.id.textView);
        button = findViewById(R.id.button);
        Date date = new Date();
        int hour = date.getHours();
        int min = date.getMinutes();
        int year = Calendar.YEAR;
        int month = Calendar.MONTH;
        int day = Calendar.DAY_OF_MONTH;
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timedialog = new TimePickerDialog(MainActivity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
                        text.append(hourOfDay + " : " + minute);
                    }
                }, hour, min, true);
                timedialog.show();
                DatePickerDialog datedialog = new DatePickerDialog(MainActivity.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                        text.append("\n"+dayOfMonth + "/" + month + "/" + year);
                    }
                }, year, month, day);
                datedialog.show();
            }
        });

    }
}