package com.example.test;

public class DoctorFoundSchema {
    public static final class DoctorTable{
        public static final String NAME = "Doctor";
        public static final class Cols {
            public static final String ID="Doctor ID";
            public static final String PHONE="Phone Number";
            public static final String ADDRESS="Office Address";
            public static final String NAME = "Full Name";
            public static final String EMAIL="Email";


        }

    }
    public static final class PatientTable{
        public static final String NAME = "Patient";
        public static final class Cols {
            public static final String ID="Patient ID";
            public static final String PHONE="Phone Number";
            public static final String ADDRESS="Home Address";
            public static final String NAME = "Full Name";
            public static final String EMAIL="Email";


        }
    }
    public static final class CashierTable{
        public static final String NAME = "Cashier";
        public static final class Cols {
            public static final String ID="Cashier ID";
            public static final String PHONE="Phone Number";
            public static final String ADDRESS="Home Address";
            public static final String NAME = "Full Name";
            public static final String EMAIL="Email";
        }

    }
    public static final class AdminTable{
        public static final String NAME = "Admin";
        public static final class Cols {
            public static final String ID="Admin ID";
            public static final String PHONE="Phone Number";
            public static final String ADDRESS="Home Address";
            public static final String NAME = "Full Name";
            public static final String EMAIL="Email";

        }

    }
    public static final class AppointmentTable{
        public static final String NAME = "Appointment";
        public static final class Cols {
            public static final String DATE = "Date";
            public static final String PATIENT_NAME="Patient Name";
            public static final String DOCTOR_NAME = "Doctor Name";
            public static final String APPOINTMENT_NUMBER = "Appointment Number";



        }

    }
    public static final class PaymentTable{
        public static final String NAME = "Payment";
        public static final class Cols {
            public static final String DATE = "Date";
            public static final String PATIENT_NAME="Patient Name";
            public static final String DOCTOR_NAME = "Doctor Name";
            public static final String INSURANCE ="Insurance";
            public static final String BALANCE = "Balance";
            public static final String PAYMENT_ID = "Payment Id";
            public static final String APPOINTMENT_NUMBER = "Appointment Number";
        }

    }
}
