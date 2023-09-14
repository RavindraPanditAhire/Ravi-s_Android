package com.example.new__sms;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText no,msg;
    Button send;
    ImageView contact;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        no=findViewById(R.id.notext);
        msg=findViewById(R.id.messagetext);
        send=findViewById(R.id.sendbtn);
        contact=findViewById(R.id.contactimg);
        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               Intent i=new Intent(getApplicationContext(),MainActivity.class);
               PendingIntent pi=PendingIntent.getActivity(getApplicationContext(),0,i,0);

               SmsManager sms=SmsManager.getDefault();
                sms.sendTextMessage(no.getText().toString(),null,msg.getText().toString(),pi,null);
                Toast.makeText(MainActivity.this, "Message Sent Successfully......", Toast.LENGTH_LONG).show();
            }
        });
    }
    public boolean OnCreateOptionsMenu(Menu m){
        getMenuInflater().inflate(R.menu.activity_main,m);
        return true;
    }
}