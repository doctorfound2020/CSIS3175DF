package com.example.test;

public class DoctorFoundSchema {

    public static final class DoctorTable{
        public static final String NAME = "Doctor";
        public static final class Cols {

            public static final String USERNAME="Username";
            public static final String PASSWORD="Password";
            public static final String NAME = "FullName";
            public static final String PHONE="PhoneNumber";
            public static final String EMAIL="Email";
            public static final String BIRTHDATE="Birthdate";
            public static final String ADDRESS="OfficeAddress";
            public static final String CERTIFICATION="Certification";

        }

    }
    public static final class PatientTable{
        public static final String NAME = "Patient";
        public static final class Cols {

            public static final String USERNAME="Username";
            public static final String PASSWORD="Password";
            public static final String NAME = "FullName";
            public static final String PHONE="PhoneNumber";
            public static final String EMAIL="Email";
            public static final String BIRTHDATE="Birthdate";
            public static final String ADDRESS="OfficeAddress";
            public static final String CREDITNUMBER="CreditNumber";
            public static final String CVV="Cvv";
            public static final String EXPDATE="ExpirationDate";
        }
    }
    public static final class CashierTable{
        public static final String NAME = "Cashier";
        public static final class Cols {
            public static final String USERNAME="Username";
            public static final String PASSWORD="Password";
            public static final String NAME = "FullName";
            public static final String PHONE="PhoneNumber";
            public static final String EMAIL="Email";
            public static final String BIRTHDATE="Birthdate";
            public static final String ADDRESS="OfficeAddress";
            public static final String CERTIFICATION="Certification";
        }

    }
    public static final class AdminTable{
        public static final String NAME = "Admin";
        public static final class Cols {
            public static final String USERNAME="Username";
            public static final String PASSWORD="Password";
            public static final String NAME = "FullName";
            public static final String PHONE="PhoneNumber";
            public static final String EMAIL="Email";
            public static final String BIRTHDATE="Birthdate";
            public static final String ADDRESS="OfficeAddress";

        }

    }
    public static final class AppointmentTable{
        public static final String NAME = "Appointment";
        public static final class Cols {
            public static final String DATE = "Date";
            public static final String PATIENT_NAME="PatientName";
            public static final String DOCTOR_NAME = "DoctorName";
            public static final String APPOINTMENT_NUMBER = "AppointmentNumber";
        }

    }
    public static final class PaymentTable{
        public static final String NAME = "Payment";
        public static final class Cols {
            public static final String DATE = "Date";
            public static final String PATIENT_NAME="PatientName";
            public static final String DOCTOR_NAME = "DoctorName";
            public static final String INSURANCE ="Insurance";
            public static final String BALANCE = "Balance";
            public static final String PAYMENT_ID = "PaymentId";
        }

    }

    //get & set methods for user login/create account
    String patientUsername, doctorUsername, adminUsername, cashierUsername;
    String patientPassword, doctorPassword, adminPassword, cashierPassword;
    String patientFullName, doctorFullName, adminFullName, cashierFullName;
    String patientPhone, doctorPhone, adminPhone, cashierPhone;
    String patientEmail, doctorEmail, adminEmail, cashierEmail;
    String patientBirthdate, doctorBirthdate, adminBirthdate, cashierBirthdate;
    String patientAddress, doctorAddress, adminAddress, cashierAddress;
    String doctorCertification, cashierCertification;
    String patientCreditNumber, patientCVV, patientExpDate;


    public String getPatientCreditNumber() {
        return patientCreditNumber;
    }

    public void setPatientCreditNumber(String patientCreditNumber) {
        this.patientCreditNumber = patientCreditNumber;
    }

    public String getPatientCVV() {
        return patientCVV;
    }

    public void setPatientCVV(String patientCVV) {
        this.patientCVV = patientCVV;
    }

    public String getPatientExpDate() {
        return patientExpDate;
    }

    public void setPatientExpDate(String patientExpDate) {
        this.patientExpDate = patientExpDate;
    }

    public String getPatientUsername() {
        return patientUsername;
    }

    public void setPatientUsername(String patientUsername) {
        this.patientUsername = patientUsername;
    }

    public String getDoctorUsername() {
        return doctorUsername;
    }

    public void setDoctorUsername(String doctorUsername) {
        this.doctorUsername = doctorUsername;
    }

    public String getAdminUsername() {
        return adminUsername;
    }

    public void setAdminUsername(String adminUsername) {
        this.adminUsername = adminUsername;
    }

    public String getCashierUsername() {
        return cashierUsername;
    }

