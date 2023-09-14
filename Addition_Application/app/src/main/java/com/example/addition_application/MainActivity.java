package com.example.addition_application;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity{
    Button add,sub,mul,div,mod;
    ImageButton clear;
    EditText f1,s1;
    TextView res;
    @SuppressLint("MissingInflatedId")
    protected void onCreate(Bundle save){
        super.onCreate(save);
        setContentView(R.layout.activity_main);
        res=(TextView) findViewById(R.id.res);
        f1=(EditText) findViewById(R.id.fvalue);
        s1=(EditText) findViewById(R.id.svalue);
        add=(Button) findViewById(R.id.sumbutton);
        sub=(Button) findViewById(R.id.subbutton);
        mul=(Button) findViewById(R.id.mulbutton);
        div=(Button) findViewById(R.id.divbutton);
        mod=(Button) findViewById(R.id.modbutton);
        clear=findViewById(R.id.clearButton);

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                f1.setText(" ");
                s1.setText(" ");
                res.setText(" ");
            }
        });

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float num1=Float.parseFloat(f1.getText().toString());
                float num2=Float.parseFloat(s1.getText().toString());
                String sum=Float.toString(num1+num2);
                res.append("\nAddition is: "+sum);
                Toast.makeText(MainActivity.this, "Thanks for Using Ravindra's Calculator..", Toast.LENGTH_SHORT).show();
            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1= Integer.parseInt(f1.getText().toString());
                int num2=Integer.parseInt(s1.getText().toString());
                String sub=Integer.toString(num1-num2);
                res.append("\nSubtraction is: "+sub);
                Toast.makeText(MainActivity.this, "Thanks for Using Ravindra's Calculator..", Toast.LENGTH_SHORT).show();
            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1= Integer.parseInt(f1.getText().toString());
                int num2=Integer.parseInt(s1.getText().toString());
                String mul=Integer.toString(num1*num2);
                res.append("\nMultiplication is: "+mul);
                Toast.makeText(MainActivity.this, "Thanks for Using Ravindra's Calculator..", Toast.LENGTH_SHORT).show();
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1= Integer.parseInt(f1.getText().toString());
                int num2=Integer.parseInt(s1.getText().toString());
                String div=Integer.toString(num1/num2);
                res.append("\nDivision is: "+div);
                Toast.makeText(MainActivity.this, "Thanks for Using Ravindra's Calculator..", Toast.LENGTH_SHORT).show();
            }
        });

        mod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1= Integer.parseInt(f1.getText().toString());
                int num2=Integer.parseInt(s1.getText().toString());
                String mod=Integer.toString(num1%num2);
                res.append("\nModulus is: "+mod);
                Toast.makeText(MainActivity.this, "Thanks for Using Ravindra's Calculator..", Toast.LENGTH_SHORT).show();
            }
        });

    }
}