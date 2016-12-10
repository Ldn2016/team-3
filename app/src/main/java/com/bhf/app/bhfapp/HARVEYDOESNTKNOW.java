package com.bhf.app.bhfapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class HARVEYDOESNTKNOW extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_harveydoesntknow);
        Intent intent = getIntent();
        String refKey = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
    }
}
