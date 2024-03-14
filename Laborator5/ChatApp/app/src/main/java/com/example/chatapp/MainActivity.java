package com.example.chatapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<Message> messages = new ArrayList<>();
    Message msg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button  sendButton = findViewById(R.id.button);
        sendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText txt = findViewById(R.id.editTextText);
                if (!txt.getText().toString().isEmpty()) {
                    Message msg = new Message(txt.getText().toString(), 1);
                    messages.add(msg);
                    Intent intent = new Intent(MainActivity.this, User2Activity.class);
                    intent.putExtra("message",  msg);
                    startActivityForResult(intent, 1);
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
            //textView.setTextColor(Color.parseColor("#12258C"));

            if(m.getSenderId()==2){
                textView.setGravity(Gravity.START);

            }
            else{
                textView.setGravity(Gravity.END);


            }
            linearLayout.addView(textView);


        }
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 1 && resultCode == RESULT_OK) {
            Message msg = (Message) data.getSerializableExtra("message");
            if (msg != null && !msg.getContent().isEmpty()) {
                messages.add(msg);
                display();
            }
        }
    }}

