package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class CashierReminder extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cashier_reminder);

        ListView listViewCashier = findViewById(R.id.lvCashierReminder);
        ArrayList<String> arrayListCashier = new ArrayList<>();
        arrayListCashier.add("There is an upcoming Appointment tomorrow.");
        arrayListCashier.add("A Doctor and Patient have an appointment soon.");
        arrayListCashier.add("There is a new appointment coming up.");
        arrayListCashier.add("Remind the doctor and patient of their upcoming appointment.");
        arrayListCashier.add("A Patient and Doctor have an appointment soon.");
        arrayListCashier.add("There are Appointments scheduled this week.");

        ArrayAdapter arrayAdapterCashier = new ArrayAdapter(this,android.R.layout.simple_list_item_1,arrayListCashier);
        listViewCashier.setAdapter(arrayAdapterCashier);
    }
}
