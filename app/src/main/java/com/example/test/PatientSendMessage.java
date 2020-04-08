package com.example.test;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class PatientSendMessage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patient_send_message);

        setTitle("Doctor Found Patient Send Message");

        Button response = findViewById(R.id.btnPatientSend);
        Button discard = findViewById(R.id.btnPatientDiscard);

        response.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(PatientSendMessage.this,"Message send success", Toast.LENGTH_LONG).show();
            }
        });

        discard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(PatientSendMessage.this, PatientViewMessage.class));
            }
        });

    }
}
