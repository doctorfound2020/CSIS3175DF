package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DoctorHomePageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctor_home_page);

        setTitle("Doctor Found Doctor Home Page");

        Button btnCheckAppointmentDoctor = findViewById(R.id.btnCheckAppointmentDoctor);
        Button btnSendMessageToPatient = findViewById(R.id.btnSendMessageToPatient);
        Button btnViewMessageFromPatient = findViewById(R.id.btnViewMessageFromPatient);
        Button btnViewReminderFromCashierDoctor = findViewById(R.id.btnViewReminderFromCashierDoctor);
        Button btnViewHistoryDoctor = findViewById(R.id.btnViewHistoryDoctor);

        /*CURRENTLY COMMENTED OUT - WILL UNCOMMENT WHEN MERGING CODE
        btnCheckAppointmentDoctor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DoctorHomePageActivity.this, DoctorCheckAppointment.class));
            }
        });
        btnSendMessageToPatient.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DoctorHomePageActivity.this, DoctorResponseMessage.class));
            }
        });
        btnViewMessageFromPatient.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DoctorHomePageActivity.this, DoctorViewMessage.class));
            }
        });
        btnViewReminderFromCashierDoctor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DoctorHomePageActivity.this, DoctorReminder.class));
            }
        });
        btnViewHistoryDoctor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DoctorHomePageActivity.this, DoctorViewHistory.class));
            }
        });
        */
    }
}
