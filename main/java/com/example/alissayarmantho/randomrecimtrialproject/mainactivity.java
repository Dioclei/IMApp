package com.example.alissayarmantho.randomrecimtrialproject;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class mainactivity extends AppCompatActivity {
    Button send;
    EditText textboxforsending;
    TextView postedmessages;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.mainactivity);
        //addListenerOnButton();
        send = (Button) findViewById(R.id.send) ;
        textboxforsending = (EditText) findViewById(R.id.textboxforsending);
        postedmessages = (TextView) findViewById(R.id.postedmessages);
    }


        }
