package com.example.practicebyravi;

import android.annotation.SuppressLint;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

public class MainActivity extends AppCompatActivity {

    Button snd;
    EditText to,msg;

    @SuppressLint("MissingInflatedId")
    protected void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_main);

        to=findViewById(R.id.editTextTextPersonName);
        msg=findViewById(R.id.editTextTextMultiLine);
        snd=findViewById(R.id.button);

        if(ContextCompat.checkSelfPermission(MainActivity.this,android.Manifest.permission.SEND_SMS)!=
                PackageManager.PERMISSION_GRANTED){
            ActivityCompat.requestPermissions(MainActivity.this,new String[]{android.Manifest.permission.SEND_SMS},100);
        }

        snd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String phn=to.getText().toString();
                String message=msg.getText().toString();

                try {
                    SmsManager smsManager=SmsManager.getDefault();
                    smsManager.sendTextMessage(phn,null,message,null,null);
                    Toast.makeText(MainActivity.this, "SMS Send Seccessfully....", Toast.LENGTH_SHORT).show();
                }
                catch (Exception e){
                    Toast.makeText(MainActivity.this, "Failed to send SMS....\n"+e.getStackTrace(), Toast.LENGTH_SHORT).show();
                }

            }
        });

    }
}