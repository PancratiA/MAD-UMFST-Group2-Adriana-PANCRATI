package com.example.simplecalc;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import android.os.Bundle;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    EditText textNr1;
    EditText textNr2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        TextView txtRezultat=findViewById(R.id.textRezultat);
         textNr1 =  findViewById(R.id.editTextNumber1);
         textNr2 = findViewById(R.id.editTextNumber2);
        Button btnAdd = findViewById(R.id.buttonAdd);
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!isEmptyText()) {
                    int nr1 = Integer.parseInt(textNr1.getText().toString());
                    int nr2 = Integer.parseInt(textNr2.getText().toString());
                    txtRezultat.setText(String.valueOf(nr1 + nr2));
                }
                else   txtRezultat.setText("Rezultat invalid.");
            }
        });
        Button btnSub=findViewById(R.id.buttonSub);
        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!isEmptyText()){
                    int nr1 = Integer.parseInt(textNr1.getText().toString());
                    int nr2 = Integer.parseInt(textNr2.getText().toString());
                    txtRezultat.setText(String.valueOf(nr1 - nr2));
                }
                else   txtRezultat.setText("Rezultat invalid.");
            }
        });
        Button btnMul = findViewById((R.id.buttonMul));
        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!isEmptyText()){
                int nr1 = Integer.parseInt(textNr1.getText().toString());
                int nr2 = Integer.parseInt(textNr2.getText().toString());
                txtRezultat.setText(String.valueOf(nr1 * nr2));}
                else txtRezultat.setText("Rezultat invalid.");
            }
        });
        Button btnDiv = findViewById((R.id.buttonDiv));
        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!isEmptyText()){
                int nr1 = Integer.parseInt(textNr1.getText().toString());
                int nr2 = Integer.parseInt(textNr2.getText().toString());
                   if(nr2!=0)
                       txtRezultat.setText(String.valueOf((double) nr1 / nr2));
                   else{ textNr2.setError("Impartirea cu 0 nu are sens.");
                       txtRezultat.setText("Rezultat invalid.");}}
                else txtRezultat.setText("Rezultat invalid.");
            }
        });
    }

    private boolean isEmptyText() {
        String strNr1 = textNr1.getText().toString();
        String strNr2 = textNr2.getText().toString();
        int cnt=0;

        if (strNr1.isEmpty()) {
            textNr1.setError("Introduceti va rog text.");
            cnt++;


        }

        if (strNr2.isEmpty()) {
            textNr2.setError("Introduceti va rog text.");
            cnt++;
        }
        if(cnt!=0) return true;

        return false;
    }
}
