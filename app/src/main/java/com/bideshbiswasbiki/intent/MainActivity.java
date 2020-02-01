package com.bideshbiswasbiki.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button bt1,bt2,bt3,bt4,bt5,bt6,bt7,bt8, aboutBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bt1=findViewById(R.id.b1);
        bt2=findViewById(R.id.b2);
        bt3=findViewById(R.id.b3);
        bt4=findViewById(R.id.b4);
        bt5=findViewById(R.id.b5);
        bt6=findViewById(R.id.b6);
        bt7=findViewById(R.id.b7);
        bt8=findViewById(R.id.b8);
        aboutBtn=findViewById(R.id.aboutBtn);

        aboutBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,AboutActivity.class);
                startActivity(i);
            }
        });

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,p1.class);
                startActivity(i);
            }
        });

        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,p2.class);
                startActivity(i);
            }
        });

        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,p3.class);
                startActivity(i);
            }
        });

        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,p4.class);
                startActivity(i);
            }
        });

        bt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,p5.class);
                startActivity(i);
            }
        });

        bt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,p6.class);
                startActivity(i);
            }
        });

        bt7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,p7.class);
                startActivity(i);
            }
        });

        bt8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,p8.class);
                startActivity(i);
            }
        });
    }
}
