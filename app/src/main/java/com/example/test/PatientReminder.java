package com.example.test;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class PatientReminder extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patient_reminder);

        setTitle("Doctor Found Patient Reminder");

        //up bottom
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        DoctorFoundSchema dfs;
        DFhelper dFhelper = new DFhelper(PatientReminder.this);
        ListView listView = findViewById(R.id.lvPatientReminder);

        List<String> reminders = dFhelper.getReminders();

        ArrayAdapter arrayAdapter = new ArrayAdapter<String>(PatientReminder.this, android.R.layout.simple_list_item_1, reminders);
        listView.setAdapter(arrayAdapter);


    }
}
