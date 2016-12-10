package com.bhf.app.bhfapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

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


        ArrayList<String> attributeList = new ArrayList<>();
        attributeList.add("Rerefence Number: "+item.getRefNumber());
        attributeList.add("Name: "+item.getObject());
        attributeList.add("Status: "+((item.getStatus()) ? "Sold":"Pending"));
        attributeList.add("Points: "+Integer.toString(item.getPoints()));
        attributeList.add("Date: "+item.getCurrentDate().toString());






        ArrayAdapter adapter = new ArrayAdapter<>(this, R.layout.activity_listview, attributeList);

        ListView listView = (ListView) findViewById(R.id.item_list_object_details);
        listView.setAdapter(adapter);
    }

}
