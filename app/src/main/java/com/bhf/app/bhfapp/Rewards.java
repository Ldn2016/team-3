package com.bhf.app.bhfapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import static com.bhf.app.bhfapp.InternalDatabase.donorScore;

public class Rewards extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_rewards);
    }

    private void makeVisible(){

    }
    Intent intent = getIntent();
}
