package com.bhf.app.bhfapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    String[] donateList = {"hello","world","harvey"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ArrayAdapter adapter = new ArrayAdapter<>(this, R.layout.activity_listview, donateList);

        //ListView listView = (ListView) findViewById(R.id.donateList);
        //listView.setAdapter(adapter);
    }

    protected void openReferencePage(View view){

        Intent intent = new Intent(MainActivity.this, Reference.class);
    }

}
