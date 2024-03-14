package com.example.chatapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;

public class User2Activity extends AppCompatActivity {
    private ArrayList<Message> messages = new ArrayList<>();
    Message msg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user2);

        messages = new ArrayList<>();
        msg = (Message) getIntent().getSerializableExtra("message");
        messages.add(msg);
        display();
        Button sendButton = findViewById(R.id.button);
        sendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText txt = findViewById(R.id.editTextText);
                if (!txt.getText().toString().isEmpty()) {
                    Intent intent = new Intent();
                    Message newMsg = new Message(txt.getText().toString(),2);
                    messages.add(newMsg);
                    display();
                    intent.putExtra("message", newMsg);
                    setResult(RESULT_OK, intent);
                    finish();

                } else {

                    txt.setError("Missing");

                }
            }
        });

    }

    private void display() {
        LinearLayout linearLayout = findViewById(R.id.LayoutScroll);
        linearLayout.removeAllViews();
        for (Message m : messages) {


            TextView textView = new TextView(this);
            textView.setText(m.getContent());
            textView.setTextSize(20);

            if (m.getSenderId() == 2) {
                textView.setGravity(Gravity.END);

            } else {
                textView.setGravity(Gravity.START);


            }
            linearLayout.addView(textView);


        }
    }

}
