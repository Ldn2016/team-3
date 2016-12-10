package com.bhf.app.bhfapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    String[] donateList = {"hello","world","harvey"};
    InternalDatabase internalDatabase;
    AddReference addReference;
    

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        internalDatabase = new InternalDataBase();
        addReference = new AddReference;
        addreference.setMainDatabase(internalDatabase.d);


        ArrayAdapter adapter = new ArrayAdapter<>(this, R.layout.activity_listview, donateList);

        ListView listView = (ListView) findViewById(R.id.item_list);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {

                Toast.makeText(getBaseContext(),"Test",Toast.LENGTH_SHORT).show();
            }
        });

    }

    protected void openReferencePage(View view){

        Intent intent = new Intent(MainActivity.this, Reference.class);
    }

}

