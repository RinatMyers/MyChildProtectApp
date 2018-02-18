package com.example.win10user.mychildprotectapp.Objects;

import com.google.firebase.database.IgnoreExtraProperties;

/**
 * Created by udilevy on 18/02/2018.
 */

@IgnoreExtraProperties
public class User {

    public String password;
    public String email;

    public User() {
        // Default constructor required for calls to DataSnapshot.getValue(User.class)
    }

    public User (String email,String password) {
        this.password = password;
        this.email = email;
    }

}