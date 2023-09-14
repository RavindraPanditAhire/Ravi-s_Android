package com.example.email__send;


import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {

    Button send;
    EditText to, cc, sub, mess;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        send = findViewById(R.id.sendEmail);
        to = findViewById(R.id.TOtext);
        cc = findViewById(R.id.CCtext);
        sub = findViewById(R.id.SUBJECTtext);
        mess = findViewById(R.id.MESSAGEtext);




    if(to.getText().toString().equals(" ")||mess.getText().toString().equals(" ")){
        send.setActivated(false);
    }
    else
    {
        send.setActivated(true);
    }
        send.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("IntentReset")
            @Override
            public void onClick(View v) {
                Log.i("Send email", "");
                Intent emailIntent = new Intent(Intent.ACTION_SEND);

                emailIntent.setData(Uri.parse(to.getText().toString()));
                emailIntent.setType("text/plain");
                emailIntent.putExtra(Intent.EXTRA_EMAIL, to.getText().toString());
                emailIntent.putExtra(Intent.EXTRA_CC, cc.getText().toString());
                emailIntent.putExtra(Intent.EXTRA_SUBJECT, sub.getText().toString());
                emailIntent.putExtra(Intent.EXTRA_TEXT, mess.getText().toString());

                try {
                    startActivity(Intent.createChooser(emailIntent, "Send mail..."));
                    finish();
                    Log.i("Finished sending email...", "");

                } catch (android.content.ActivityNotFoundException ex) {
                    Toast.makeText(MainActivity.this, "There is no email client installed.", Toast.LENGTH_SHORT).show();

                }
            }
        });
}
}