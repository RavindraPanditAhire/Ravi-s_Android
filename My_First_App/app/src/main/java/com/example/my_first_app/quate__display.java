package com.example.my_first_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class quate__display extends AppCompatActivity {

    ImageButton click;
    TextView message;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quate_display);

        click=findViewById(R.id.quateimg);
        message=findViewById(R.id.textView);
        click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String mess=message.getText().toString();
                Intent i=new Intent(Intent.ACTION_SEND, Uri.parse(mess));
                startActivity(i);
            }
        });

    }
}