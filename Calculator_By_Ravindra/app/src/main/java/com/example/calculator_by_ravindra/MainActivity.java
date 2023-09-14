package com.example.calculator_by_ravindra;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

   EditText firval,secval,res;
   Button add,sub,mul,div,mod;
    @SuppressLint({"MissingInflatedId", "WrongViewCast"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       firval=findViewById(R.id.editTextNumber1);
       secval=findViewById(R.id.editTextNumber2);

       res=findViewById(R.id.txtres);

       add=findViewById(R.id.btnadd);
       sub=findViewById(R.id.btnsub);
       div=findViewById(R.id.btndiv);
       mul=findViewById(R.id.btnmul);
       mod=findViewById(R.id.btnmod);

       add.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               int a1,a2,ans;
               a1=Integer.parseInt(firval.getText().toString());
               a2=Integer.parseInt(secval.getText().toString());
               ans=a1+a2;
               res.setText("Answer is: "+ ans);
           }
       });
       sub.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               int a1,a2,ans;
               a1=Integer.parseInt(firval.getText().toString());
               a2=Integer.parseInt(secval.getText().toString());
               ans=a1-a2;
               res.setText("Answer is: "+ ans);
           }
       });
       mul.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               int a1,a2,ans;
               a1=Integer.parseInt(firval.getText().toString());
               a2=Integer.parseInt(secval.getText().toString());
               ans=a1*a2;
               res.setText("Answer is: "+ ans);
           }
       });
       div.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               int a1,a2,ans;
               a1=Integer.parseInt(firval.getText().toString());
               a2=Integer.parseInt(secval.getText().toString());
               ans=a1/a2;
               res.setText("Answer is: "+ ans);
           }
       });
       mod.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               int a1,a2,ans;
               a1=Integer.parseInt(firval.getText().toString());
               a2=Integer.parseInt(secval.getText().toString());
               ans=a1%a2;
               res.setText("Answer is: "+ ans);
           }
       });
    }

}