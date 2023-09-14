package com.example.calling_pad;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private Button button;
    EditText num;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button) findViewById(R.id.buttonCall);
        num = findViewById(R.id.editText1);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Call();
            }
        });
    }

    private void Call() {
        EditText e = (EditText) findViewById(R.id.editText1);
        Toast.makeText(this, "clicked", Toast.LENGTH_LONG)
                .show();
        Uri u = Uri.parse("tel:" + e.getText().toString());
        Intent i = new Intent(Intent.ACTION_DIAL, u);
        try {
            startActivity(i);
        } catch (SecurityException s) {
            Toast.makeText(this, "An error occurred", Toast.LENGTH_LONG)
                    .show();


        }
    }
}
