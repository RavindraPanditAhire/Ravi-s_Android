package com.example.facto_with_intent;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText Email,Sub,Mess;
    Button send;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Email=findViewById(R.id.editTextTextEmailAddress);
        Sub=findViewById(R.id.editTextTextPersonName2);
        Mess=findViewById(R.id.editTextTextMultiLine);
        send=findViewById(R.id.button);

        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email=Email.getText().toString();
                String sub=Sub.getText().toString();
                String mess=Mess.getText().toString();

                Intent intent=new Intent(Intent.ACTION_SEND);
                intent.putExtra(Intent.EXTRA_EMAIL,email);
                intent.putExtra(Intent.EXTRA_SUBJECT,sub);
                intent.putExtra(Intent.EXTRA_TEXT,mess);

                intent.setType("message/rcf822");

                startActivity(Intent.createChooser(intent,"Selct Client"));
            }
        });


    }

}