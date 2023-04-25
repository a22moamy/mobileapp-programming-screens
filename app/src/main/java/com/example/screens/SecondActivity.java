package com.example.screens;

import android.app.Activity;

import android.os.Bundle;
import android.widget.TextView;


public class SecondActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        TextView namn = findViewById(R.id.namnRespons);

        TextView email = findViewById(R.id.emailRespons);

        namn.setText("Heyyy");

        email.setText("Hello everyone");

    }
}

