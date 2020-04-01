package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class EditAccountActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up); //open sign up page to make edits

        setTitle("Doctor Found Edit Account");

        TextView txtTitleSignUp = findViewById(R.id.txtTitleSignUp);
        txtTitleSignUp.setText("Edit Account");


    }
}
