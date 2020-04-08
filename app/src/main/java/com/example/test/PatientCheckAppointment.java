package com.example.test;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class PatientCheckAppointment extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patient_check_appointment);

        setTitle("Doctor Found Patient Check Appointment");

        //up bottom
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //listview
        ListView listView = findViewById(R.id.lvPatientCA);
        final ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("You have Appointment 1 comping up in 1 day.");
        arrayList.add("You have Appointment 2 comping up in 2 days.");
        arrayList.add("You have Appointment 3 comping up in 5 days.");
        arrayList.add("You have Appointment 4 comping up in 1 week.");
        arrayList.add("You have Appointment 5 comping up in 15 days.");

        final ArrayAdapter arrayAdapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,arrayList);
        listView.setAdapter(arrayAdapter);

        listView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {

                final int selecteditem = position;
                new AlertDialog.Builder(PatientCheckAppointment.this)
                        .setIcon(android.R.drawable.ic_delete)
                        .setTitle("Cancel Appointment")
                        .setMessage("Do you want to cancel this appointment?")
                        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                arrayList.remove(selecteditem);
                                arrayAdapter.notifyDataSetChanged();
                            }
                        })
                        .setNegativeButton("No", null)
                        .show();

                return true;
            }
        });


    }

}
