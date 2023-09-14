package com.example.datepicker_spinner__1;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    EditText date;
    int year,month,date1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        date=findViewById(R.id.editTextDate);
        final Calendar cal= Calendar.getInstance();

        date.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                year=cal.get(Calendar.YEAR);
                month=cal.get(Calendar.MONTH);
                date1=cal.get(Calendar.DAY_OF_MONTH);
                DatePickerDialog datadialog=new DatePickerDialog(MainActivity.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                        date.setText(SimpleDateFormat.getDateInstance().format(cal.getTime()));
                    }
                },year,month,date1);
                datadialog.show();
            }
        });
    }
}