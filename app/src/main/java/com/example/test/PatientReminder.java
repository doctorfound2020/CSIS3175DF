package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class PatientReminder extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patient_reminder);

        setTitle("Doctor Found Patient Reminder");
    }
}
