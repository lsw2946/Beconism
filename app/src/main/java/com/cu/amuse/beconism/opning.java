package com.cu.amuse.beconism;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

public class opning extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.openningactivity);

        Handler hd = new Handler();
        hd.postDelayed(new Runnable(){

            @Override
            public void run(){
            finish();
            }
        },3000);
        }
}
