package com.example.test;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class DoctorResponseMessage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctor_response_message);

        setTitle("Doctor Found Doctor Response Message");

        Button response = findViewById(R.id.btnDoctorRespond);
        Button discard = findViewById(R.id.btnDoctorDiscard);

        response.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(DoctorResponseMessage.this,"Message send success",Toast.LENGTH_LONG).show();
            }
        });

        discard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DoctorResponseMessage.this, DoctorViewMessage.class));
            }
        });

    }
}