    public void setCashierUsername(String cashierUsername) {
        this.cashierUsername = cashierUsername;
    }

    public String getPatientPassword() {
        return patientPassword;
    }

    public void setPatientPassword(String patientPassword) {
        this.patientPassword = patientPassword;
    }

    public String getDoctorPassword() {
        return doctorPassword;
    }

    public void setDoctorPassword(String doctorPassword) {
        this.doctorPassword = doctorPassword;
    }

    public String getAdminPassword() {
        return adminPassword;
    }

    public void setAdminPassword(String adminPassword) {
        this.adminPassword = adminPassword;
    }

    public String getCashierPassword() {
        return cashierPassword;
    }

    public void setCashierPassword(String cashierPassword) {
        this.cashierPassword = cashierPassword;
    }

    public String getPatientFullName() {
        return patientFullName;
    }

    public void setPatientFullName(String patientFullName) {
        this.patientFullName = patientFullName;
    }

    public String getDoctorFullName() {
        return doctorFullName;
    }

    public void setDoctorFullName(String doctorFullName) {
        this.doctorFullName = doctorFullName;
    }

    public String getAdminFullName() {
        return adminFullName;
    }

    public void setAdminFullName(String adminFullName) {
        this.adminFullName = adminFullName;
    }

    public String getCashierFullName() {
        return cashierFullName;
    }

    public void setCashierFullName(String cashierFullName) {
        this.cashierFullName = cashierFullName;
    }

    public String getPatientPhone() {
        return patientPhone;
    }

    public void setPatientPhone(String patientPhone) {
        this.patientPhone = patientPhone;
    }

    public String getDoctorPhone() {
        return doctorPhone;
    }

    public void setDoctorPhone(String doctorPhone) {
        this.doctorPhone = doctorPhone;
    }

    public String getAdminPhone() {
        return adminPhone;
    }

    public void setAdminPhone(String adminPhone) {
        this.adminPhone = adminPhone;
    }

    public String getCashierPhone() {
        return cashierPhone;
    }

    public void setCashierPhone(String cashierPhone) {
        this.cashierPhone = cashierPhone;
    }

    public String getPatientEmail() {
        return patientEmail;
    }

    public void setPatientEmail(String patientEmail) {
        this.patientEmail = patientEmail;
    }

    public String getDoctorEmail() {
        return doctorEmail;
    }

    public void setDoctorEmail(String doctorEmail) {
        this.doctorEmail = doctorEmail;
    }

    public String getAdminEmail() {
        return adminEmail;
    }

    public void setAdminEmail(String adminEmail) {
        this.adminEmail = adminEmail;
    }

    public String getCashierEmail() {
        return cashierEmail;
    }

    public void setCashierEmail(String cashierEmail) {
        this.cashierEmail = cashierEmail;
    }

    public String getPatientBirthdate() {
        return patientBirthdate;
    }

    public void setPatientBirthdate(String patientBirthdate) {
        this.patientBirthdate = patientBirthdate;
    }

    public String getDoctorBirthdate() {
        return doctorBirthdate;
    }

    public void setDoctorBirthdate(String doctorBirthdate) {
        this.doctorBirthdate = doctorBirthdate;
    }

    public String getAdminBirthdate() {
        return adminBirthdate;
    }

    public void setAdminBirthdate(String adminBirthdate) {
        this.adminBirthdate = adminBirthdate;
    }

    public String getCashierBirthdate() {
        return cashierBirthdate;
    }

    public void setCashierBirthdate(String cashierBirthdate) {
        this.cashierBirthdate = cashierBirthdate;
    }

    public String getPatientAddress() {
        return patientAddress;
    }

    public void setPatientAddress(String patientAddress) {
        this.patientAddress = patientAddress;
    }

    public String getDoctorAddress() {
        return doctorAddress;
    }

    public void setDoctorAddress(String doctorAddress) {
        this.doctorAddress = doctorAddress;
    }

    public String getAdminAddress() {
        return adminAddress;
    }

    public void setAdminAddress(String adminAddress) {
        this.adminAddress = adminAddress;
    }

    public String getCashierAddress() {
        return cashierAddress;
    }

    public void setCashierAddress(String cashierAddress) {
        this.cashierAddress = cashierAddress;
    }

    public String getDoctorCertification() {
        return doctorCertification;
    }

    public void setDoctorCertification(String doctorCertification) {
        this.doctorCertification = doctorCertification;
    }

    public String getCashierCertification() {
        return cashierCertification;
    }

    public void setCashierCertification(String cashierCertification) {
        this.cashierCertification = cashierCertification;
    }
}
