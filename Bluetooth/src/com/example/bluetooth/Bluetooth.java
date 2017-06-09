package com.example.bluetooth;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.Window;
import android.view.WindowManager;
 
public class Bluetooth extends Activity {
 

    /**
     * This is the time set for splash screen. 
     */
    private static int SPLASH_TIME_OUT = 3000;
 
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i("TAg", "B4 initialization");
        //setContentView(R.layout.activity_splash_screen);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splash_screen);

        Log.i("TAg", "B4 initialization");

        new Handler().postDelayed(new Runnable() {
 
            @Override
            public void run() {
              Intent i = new Intent(Bluetooth.this,  SecondActivity.class);
                startActivity(i);
                /* close this activity    */
                finish();
            }
        }, SPLASH_TIME_OUT);
    }
    @Override
    public void onConfigurationChanged(Configuration newConfig) {
    	// TODO Auto-generated method stub
    	super.onConfigurationChanged(newConfig);
    }
    
}