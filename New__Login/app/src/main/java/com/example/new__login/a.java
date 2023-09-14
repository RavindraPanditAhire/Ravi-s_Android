package com.example.new__login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Toast;

public class a extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a);

        onCreateView(new View.OnHoverListener(){
            @Override
            public boolean onHover(View v, MotionEvent event) {
                return false;
            }
        });
    }

    private void onCreateView(View.OnHoverListener onHoverListener) {
        Toast.makeText(this, "This is About Ravindra...", Toast.LENGTH_SHORT).show();
    }
}