package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;

public class AdminHomePageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_home_page);

        setTitle("Doctor Found Admin Home Page");

        Button btnAddPatient = findViewById(R.id.btnAddPatient);
        Button btnEditPatient = findViewById(R.id.btnEditPatient);
        Button btnAddDoctor = findViewById(R.id.btnAddDoctor);
        Button btnEditDoctor = findViewById(R.id.btnEditDoctor);
        Button btnAddCashier = findViewById(R.id.btnAddCashier);
        Button btnEditCashier = findViewById(R.id.btnEditCashier);
        Button btnSignOutAdmin = findViewById(R.id.btnSignOutAdmin);
        Button btnEditProfileAdmin = findViewById(R.id.btnEditProfileAdmin);

        final Spinner sChooseUserSignUpEdit = findViewById(R.id.sChooseUserSignUpEdit); //must change value of this depending on button clicked


        btnAddPatient.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sChooseUserSignUpEdit.setSelection(0);
                startActivity(new Intent(AdminHomePageActivity.this, SignUpActivity.class));
            }
        });
        btnEditPatient.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sChooseUserSignUpEdit.setSelection(0);
                startActivity(new Intent(AdminHomePageActivity.this, EditAccountActivity.class));
            }
        });
        btnAddDoctor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sChooseUserSignUpEdit.setSelection(1);
                startActivity(new Intent(AdminHomePageActivity.this, SignUpActivity.class));
            }
        });
        btnEditDoctor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sChooseUserSignUpEdit.setSelection(1);
                startActivity(new Intent(AdminHomePageActivity.this, EditAccountActivity.class));
            }
        });
        btnAddCashier.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sChooseUserSignUpEdit.setSelection(2);
                startActivity(new Intent(AdminHomePageActivity.this, SignUpActivity.class));
            }
        });
        btnEditCashier.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sChooseUserSignUpEdit.setSelection(2);
                startActivity(new Intent(AdminHomePageActivity.this, EditAccountActivity.class));
            }
        });
        btnSignOutAdmin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sChooseUserSignUpEdit.setSelection(3);
                startActivity(new Intent(AdminHomePageActivity.this, LogoutActivity.class));
            }
        });
        btnEditProfileAdmin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sChooseUserSignUpEdit.setSelection(3);
                startActivity(new Intent(AdminHomePageActivity.this, EditAccountActivity.class));
            }
        });

    }
}
