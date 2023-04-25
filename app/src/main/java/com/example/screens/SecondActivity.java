package com.example.screens;

import android.app.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;


public class SecondActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);


        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String name = extras.getString("name");
            String email = extras.getString("email");

            Log.d("SecondActivity", name);
            // Do something with the name and number
        }



    }
}

