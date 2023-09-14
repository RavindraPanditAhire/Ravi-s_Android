package com.example.new__login;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText e1, e2;
    Button login;
    TextView res;

    @SuppressLint({"WrongViewCast", "MissingInflatedId"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        e1 = (EditText) findViewById(R.id.uname);
        e2 = (EditText) findViewById(R.id.editTextTextPassword);
        res = (TextView) findViewById(R.id.textView2);
        login = (Button) findViewById(R.id.logbtn);

       login.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               if(e1.getText().toString().isEmpty()||e2.getText().toString().isEmpty()||e1.getText().toString().isEmpty()&&e2.getText().toString().isEmpty()){
                   res.setText("Please Filled the fields First");
                   Toast.makeText(MainActivity.this, "Fields are Empty....", Toast.LENGTH_SHORT).show();
               }
               else if(e1.getText().toString().equals("Ravindra123")&& e2.getText().toString().equals("Ravi@9322")){
                   res.setText("Welcome "+e1.getText().toString()+"\nYou are Logged In");
                   Toast.makeText(MainActivity.this, "Login Successfull.....", Toast.LENGTH_SHORT).show();
                   Intent i=new Intent(MainActivity.this,a.class);
                   startActivity(i);
               }


               else {
                   res.setText("Invalid Credentials.....");
                   Toast.makeText(MainActivity.this, "Invalid Credentials..Please Try again", Toast.LENGTH_SHORT).show();
               }
           }
       });

        }
}