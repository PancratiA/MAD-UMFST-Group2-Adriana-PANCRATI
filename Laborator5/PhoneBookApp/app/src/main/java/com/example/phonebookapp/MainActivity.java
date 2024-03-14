package com.example.phonebookapp;
// MainActivity.java

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private static final int ADD_REQUEST = 1;
    private static final int EDIT_REQUEST = 2;

    private ArrayList<Contacts> contactsList = new ArrayList<>();
    private ImageView contactImageView;
    private int IndexContact = -1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn1 = findViewById(R.id.button);
        contactsList.add(new Contacts("Sebastian Vettel", "Vettel", "123 Main St", "seb@example.com", null, "123456789"));
        contactsList.add(new Contacts("Kimi Rai", "Rai", "456 Oak St", "iceman@example.com", null, "987654321"));
        displayContacts();
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AddContactActivity.class);
                startActivityForResult(intent, ADD_REQUEST);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == ADD_REQUEST && resultCode == RESULT_OK) {
            if (data != null && data.hasExtra("contact")) {
                Contacts contact = (Contacts) data.getSerializableExtra("contact");
                contactsList.add(contact);
                displayContacts();
            }
        } else if (requestCode == EDIT_REQUEST && resultCode == RESULT_OK && data != null && data.hasExtra("updatedContact")) {
            Contacts updatedContact = (Contacts) data.getSerializableExtra("updatedContact");
            int contactIndex = data.getIntExtra("contactIndex", -1);

            if (contactIndex != -1) {
                contactsList.set(contactIndex, updatedContact);
                displayContacts();
            }
        }

        }

    private void displayContacts() {
        LinearLayout linearLayout = findViewById(R.id.LinearLayoutScroll);
        linearLayout.removeAllViews();

        for (int i = 0; i < contactsList.size(); i++) {
            final int contactIndex = i;

            CardView cardView = new CardView(this);
            Contacts contacts = contactsList.get(i);

            cardView.setUseCompatPadding(true); //spatiul dintre nume

            TextView textView = new TextView(this);
            textView.setText(contacts.getName());
            textView.setTextSize(28);
            textView.setTextColor(Color.parseColor("#12258C"));

            cardView.addView(textView);
            linearLayout.addView(cardView);

            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(MainActivity.this, DetailsActivity.class);
                    intent.putExtra("contact", contacts);
                    intent.putExtra("contactIndex", contactIndex);
                    startActivityForResult(intent,EDIT_REQUEST);
                }
            });
        }
    }
}
