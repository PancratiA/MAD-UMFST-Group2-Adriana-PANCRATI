package com.example.intentsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn1=findViewById(R.id.button1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(MainActivity.this,MainActivityButton1.class);
                startActivity(intent);
            }
        });

        Button btn2=findViewById(R.id.button2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               String url="https://google.com";
               Intent intent= new Intent(Intent.ACTION_VIEW);
               intent.setData(Uri.parse(url));
               startActivity(intent);
            }
        });
        Button btn3=findViewById(R.id.button3);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Intent intent= new Intent(Intent.ACTION_DIAL);
               intent.setData(Uri.parse("tel:0746233535"));
               startActivity(intent);
            }
        });
    }
}