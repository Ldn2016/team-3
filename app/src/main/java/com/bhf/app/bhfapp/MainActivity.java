package com.bhf.app.bhfapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    public final static String EXTRA_MESSAGE = "com.bhf.app.bhfapp.MESSAGE";
    InternalDatabase internalDatabase;

//    AddReference addReference;
    

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        internalDatabase = new InternalDatabase();
//        addReference = new AddReference;
//        addreference.setMainDatabase(internalDatabase.d);

        ArrayList<AddItem> data = internalDatabase.getDatabase();
        String[] donateList = new String[data.size()];
        for(int i = 0; i < data.size(); i++){
            donateList[i] = data.get(i).getObject();
        }

        ArrayAdapter adapter = new ArrayAdapter<>(this, R.layout.activity_listview, donateList);

        ListView listView = (ListView) findViewById(R.id.item_list);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                String message = id+"";
                Toast.makeText(getBaseContext(),message,Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this, ObjectDetails.class);

                intent.putExtra(EXTRA_MESSAGE, message);
                startActivity(intent);
            }
        });

    }

    protected void openReferencePage(View view){
        Intent intent = new Intent(MainActivity.this, Reference.class);
        startActivity(intent);
    }

}

