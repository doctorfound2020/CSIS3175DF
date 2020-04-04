package com.example.test;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;


public class LoginActivity extends AppCompatActivity {

    DFhelper helper = new DFhelper(this);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        setTitle("Doctor Found Login");

        EditText SIUsername = findViewById(R.id.etUsername);
        EditText SIPassword = findViewById(R.id.etPassword);
        Spinner sChooseUserSignIn = findViewById(R.id.sChooseUserSignIn);
        Button btnSISignIn = findViewById(R.id.btnSignInSI);
        Button btnToSignUp = findViewById(R.id.btnSignUpSI);

        final String SI_Username = SIUsername.getText().toString();
        final String SI_Password = SIPassword.getText().toString();
        final String userType = sChooseUserSignIn.getSelectedItem().toString();

        btnSISignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (userType) {
                    case "Patient":
                        String patientPassword = helper.searchPatientPass(SI_Username);//search db for uname, see if pass match
                        //if password from database is equal to users entered password, start home page
                        if (SI_Password.equals(patientPassword)) {
                            startActivity(new Intent(LoginActivity.this, PatientHomePageActivity.class));
                        } else {
                            //wrong password, toast message
                            Toast toastPatient = Toast.makeText(LoginActivity.this, "Wrong Username or Password", Toast.LENGTH_SHORT);
                            toastPatient.show();
                        }
                        break;
                    case "Doctor":
                        String doctorPassword = helper.searchDoctorPass(SI_Username);
                        if (SI_Password.equals(doctorPassword)) {
                            startActivity(new Intent(LoginActivity.this, DoctorHomePageActivity.class));
                        } else {
                            Toast toastDoctor = Toast.makeText(LoginActivity.this, "Wrong Username or Password", Toast.LENGTH_SHORT);
                            toastDoctor.show();
                        }
                        break;
                    case "Admin":
                        String adminPassword = helper.searchAdminPass(SI_Username);
                        if (SI_Password.equals(adminPassword)) {
                            startActivity(new Intent(LoginActivity.this, AdminHomePageActivity.class));
                        } else {
                            Toast toastAdmin = Toast.makeText(LoginActivity.this, "Wrong Username or Password", Toast.LENGTH_SHORT);
                            toastAdmin.show();
                        }
                        break;
                    case "Cashier":
                        String cashierPassword = helper.searchCashierPass(SI_Username);
                        if (SI_Password.equals(cashierPassword)) {
                            startActivity(new Intent(LoginActivity.this, CashierHomePageActivity.class));
                        } else {
                            Toast toastCashier = Toast.makeText(LoginActivity.this, "Wrong Username or Password", Toast.LENGTH_SHORT);
                            toastCashier.show();
                        }
                        break;
                }
            }
        });

        btnToSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LoginActivity.this, SignUpActivity.class));
            }
        });

        //The following buttons are used for testing purposes.
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
        btnToCashierTEST.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LoginActivity.this, CashierHomePageActivity.class));
            }
        });

    }
}
