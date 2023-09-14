package com.example.image__change__2;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.TimePicker;

public class MainActivity extends AppCompatActivity {

    Button nextbtn;
    ImageView imgs;
    TextView imgname,datetimesaver;

    DatePicker datePicker;
    TimePicker timePicker;
    int count;
    @SuppressLint({"MissingInflatedId"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nextbtn=findViewById(R.id.button);
        imgname=findViewById(R.id.imagename);
        datetimesaver=findViewById(R.id.dateTimeSaver);
        imgs=findViewById(R.id.imageView);
        timePicker=findViewById(R.id.timePicker1);
        datePicker=findViewById(R.id.datePicker1);

        datetimesaver.append("date is: "+Integer.toString(datePicker.getYear()+datePicker.getMonth()+datePicker.getDayOfMonth())+
                "\n Time: "+Integer.toString(timePicker.getHour()+timePicker.getMinute()));

        timePicker.setIs24HourView(true);
        String [] name={"FACEBOOK LOGO","INSTAGRAM LOGO","SANDIP FOUNDATION LOGO","TWITTER LOGO","WHATSAPP LOGO"};
        int []img={R.drawable.facebook__logo,
                   R.drawable.insta__logo,
                   R.drawable.sandipfoundation_logo,
                   R.drawable.twitter__logo,
                   R.drawable.whatsapp__logo};

        nextbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count++;
                count=count%img.length;
                imgs.setImageResource(img[count]);
                imgname.setText(name[count]);

            }
        });

    }
}