package com.example.phonebookapp;

import android.net.Uri;

import java.io.Serializable;

public class Contacts implements Serializable {
    private String name, surname, address, email, number;
    private Uri imageUri;

    public Contacts(String name, String number) {
        this.name = name;
        this.number = number;
    }

    public Contacts() {
    }

    public Contacts(String name, String surname, String address, String email, Uri imageUri, String number) {
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.email = email;
        this.imageUri = imageUri;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Uri getImageUri() {
        return imageUri;
    }

    public void setImageUri(Uri imageUri) {
        this.imageUri = imageUri;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }


}