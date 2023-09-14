package com.example.check_box__pricing__;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    CheckBox c1,c2,c3;
    Button b1;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        c1=findViewById(R.id.pizzaa);
        c2=findViewById(R.id.coffee);
        c3=findViewById(R.id.burger);
        b1=findViewById(R.id.button);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(c1.isChecked() &&(!c2.isChecked())&&(!c3.isChecked())){
                    Toast.makeText(MainActivity.this, "Selected Items: "+c1.getText().toString()+" 100 Rps. Total: 100  Thanks....", Toast.LENGTH_LONG).show();
                }
                else if(c2.isChecked()&&(!c1.isChecked())&&(!c3.isChecked())){
                    Toast.makeText(MainActivity.this, "Selected Items: "+c2.getText().toString()+" 50 Rps. Total: 50  Thanks....", Toast.LENGTH_LONG).show();
                }
                else if(c3.isChecked()&&(!c1.isChecked())&&(!c2.isChecked())){
                    Toast.makeText(MainActivity.this, "Selected Items: "+c3.getText().toString()+" 120 Rps. Total: 50  Thanks....", Toast.LENGTH_LONG).show();
                }
                else if (c1.isChecked()&&c2.isChecked()&&(!c3.isChecked())) {
                    Toast.makeText(MainActivity.this, "Selected Items: "+c1.getText().toString()+" 120Rps. and "+c2.getText().toString()+" 50 Rps. Total: 170Rps THANKS.....", Toast.LENGTH_LONG).show();
                }
                else if (c1.isChecked()&&c3.isChecked()&&(!c2.isChecked())) {
                    Toast.makeText(MainActivity.this, "Selected Items: "+c1.getText().toString()+" 120Rps. and "+c3.getText().toString()+" 70 Rps. Total: 190Rps THANKS.....", Toast.LENGTH_LONG).show();

                }
                else if (c2.isChecked()&&c3.isChecked()&&(!c1.isChecked())) {
                    Toast.makeText(MainActivity.this, "Selected Items: "+c2.getText().toString()+" 50Rps. and "+c3.getText().toString()+" 70 Rps. Total: 120Rps THANKS.....", Toast.LENGTH_LONG).show();

                }
                else if (c1.isChecked()&&c2.isChecked()&&c3.isChecked()){
                    Toast.makeText(MainActivity.this, "Selected Items: "+c1.getText().toString()+" 100Rps. and "+c2.getText().toString()+" 50Rps. and "+c3.getText().toString()+" 70 Rps. Total: 220Rps THANKS.....", Toast.LENGTH_SHORT).show();

                }
                else{
                    Toast.makeText(MainActivity.this, "SOMETHING WENT WRONG....", Toast.LENGTH_SHORT).show();
                }
            }

        });



    }
}