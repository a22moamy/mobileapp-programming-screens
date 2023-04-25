package com.example.screens;

import android.app.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;
import android.widget.TextView;


public class SecondActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        TextView namnRespons = findViewById(R.id.namnRespons);
        TextView emailRespons = findViewById(R.id.emailRespons);


        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String name = extras.getString("name");
            String email = extras.getString("email");

            namnRespons.setText(name);
            emailRespons.setText(email);
            // Do something with the name and number
        }



    }
}

