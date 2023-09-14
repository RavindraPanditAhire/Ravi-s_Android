package com.example.newsms;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.annotation.SuppressLint;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.security.Provider;

public class MainActivity extends AppCompatActivity {

    Button snd;
    EditText e1,e2;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        e1=findViewById(R.id.e1);
        e2=findViewById(R.id.editTextTextMultiLine);
        snd=findViewById(R.id.button);

        snd.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                if(ContextCompat.checkSelfPermission(MainActivity.this,android.Manifest.permission.SEND_SMS)!=
                        PackageManager.PERMISSION_GRANTED){
                    ActivityCompat.requestPermissions(MainActivity.this,new String[]{android.Manifest.permission.SEND_SMS},100);

                    try {
                        String phn=e1.getText().toString();
                        String mess=e2.getText().toString();

                        SmsManager smsManager=SmsManager.getDefault();
                        smsManager.sendTextMessage(phn,null,mess,null,null);
                    }
                    catch (Exception e){
                        Log.d("lifecycle","Error: "+e);
                    }

                }
            }
        });
    }
}