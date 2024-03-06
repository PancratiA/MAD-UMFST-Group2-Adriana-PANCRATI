package com.example.book;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.view.View;
import android.widget.Button;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FragmentManager fragmentManager = getSupportFragmentManager();
        getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainerView
                        , FragmentMain.class, null).setReorderingAllowed(true)
                .addToBackStack("name").commit();
        Button btnC1 = findViewById(R.id.buttonChapter1);
        btnC1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainerView
                                , FragmentChapter1.class, null).setReorderingAllowed(true)
                        .addToBackStack("name").commit();
            }
        });
        Button btnC2 = findViewById(R.id.buttonChapter2);
        btnC2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainerView
                                , FragmentChapter2.class, null).setReorderingAllowed(true)
                        .addToBackStack("name").commit();
            }
        });
        Button btnC3 = findViewById(R.id.buttonChapter3);
        btnC3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainerView
                                , FragmentChapter3.class, null).setReorderingAllowed(true)
                        .addToBackStack("name").commit();
            }
        });
        Button btnC4 = findViewById(R.id.buttonChapter4);
        btnC4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainerView
                                , FragmentChapter4.class, null).setReorderingAllowed(true)
                        .addToBackStack("name").commit();
            }
        });
    }
}
