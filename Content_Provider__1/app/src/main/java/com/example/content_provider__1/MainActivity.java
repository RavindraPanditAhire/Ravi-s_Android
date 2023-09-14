package com.example.content_provider__1;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.annotation.SuppressLint;
import android.content.ContentResolver;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnGetContactPressed(View v){

    }
    private void getPhoneContact(){
        if (ContextCompat.checkSelfPermission(this,Manifest.permission.DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION)!=PackageManager.PERMISSION_GRANTED){
            ActivityCompat.requestPermissions(this,new String[]{Manifest.permission.DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION},0);
    }
        ContentResolver conres=getContentResolver();
        Uri uri= ContactsContract.CommonDataKinds.Phone.CONTENT_URI;
        Cursor curs= null;
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            curs = conres.query(uri,null,null,null);
        }
        Log.i("CONTACT_PROVIDER_DEMO","TOTAL # of Contacts:::"+curs.getCount());
        if (curs.getCount()>0){
            while (curs.moveToNext()) {
                @SuppressLint("Range") String contactName=curs.getString(curs.getColumnIndex(ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME));
                @SuppressLint("Range") String contactNumber=curs.getString(curs.getColumnIndex(ContactsContract.CommonDataKinds.Phone.NUMBER));
                Log.i("CONTACT_PROVIDER_DEMO","contactName:: "+contactName+"phone Number:: "+contactNumber);
            }
            }
        }
}