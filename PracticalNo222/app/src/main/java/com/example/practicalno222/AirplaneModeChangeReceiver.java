package com.example.practicalno222;

import android.content.Context;
import android.content.Intent;
import android.provider.Settings;
import android.widget.Toast;

public class AirplaneModeChangeReceiver {


    public void onRecieve(Context context, Intent intent){
        if(isAirPlaneModeOn(context.getApplicationContext())){
            Toast.makeText(context, "Airplane Mode is ON............", Toast.LENGTH_SHORT).show();
        }
        else{
            Toast.makeText(context, "Airplane Mode is OFF............", Toast.LENGTH_SHORT).show();
        }
    }

    private boolean isAirPlaneModeOn(Context context) {
        return Settings.System.getInt(context.getContentResolver(),Settings.Global.AIRPLANE_MODE_ON,0)!=0;
    }


}
