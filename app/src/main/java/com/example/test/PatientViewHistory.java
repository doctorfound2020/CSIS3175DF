package com.example.test;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class PatientViewHistory extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patient_view_history);

        //set title
        setTitle("Doctor Found Patient View History");

        //up bottom
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ListView listView = findViewById(R.id.lvPatientHistory);
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Appointment 1 was 1 day ago.");
        arrayList.add("You messaged a doctor regarding Appointment 1");
        arrayList.add("Appointment 2 was 2 days ago.");
        arrayList.add("You messaged a doctor regarding Appointment 2");
        arrayList.add("Appointment 3 was 5 days ago.");
        arrayList.add("You messaged a doctor regarding Appointment 3");
        arrayList.add("Appointment 4 was 1 week ago.");
        arrayList.add("You messaged a doctor regarding Appointment 4");
        arrayList.add("Appointment 5 was 15 days ago.");
        arrayList.add("You messaged a doctor regarding Appointment 5");

        ArrayAdapter arrayAdapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,arrayList);
        listView.setAdapter(arrayAdapter);

    }
}
