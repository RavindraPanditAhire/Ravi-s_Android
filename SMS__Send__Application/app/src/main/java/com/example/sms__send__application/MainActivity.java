package com.example.sms__send__application;

import android.Manifest;
import android.annotation.SuppressLint;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

public class MainActivity extends AppCompatActivity {

    EditText contact,message;
    Button send;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        contact=findViewById(R.id.mobtextView);
        message=findViewById(R.id.messagetextView);
        send=findViewById(R.id.sendbutton);

        if(ContextCompat.checkSelfPermission(MainActivity.this, Manifest.permission.READ_CONTACTS)!= PackageManager.PERMISSION_GRANTED){
            ActivityCompat.requestPermissions((MainActivity.this),new String[]{Manifest.permission.READ_CONTACTS},100);
        }
        send.setOnClickListener(v -> {
            try {
                String phoneno=contact.getText().toString();
                String msg=message.getText().toString();
                SmsManager smsManager=SmsManager.getDefault();
                smsManager.sendTextMessage(null,null,null,null,null);
                Toast.makeText(MainActivity.this, "SMS sent Successfully....", Toast.LENGTH_LONG).show();
            }
            catch (Exception e){
                Toast.makeText(MainActivity.this, "Sms Failed to send..", Toast.LENGTH_LONG).show();
            }
        });

    }
}