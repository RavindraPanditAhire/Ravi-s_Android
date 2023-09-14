package com.example.login__data;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.WindowDecorActionBar;

import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText name,email,pass,mob,date;
    Button submit;
    private static String data;
    public static String getdata(){
        return data;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        name=findViewById(R.id.Name);
        email=findViewById(R.id.email);
        pass=findViewById(R.id.password);
        mob=findViewById(R.id.mobile);
        date=findViewById(R.id.dob);
        submit=findViewById(R.id.enter);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(name.getText().toString().isEmpty()||email.getText().toString().isEmpty()||pass.getText().toString().isEmpty()||mob.getText().toString().isEmpty()||date.getText().toString().isEmpty()){
                    Toast.makeText(MainActivity.this, "PLEASE FILL ALL FIELD'S..........", Toast.LENGTH_SHORT).show();
                }
                else{
                    Intent i=new Intent(MainActivity.this, DataInformation.class);

                    data=name.getText().toString()+"\nEmail: "+email.getText().toString()+"\nMobile No.: "+mob.getText().toString()+"\nDOB: "+date.getText().toString()+"\nPassword: "+pass.getText().toString();
                    startActivity(i);
                }
            }
        });
    }
}