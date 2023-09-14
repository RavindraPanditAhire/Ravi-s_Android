package com.example.newprogress;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.widget.ProgressBar;
import android.widget.TextView;
import java.lang.Runnable;

public class MainActivity extends AppCompatActivity {

    ProgressBar progressBar;
    TextView textView;
    int progressStatus=0;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        progressBar=findViewById(R.id.progressBar);
        textView=findViewById(R.id.textView);

        new Thread(new Runnable(){
            @Override
            public void run(){
                progressStatus+=1;
                while(progressStatus<200){
                    new Handler(Looper.getMainLooper(),post(new Runnable(){
                        @Override
                        public void run(){
                            progressBar.setProgress(100);
                            textView.setText("Prograss: "+progressStatus+"/"+progressBar.getMax());
                        }
                    }));
                }
            }

            private Handler.Callback post(Runnable runnable) {
                return null;
            }
        });
        try {
            Thread.sleep(20000);

        }
        catch (Exception e){
            e.getStackTrace();
        }


    }
}