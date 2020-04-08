package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CashierHomePageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cashier_home_page);

        setTitle("Doctor Found Cashier Home Page");

        Button btnSignOutCashier = findViewById(R.id.btnSignOutCashier);
        Button btnEditProfileCashier = findViewById(R.id.btnEditProfileCashier);
        Button btnViewSendApptReminder = findViewById(R.id.btnViewSendApptReminder);

        btnViewSendApptReminder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               startActivity(new Intent(CashierHomePageActivity.this, CashierReminder.class));
            }
        });
        btnSignOutCashier.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(CashierHomePageActivity.this, LogoutActivity.class));
            }
        });
        btnEditProfileCashier.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(CashierHomePageActivity.this, EditAccountActivity.class));
            }
        });
    }
}
