package com.example.test;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class PatientViewMessage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patient_view_message);

        //set title
        setTitle("Doctor Found Patient View Message");

        //up bottom
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ListView listView = findViewById(R.id.lvPatientVM);
        final ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("You have a message from a doctor regarding Appointment 1");
        arrayList.add("You have a message from a doctor regarding Appointment 2");
        arrayList.add("You have a message from a doctor regarding Appointment 3");
        arrayList.add("You have a message from a doctor regarding Appointment 4");
        arrayList.add("You have a message from a doctor regarding Appointment 5");

        final ArrayAdapter arrayAdapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,arrayList);
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                for (int i = 0; i < arrayList.size(); i++){
                    if(position == i){
                        startActivity(new Intent(PatientViewMessage.this, PatientSendMessage.class));
                    }
                }
            }
        });
    }
}
