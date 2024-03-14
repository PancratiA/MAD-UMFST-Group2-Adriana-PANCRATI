package com.example.chatapp;

import java.io.Serializable;

public class Message implements Serializable {
    private String content;
    private int senderId; // 1 sau 2

    public Message(String content, int senderId) {
        this.content = content;
        this.senderId = senderId;
    }

    public String getContent() {
        return content;
    }

    public int getSenderId() {
        return senderId;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setSenderId(int senderId) {
        this.senderId = senderId;
    }
}

