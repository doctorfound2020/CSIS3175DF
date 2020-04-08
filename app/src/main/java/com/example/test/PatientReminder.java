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
        reminders.add("You have Appointment 1 coming up in 1 day.");
        reminders.add("You have Appointment 2 coming up in 2 days.");
        reminders.add("You have Appointment 3 coming up in 5 days.");
        reminders.add("You have Appointment 4 coming up in 1 week.");
        reminders.add("You have Appointment 5 coming up in 15 days.");


        ArrayAdapter arrayAdapter = new ArrayAdapter<String>(PatientReminder.this, android.R.layout.simple_list_item_1, reminders);
        listView.setAdapter(arrayAdapter);


    }
}
