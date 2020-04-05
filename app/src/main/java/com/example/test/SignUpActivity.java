package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

/**
 * SignUpActivity.java
 * This class simply has the same code as EditAccountActivity.java, with some variable changes.
 * create a whole new account, and its inserted into database.
 * same xml as EditAccountActivity.java.
 */
public class SignUpActivity extends AppCompatActivity {

    DFhelper helper = new DFhelper(this);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        setTitle("Doctor Found Sign Up");

        //get values from all fields
        EditText SUUsername = findViewById(R.id.etUsernameSignUp);
        EditText SUPassword = findViewById(R.id.etPasswordSignUp);
        EditText SUPasswordConfirm = findViewById(R.id.etPasswordConfirmSignUp);
        Spinner sChooseUserSignUpEdit = findViewById(R.id.sChooseUserSignUpEdit);
        EditText SUFullName = findViewById(R.id.etFullName);
        EditText SUPhone = findViewById(R.id.etPhone);
        EditText SUEmail = findViewById(R.id.etEmail);
        EditText SUBirthday = findViewById(R.id.etBirthDay);
        EditText SUAddress = findViewById(R.id.etAddress);
        Spinner spinnerCertification = findViewById(R.id.spinnerCertification);
        EditText SUCreditNum = findViewById(R.id.etCreditNumber);
        EditText SUCVV = findViewById(R.id.etCVV);
        EditText SUExpDate = findViewById(R.id.etExpiration);
        Button btnToSignUp = findViewById(R.id.btnSignUpSU);
        Button btnToSignIn = findViewById(R.id.btnSignInSU);

        final String SU_Username = SUUsername.getText().toString();
        final String SU_Password = SUPassword.getText().toString();
        final String SU_PasswordConfirm = SUPasswordConfirm.getText().toString();
        final String SU_FullName = SUFullName.getText().toString();
        final String SU_Phone = SUPhone.getText().toString();
        final String SU_Email = SUEmail.getText().toString();
        final String SU_Birthday = SUBirthday.getText().toString();
        final String SU_Address = SUAddress.getText().toString();
        final String SU_CreditNum = SUCreditNum.getText().toString(); //payment info only necessary for patient
        final String SU_CVV = SUCVV.getText().toString();
        final String SU_ExpDate = SUExpDate.getText().toString();
        final String SU_UserType = sChooseUserSignUpEdit.getSelectedItem().toString(); //user type default to patient
        final String SU_Certification = spinnerCertification.getSelectedItem().toString(); //only necessary if doctor/cashier, default to none


        btnToSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean isValid = true;
                if(SU_Username == "" || SU_Password == "" || SU_PasswordConfirm == "" || SU_FullName == "" || SU_Phone == "" || SU_Email == "" || SU_Birthday == "" || SU_Address == ""){
                    Toast toastEmpty = Toast.makeText(SignUpActivity.this, "All fields must be filled", Toast.LENGTH_LONG);
                    toastEmpty.show();
                    isValid = false;
                }
                if((SU_Password.equals(SU_PasswordConfirm)) == false){
                    Toast toastMustMatch = Toast.makeText(SignUpActivity.this, "Both passwords must match", Toast.LENGTH_LONG);
                    toastMustMatch.show();
                    isValid = false;
                }

                String SU_CertificationDbStr = "";
                switch(SU_Certification){
                    case "None":
                        SU_CertificationDbStr = "None";
                        break;
                    case "Certificate":
                        SU_CertificationDbStr = "Certificate";
                        break;
                    case "Diploma":
                        SU_CertificationDbStr = "Diploma";
                        break;
                    case "Bachelors Degree":
                        SU_CertificationDbStr = "Bachelors Degree";
                        break;
                    case "Masters Degree":
                        SU_CertificationDbStr = "Masters Degree";
                        break;
                    case "PhD":
                        SU_CertificationDbStr = "PhD";
                        break;
                }

                if(isValid == true){
                    switch(SU_UserType){
                        case "Patient":
                            DoctorFoundSchema P_dfs = new DoctorFoundSchema();
                            P_dfs.setPatientUsername(SU_Username);
                            P_dfs.setPatientPassword(SU_Password);
                            P_dfs.setPatientFullName(SU_FullName);
                            P_dfs.setPatientPhone(SU_Phone);
                            P_dfs.setPatientEmail(SU_Email);
                            P_dfs.setPatientBirthdate(SU_Birthday);
                            P_dfs.setPatientAddress(SU_Address);
                            P_dfs.setPatientCreditNumber(SU_CreditNum);
                            P_dfs.setPatientCVV(SU_CVV);
                            P_dfs.setPatientExpDate(SU_ExpDate);
                            helper.insertPatient(P_dfs);
                            break;
                        case "Doctor":
                            DoctorFoundSchema D_dfs = new DoctorFoundSchema();
                            D_dfs.setDoctorUsername(SU_Username);
                            D_dfs.setDoctorPassword(SU_Password);
                            D_dfs.setDoctorFullName(SU_FullName);
                            D_dfs.setDoctorPhone(SU_Phone);
                            D_dfs.setDoctorEmail(SU_Email);
                            D_dfs.setDoctorBirthdate(SU_Birthday);
                            D_dfs.setDoctorAddress(SU_Address);
                            D_dfs.setDoctorCertification(SU_CertificationDbStr);
                            helper.insertDoctor(D_dfs);
                            break;
                        case "Cashier":
                            DoctorFoundSchema C_dfs = new DoctorFoundSchema();
                            C_dfs.setCashierUsername(SU_Username);
                            C_dfs.setCashierPassword(SU_Password);
                            C_dfs.setCashierFullName(SU_FullName);
                            C_dfs.setCashierPhone(SU_Phone);
                            C_dfs.setCashierEmail(SU_Email);
                            C_dfs.setCashierBirthdate(SU_Birthday);
                            C_dfs.setCashierAddress(SU_Address);
                            C_dfs.setCashierCertification(SU_CertificationDbStr);
                            helper.insertCashier(C_dfs);
                            break;
                        case "Admin":
                            DoctorFoundSchema A_dfs = new DoctorFoundSchema();
                            A_dfs.setAdminUsername(SU_Username);
                            A_dfs.setAdminPassword(SU_Password);
                            A_dfs.setAdminFullName(SU_FullName);
                            A_dfs.setAdminPhone(SU_Phone);
                            A_dfs.setAdminEmail(SU_Email);
                            A_dfs.setAdminBirthdate(SU_Birthday);
                            A_dfs.setAdminAddress(SU_Address);
                            helper.insertAdmin(A_dfs);
                            break;
                    }
                }else{
                    Toast toastMustMatch = Toast.makeText(SignUpActivity.this, "Please check for errors", Toast.LENGTH_LONG);
                    toastMustMatch.show();
                }
            }
        });

        btnToSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SignUpActivity.this, LoginActivity.class));
            }
        });
    }
}
