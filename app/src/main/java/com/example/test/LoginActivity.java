package com.example.test;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        setTitle("Doctor Found Login");

        Button btnToSignUp = findViewById(R.id.btnSignUpSI);

        btnToSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LoginActivity.this, SignUpActivity.class));
            }
        });



        //The following buttons are used for testing purposes
        Button btnToPatientTEST = findViewById(R.id.btnToPatientTEST);
        btnToPatientTEST.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LoginActivity.this, PatientHomePageActivity.class));
            }
        });


        Button btnToDoctorTEST = findViewById(R.id.btnToDoctorTEST);
        btnToDoctorTEST.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LoginActivity.this, DoctorHomePageActivity.class));
            }
        });


        Button btnToAdminTEST = findViewById(R.id.btnToAdminTEST);
        btnToAdminTEST.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LoginActivity.this, AdminHomePageActivity.class));
            }
        });


        Button btnToCashierTEST = findViewById(R.id.btnToCashierTEST);
        btnToSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LoginActivity.this, CashierHomePageActivity.class));
            }
        });

    }
}
