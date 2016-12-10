package com.bhf.app.bhfapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ObjectDetails extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_object_details);

        Intent intent = getIntent();

        String refKey = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

//
        InternalDatabase internalDatabase = new InternalDatabase();
        ArrayList<AddItem> data = internalDatabase.getDatabase();
//        AddItem item = null;
//        for(AddItem datum:data){
//            if(datum.getRefNumber().equals(refKey)){
//                item = datum;
//            }
//        }
        AddItem item = data.get(0);

        TextView ref = new TextView(this);
        ref.setTextSize(40);
        ref.setText(item.getRefNumber());

        TextView objectName = new TextView(this);
        ref.setTextSize(40);
        ref.setText(item.getObject());

        TextView status = new TextView(this);
        ref.setTextSize(35);

        if (item.getStatus()) {
            ref.setText("Sold");
        }
        else {
            ref.setText("Pending");
        }

        TextView points = new TextView(this);
        ref.setTextSize(35);
        ref.setText(Integer.toString(item.getPoints()));

        TextView date = new TextView(this);
        ref.setTextSize(35);
        ref.setText(item.getCurrentDate().toString());
    }

}
