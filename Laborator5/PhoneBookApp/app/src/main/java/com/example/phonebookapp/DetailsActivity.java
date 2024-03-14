package com.example.phonebookapp;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class DetailsActivity extends AppCompatActivity {

    private static final int PICK_IMAGE_REQUEST = 2;
    private ImageView imageViewContact;
    private Uri imageUri;
    EditText editTextName;
    EditText editTextSurname;
    EditText editTextAddress;
    EditText editTextPhone;
    EditText editTextEmail;
    Contacts contact;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        editTextName = findViewById(R.id.editTextName);
        editTextSurname = findViewById(R.id.editTextSurname);
        editTextAddress = findViewById(R.id.editTextAdress);
        editTextPhone = findViewById(R.id.editTextPhone2);
        editTextEmail = findViewById(R.id.editTextText7);
        int contactIndex = getIntent().getIntExtra("contactIndex", -1);
        contact = (Contacts) getIntent().getSerializableExtra("contact");

        editTextName.setText(contact.getName());
        editTextSurname.setText(contact.getSurname());
        editTextAddress.setText(contact.getAddress());
        editTextPhone.setText(contact.getNumber());
        editTextEmail.setText(contact.getEmail());

        imageViewContact = findViewById(R.id.imageView2);
        if (contact.getImageUri() != null) {
            imageViewContact.setImageURI(contact.getImageUri());
        }
        imageViewContact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setType("image/*");
                intent.setAction(Intent.ACTION_GET_CONTENT);
                startActivityForResult(intent, PICK_IMAGE_REQUEST);
            }
        });

        Button buttonCall = findViewById(R.id.buttonCall);
        buttonCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String phoneNumber = editTextPhone.getText().toString();
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + phoneNumber));
                startActivity(intent);
            }
        });

        Button buttonBack = findViewById(R.id.buttonBack);
        buttonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (contact != null && contactIndex != -1) {
                    contact.setName(editTextName.getText().toString());
                    contact.setSurname(editTextSurname.getText().toString());
                    contact.setAddress(editTextAddress.getText().toString());
                    contact.setNumber(editTextPhone.getText().toString());
                    contact.setEmail(editTextEmail.getText().toString());
                    Intent intent = new Intent();
                    intent.putExtra("updatedContact", contact);
                    intent.putExtra("contactIndex", contactIndex);
                    setResult(RESULT_OK, intent);
                    finish();
                }
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == PICK_IMAGE_REQUEST && resultCode == RESULT_OK && data != null && data.getData() != null) {
            imageUri = data.getData();
            imageViewContact.setImageURI(imageUri);
            /* contact.setImageUri(imageUri);*/
        }
    }
}
