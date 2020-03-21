package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class PatientViewHistory extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patient_view_history);

        setTitle("Doctor Found Patient View History");
    }
}
