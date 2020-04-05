package com.example.test;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class DoctorViewHistory extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctor_view_history);

        setTitle("Doctor Found Doctor View History");

        //up bottom
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ListView listView = findViewById(R.id.lvDoctorHistory);
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("history1");
        arrayList.add("history2");
        arrayList.add("history3");
        arrayList.add("history1");
        arrayList.add("history2");
        arrayList.add("history3");
        arrayList.add("history1");
        arrayList.add("history2");
        arrayList.add("history3");
        arrayList.add("history1");
        arrayList.add("history2");
        arrayList.add("history3");
        arrayList.add("history1");
        arrayList.add("history2");
        arrayList.add("history3");

        ArrayAdapter arrayAdapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,arrayList);
        listView.setAdapter(arrayAdapter);
    }
}
