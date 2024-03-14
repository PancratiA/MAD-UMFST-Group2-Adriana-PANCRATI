package com.example.activitiesapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Button btnN=findViewById(R.id.buttonNext);
        btnN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(MainActivity2.this,MainActivity3.class);
                startActivity(intent);
            }
        });
        Button btnB=findViewById(R.id.buttonBack);
        btnB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(MainActivity2.this,MainActivity.class);
                startActivity(intent);
            }
        });

        Button btnEmail=findViewById(R.id.buttonE);
        btnEmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText editTextEmail = findViewById(R.id.editTextTextEmailAddress);
                String emailAddress = editTextEmail.getText().toString();


                if (!emailAddress.isEmpty()) {

                    Intent emailIntent = new Intent(Intent.ACTION_SENDTO);
                    emailIntent.setData(Uri.parse("mailto:" + emailAddress));


                  //  emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Meeting Request");
                  //  emailIntent.putExtra(Intent.EXTRA_TEXT, "I would like to schedule a meeting in the near future, could you please write me back with an appropriate time. Thanks!");
                    startActivity(emailIntent);

                }
            }
        });
    }
}