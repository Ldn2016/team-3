package com.bhf.app.bhfapp;


import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Reference extends AppCompatActivity {
    public final static String EXTRA_MESSAGE = "com.bhf.app.bhfapp.MESSAGE";
    private EditText refNum;
    public void buttonOnClick(View v){
        Button button = (Button) v;
        refNum = (EditText) findViewById(R.id.RefNum);

        System.out.println(""+refNum);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reference);
        System.out.println("Opened page!");
    }
    public void submitRef(View view){
        Intent intent = new Intent(this, HARVEYDOESNTKNOW.class);
        EditText editText = (EditText) findViewById(R.id.RefNum);
        String message = editText.getText().toString();
        if(message.length()==10){
            intent.putExtra(EXTRA_MESSAGE, message);
            startActivity(intent);
        }
        else{
            TextView errorMessage = new TextView(this);
            errorMessage.setTextSize(20);
            //String errorMessage = getString(R.string)
            errorMessage.setText(R.string.errorMessage);
            errorMessage.setY(580);
            errorMessage.setTextColor(Color.rgb(200,0,0));
            ViewGroup layout = (ViewGroup) findViewById(R.id.activity_reference);
            layout.addView(errorMessage);

        }

    }
}
