package com.example.labo4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {


    private TextView txv1,txv2, tx1, tx2, tx3, tx4, tx5, tx6, tx7, tx8, tx9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        txv1 = findViewById(R.id.lleganame);
        txv2 = findViewById(R.id.llegamail);

        tx1 = findViewById(R.id.tx1);
        tx2 = findViewById(R.id.tx2);
        tx3 = findViewById(R.id.tx3);
        tx4 = findViewById(R.id.tx4);
        tx5 = findViewById(R.id.tx5);
        tx6 = findViewById(R.id.tx6);
        tx7 = findViewById(R.id.tx7);
        tx8 = findViewById(R.id.tx8);
        tx9 = findViewById(R.id.tx9);



        Intent mIntent = getIntent();
        if (mIntent!=null){
            txv1.setText(mIntent.getStringExtra("key1"));
            txv2.setText(mIntent.getStringExtra("key2"));

            tx1.setText(mIntent.getStringExtra("key3"));
            tx2.setText(mIntent.getStringExtra("key4"));
            tx3.setText(mIntent.getStringExtra("key5"));
            tx4.setText(mIntent.getStringExtra("key6"));
            tx5.setText(mIntent.getStringExtra("key7"));
            tx6.setText(mIntent.getStringExtra("key8"));
            tx7.setText(mIntent.getStringExtra("key9"));
            tx8.setText(mIntent.getStringExtra("key10"));
            tx9.setText(mIntent.getStringExtra("key11"));




        }
    }
}
