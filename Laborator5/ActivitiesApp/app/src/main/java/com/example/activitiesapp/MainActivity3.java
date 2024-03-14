package com.example.activitiesapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        Button btnN=findViewById(R.id.buttonNext);
        btnN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(MainActivity3.this,MainActivity.class);
                startActivity(intent);
            }
        });
        Button btnB=findViewById(R.id.buttonBack);
        btnB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(MainActivity3.this,MainActivity2.class);
                startActivity(intent);
            }
        });

        Button btnS=findViewById(R.id.buttonSettings);
        btnS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(android.provider.Settings.ACTION_SETTINGS);
                startActivity(intent);
            }
        });
    }
}