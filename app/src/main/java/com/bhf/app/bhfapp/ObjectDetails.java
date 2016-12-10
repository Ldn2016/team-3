package com.bhf.app.bhfapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class ObjectDetails extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_object_details);

        Intent intent = getIntent();

        AddItem item = (AddItem) intent.getParcelableExtra("");

        TextView ref = new TextView(this);
        ref.setTextSize(40);
        ref.setText(item.getRefNumber());

        TextView objectName = new TextView(this);
        ref.setTextSize(40);
        ref.setText(item.getObject());

        TextView status = new TextView(this);
        ref.setTextSize(35);
        ref.setText(item.getStatus()); //

        TextView points = new TextView(this);
        ref.setTextSize(35);
        ref.setText(item.getPoints());

        TextView date = new TextView(this);
        ref.setTextSize(35);
        ref.setText((CharSequence) item.getCurrentDate());
    }

}