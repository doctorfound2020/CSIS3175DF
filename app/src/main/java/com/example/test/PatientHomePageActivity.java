package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PatientHomePageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patient_home_page);

        setTitle("Doctor Found Patient Home Page");

        Button btnBookAppointment = findViewById(R.id.btnBookAppointment);
        Button btnCheckAppointment = findViewById(R.id.btnCheckAppointment);
        Button btnPatientOnlineHelp = findViewById(R.id.btnPatientOnlineHelp);
        Button btnViewReminderFromCashierPatient = findViewById(R.id.btnViewReminderFromCashierPatient);
        Button btnViewHistoryPatient = findViewById(R.id.btnViewHistoryPatient);
        Button btnSignOutPatient = findViewById(R.id.btnSignOutPatient);
        Button btnEditProfilePatient = findViewById(R.id.btnEditProfilePatient);


        btnBookAppointment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(PatientHomePageActivity.this, PatientBookAppointment.class));
            }
        });
        btnCheckAppointment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(PatientHomePageActivity.this, PatientCheckAppointment.class));
            }
        });
        btnPatientOnlineHelp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(PatientHomePageActivity.this, PatientOnlineHelp.class));
            }
        });
        btnViewReminderFromCashierPatient.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(PatientHomePageActivity.this, PatientReminder.class));
            }
        });
        btnViewHistoryPatient.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(PatientHomePageActivity.this, PatientViewHistory.class));
            }
        });

        btnSignOutPatient.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(PatientHomePageActivity.this, LogoutActivity.class));
            }
        });
        btnEditProfilePatient.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(PatientHomePageActivity.this, EditAccountActivity.class));
            }
        });

    }
}
