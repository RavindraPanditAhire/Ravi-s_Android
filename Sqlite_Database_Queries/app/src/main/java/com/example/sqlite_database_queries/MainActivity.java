package com.example.sqlite_database_queries;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText cid,cname,cmob,caddress,cpin,searchid;
    Button Insert,Search;
    SQLiteDatabase sqlobj;
    String cid1,cname2,cmob3,caddress4,cpin5,query;
    @SuppressLint({"WrongViewCast", "MissingInflatedId"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cid=findViewById(R.id.IDtextView);
        cname=findViewById(R.id.NametextView);
        cmob=findViewById(R.id.MobiletextView);
        caddress=findViewById(R.id.AddresstextView);
        cpin=findViewById(R.id.PintextView);


        Insert=findViewById(R.id.Insertbutton);
        Search=findViewById(R.id.Searchtbutton);


        //Inserting Data Module>>>>>>>>>>>>>>>>>
        Insert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sqlobj=openOrCreateDatabase("AndroidJson", Context.MODE_PRIVATE,null);
                sqlobj.execSQL("CREATE TABLE IF NOT EXISTS AndroidJsonTable(id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,cid VARCHAR,name VARCHAR,mobile VARCHAR,address VARCHAR,pincode VARCHAR);");

                cid1=cid.getText().toString();
                cname2=cname.getText().toString();
                cmob3=cmob.getText().toString();
                caddress4=caddress.getText().toString();
                cpin5=cpin.getText().toString();
                query="insert into AndroidJsonTable values('+cid1+','+cname2+','+cmob3+','+caddress4+','+cpin5+');";
                sqlobj.execSQL(query);

                Toast.makeText(MainActivity.this, "Data Inserted SUCCESSFULLY....", Toast.LENGTH_LONG).show();
            }
        });

        //Getting Module>>>>>>>>>>>>>>>>>>>>

        Search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                searchid=findViewById(R.id.SearchtextView);
                @SuppressLint("Recycle") Cursor cursor=sqlobj.rawQuery("select * from AndroidJsonTable where cid1="+searchid+"",null);

                StringBuffer buffer=new StringBuffer();
                while(cursor.moveToNext()){
                    String cid= cursor.getString(1);
                    String cname= cursor.getString(2);
                    String cmob= cursor.getString(3);
                    String cadd= cursor.getString(4);
                    String cpin= cursor.getString(5);

                    buffer.append(cid+" "+cname+" "+cmob+" "+cadd+" "+cpin+"\n");
                    Toast.makeText(MainActivity.this, "buffer", Toast.LENGTH_LONG).show();
                }


            }
        });


    }
}