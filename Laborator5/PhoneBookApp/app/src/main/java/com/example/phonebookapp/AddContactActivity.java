package com.example.phonebookapp;
import com.example.phonebookapp.Contacts;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class AddContactActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_contact);
        Button addButton = findViewById(R.id.buttonAdd);
        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = ((EditText) findViewById(R.id.editTextText)).getText().toString();
                String surname = ((EditText) findViewById(R.id.editTextText2)).getText().toString();
                String address = ((EditText) findViewById(R.id.editTextText3)).getText().toString();
                String number = ((EditText) findViewById(R.id.editTextPhone)).getText().toString();
                String email = ((EditText) findViewById(R.id.editTextTextEmailAddress)).getText().toString();


                if (!name.isEmpty() && !number.isEmpty()) {
                    Contacts contact = new Contacts(name, surname, address, email, null, number);
                    Intent intent = new Intent();
                    intent.putExtra("contact", contact);
                    setResult(RESULT_OK, intent);
                    finish();
                } else {
                    EditText n = findViewById(R.id.editTextText);
                    n.setError("Missing");
                    EditText nr = findViewById(R.id.editTextPhone);
                    nr.setError("Missing");
                }
            }
        });


    }

}