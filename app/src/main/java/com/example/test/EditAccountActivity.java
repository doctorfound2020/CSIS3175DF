package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class EditAccountActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up); //open sign up page to make edits

        setTitle("Doctor Found Edit Account");

        TextView txtTitleSignUp = findViewById(R.id.txtTitleSignUp);
        txtTitleSignUp.setText("Edit Account");

        Button btnToSignIn = findViewById(R.id.btnSignInSU);

        btnToSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(EditAccountActivity.this, LoginActivity.class));
            }
        });


    }
}
