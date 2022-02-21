package com.aravind.gpstracking;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class Splash extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        logo logo1 = new logo();
        logo1.start();
    }
    class logo extends Thread
    {
        public void run()
        {
            try {
                sleep(2000);
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
            Intent intent = new Intent(Splash.this,MainActivity.class);
            startActivity(intent);
            Splash.this.finish();
        }
    }
}


