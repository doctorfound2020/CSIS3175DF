package com.example.test;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class DoctorReminder extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctor_reminder);

        setTitle("Doctor Found Doctor Reminder");

        //up bottom
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ListView listView = findViewById(R.id.lvDoctorReminder);
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Upcoming Reminder: Appointment 1 in 1 day.");
        arrayList.add("Upcoming Reminder: Appointment 2 in 2 days.");
        arrayList.add("Upcoming Reminder: Appointment 3 in 5 days.");
        arrayList.add("Upcoming Reminder: Appointment 4 in 1 week.");
        arrayList.add("Upcoming Reminder: Appointment 5 in 15 days.");

        ArrayAdapter arrayAdapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,arrayList);
        listView.setAdapter(arrayAdapter);
    }
}
