package com.example.labo4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView mEdi1, mEdi2, mEdi3, mEdi4, mEdi5, mEdi6, mEdi7, mEdi8, mEdi9;
    private EditText m1, m2;
    private Button mButton;
    int pila1;
    int pila2;
    int pila3;
    int pila4;
    int pila5;
    int pila6;
    int pila7;
    int pila8;
    int pila9;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mEdi1 = findViewById(R.id.tx1);
        mEdi2 = findViewById(R.id.tx2);
        mEdi3 = findViewById(R.id.tx3);
        mEdi4 = findViewById(R.id.tx4);
        mEdi5 = findViewById(R.id.tx5);
        mEdi6 = findViewById(R.id.tx6);
        mEdi7 = findViewById(R.id.tx7);
        mEdi8 = findViewById(R.id.tx8);
        mEdi9 = findViewById(R.id.tx9);
        m1 = findViewById(R.id.ediuser);
        m2 = findViewById(R.id.ediemail);
        mButton =findViewById(R.id.btnsend);

        mEdi1.setOnClickListener(v ->{
            mEdi1.setText("Producto #"+ String.valueOf(pila1++));
        });
        mEdi2.setOnClickListener(v ->{
            mEdi2.setText("Producto #"+ String.valueOf(pila2++));
        });
        mEdi3.setOnClickListener(v ->{
            mEdi3.setText("Producto #"+ String.valueOf(pila3++));
        });
        mEdi4.setOnClickListener(v ->{
            mEdi4.setText("Producto #"+ String.valueOf(pila4++));
        });
        mEdi5.setOnClickListener(v ->{
            mEdi5.setText("Producto #"+ String.valueOf(pila5++));
        });
        mEdi6.setOnClickListener(v ->{
            mEdi6.setText("Producto #"+ String.valueOf(pila6++));
        });
        mEdi7.setOnClickListener(v ->{
            mEdi7.setText("Producto #"+ String.valueOf(pila7++));
        });
        mEdi8.setOnClickListener(v ->{
            mEdi8.setText("Producto #"+ String.valueOf(pila8++));
        });
        mEdi9.setOnClickListener(v ->{
            mEdi9.setText("Producto #"+ String.valueOf(pila9++));
        });


        mButton.setOnClickListener(v ->{
            String user = m1.getText().toString();
            String email = m2.getText().toString();
            String cont1 = mEdi1.getText().toString();
            String cont2 = mEdi2.getText().toString();
            String cont3 = mEdi3.getText().toString();
            String cont4 = mEdi4.getText().toString();
            String cont5 = mEdi5.getText().toString();
            String cont6 = mEdi6.getText().toString();
            String cont7 = mEdi7.getText().toString();
            String cont8 = mEdi8.getText().toString();
            String cont9 = mEdi9.getText().toString();

            Intent mIntent = new Intent(this, Main2Activity.class);
            mIntent.putExtra("key1", user);
            mIntent.putExtra("key2",email);

            mIntent.putExtra("key3", cont1);
            mIntent.putExtra("key4",cont2);
            mIntent.putExtra("key5", cont3);
            mIntent.putExtra("key6",cont4);
            mIntent.putExtra("key7", cont5);
            mIntent.putExtra("key8",cont6);
            mIntent.putExtra("key9", cont7);
            mIntent.putExtra("key10",cont8);
            mIntent.putExtra("key11", cont9);


            startActivity(mIntent);

        });




    }
}
