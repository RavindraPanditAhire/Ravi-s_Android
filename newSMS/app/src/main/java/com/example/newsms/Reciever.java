package com.example.newsms;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.telephony.SmsMessage;
import android.widget.Toast;

public class Reciever extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Bundle bundle=intent.getExtras();
        String str;
        if(bundle != null){
           Object[] sms= (Object[]) bundle.get("pdus");
           for (int i=0;i<sms.length;i++){
               SmsMessage smsMessage=SmsMessage.createFromPdu((byte[]) sms[i]);
               String add=smsMessage.getDisplayOriginatingAddress();
               String MEss=smsMessage.getMessageBody();
               Toast.makeText(context, "From: "+add+"\nMessage: "+MEss, Toast.LENGTH_SHORT).show();
           }
        }
        Toast.makeText(context, "str", Toast.LENGTH_SHORT).show();
    }


}
