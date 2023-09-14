package com.example.new_email_application;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText textTo,textSub,textMess;
    Button send;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textTo=findViewById(R.id.editText1);
        textSub=findViewById(R.id.editText2);
        textMess=findViewById(R.id.editText3);
        send=findViewById(R.id.button1);

        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String to=textTo.getText().toString();
                String subject=textSub.getText().toString();
                String message=textMess.getText().toString();

                Intent email=new Intent(Intent.ACTION_SEND);

                email.putExtra(Intent.EXTRA_EMAIL,new String[]{to});
                email.putExtra(Intent.EXTRA_SUBJECT,subject);
                email.putExtra(Intent.EXTRA_TEXT,message);
                email.setType("message/rfc822");
                startActivity(Intent.createChooser(email,"Choose an Email Client......."));
            }
        });

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.activity_main,menu);
        return true;
    }

}