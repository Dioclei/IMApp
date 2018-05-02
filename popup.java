package com.example.alissayarmantho.randomrecimtrialproject;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class popup extends AppCompatActivity {
    Button start;
    EditText nameid;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.popup);
        addListenerOnButton();

        nameid = (EditText) findViewById(R.id.nameid);
    }
    public void addListenerOnButton() {

        final Context context = this;

        start = (Button) findViewById(R.id.start) ;

        start.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, mainactivity.class);
                startActivity(intent);

            }

        });


    }

}
