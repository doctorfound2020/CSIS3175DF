package com.example.test;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.TimePicker;

import androidx.appcompat.app.AppCompatActivity;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Calendar;

public class PatientBookAppointment extends AppCompatActivity implements AdapterView.OnItemSelectedListener{
    Calendar calendar;
    String Date;
    String Time;
    DFhelper dFhelper;
    String dName;
    String pName = "Patient Name";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patient_book_appointment);
        //set title
        setTitle("Doctor Found Patient Book Appointment");

        //up bottom
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //radio group and buttons
        RadioGroup radioGroup = findViewById(R.id.radiogroup);
        RadioButton radioButton = findViewById(radioGroup.getCheckedRadioButtonId());

        //select doctor spinner
        Spinner spinner = findViewById(R.id.spinnerDoctor);
        ArrayAdapter adapter = ArrayAdapter.createFromResource(this,R.array.doctorsname, R.layout.color_spinner_layout);
        adapter.setDropDownViewResource(R.layout.spinner_dropdown_layout);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);

        //show date picker dialog
        Button btndate = findViewById(R.id.btnDate);
        final TextView txtdate = findViewById(R.id.txtDate);
        calendar = Calendar.getInstance();
        final int year = calendar.get(Calendar.YEAR);
        final int month = calendar.get(Calendar.MONTH);
        final int day = calendar.get(Calendar.DAY_OF_MONTH);
        btndate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               DatePickerDialog dpd = new DatePickerDialog(PatientBookAppointment.this, new DatePickerDialog.OnDateSetListener() {
                            @Override
                            public void onDateSet(DatePicker view, int year, int month, int day) {
                                month = month + 1;
                                Date = year + "/" + month + "/" + day;
                                txtdate.setText(Date);
                            }
                        },year,month,day);
                dpd.show();


            }
        });

        //show time picker dialog
        Button btntime = findViewById(R.id.btnTime);
        final TextView txttime = findViewById(R.id.txtTime);
        calendar = Calendar.getInstance();
        final int hour = calendar.get(Calendar.HOUR);
        final int minute = calendar.get(Calendar.MINUTE);
        btntime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog tpd = new TimePickerDialog(PatientBookAppointment.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker view, int hour, int minute) {
                        Time = hour + ":" + minute;
                        txttime.setText(Time);
                    }
                },hour,minute,true);
            tpd.show();
            }
        });

        Button btnbook = findViewById(R.id.btnBook);
        btnbook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String date = Date + ", " + Time;
                dFhelper.addAppointmentRecord(date,dName,pName);
            }
        });



    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        dName = parent.getItemAtPosition(position).toString();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
