package com.example.media__player1;
import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity{

    Button click;
    public void OnCreate(Bundle save){
        super.onCreate(save);
        setContentView(R.layout.activity_main);

        click=findViewById(R.id.enter);
        click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent i=new Intent(MainActivity.this,quate__display.class);
//                startActivity(i);
            }
        });

    }
}
