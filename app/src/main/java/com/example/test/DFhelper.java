package com.example.test;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DFhelper extends SQLiteOpenHelper{
    private static final int VERSION = 1;
    private static final String DatabseName = "DoctorFound.db";
    public DFhelper(Context context) {
        super(context,DatabseName,null,VERSION);
    }
    private static final String doctorTable =
            "CREATE TABLE IF NOT EXISTS " + DoctorFoundSchema.DoctorTable.NAME + " ( " +
                    DoctorFoundSchema.DoctorTable.Cols.ID + "INTEGER PRIMARY KEY, " +
                    DoctorFoundSchema.DoctorTable.Cols.PHONE + "TEXT, " +
                    DoctorFoundSchema.DoctorTable.Cols.NAME + " TEXT," +
                    DoctorFoundSchema.DoctorTable.Cols.EMAIL + " TEXT,"
                    +       DoctorFoundSchema.DoctorTable.Cols.ADDRESS +" TEXT)" ;

    private static final String patientTable =
            "CREATE TABLE IF NOT EXISTS " + DoctorFoundSchema.PatientTable.NAME + " (" +
                    DoctorFoundSchema.PatientTable.Cols.ID + "INTEGER PRIMARY KEY, " +
                    DoctorFoundSchema.PatientTable.Cols.PHONE + "TEXT," +
                    DoctorFoundSchema.PatientTable.Cols.NAME + " TEXT," +
                    DoctorFoundSchema.PatientTable.Cols.EMAIL + "TEXT,"
                    +      DoctorFoundSchema.PatientTable.Cols.ADDRESS +"TEXT)" ;

    private static final String cashierTable =
            "CREATE TABLE IF NOT EXISTS " + DoctorFoundSchema.CashierTable.NAME + " (" +
                    DoctorFoundSchema.CashierTable.Cols.ID + "INTEGER PRIMARY KEY, " +
                    DoctorFoundSchema.CashierTable.Cols.PHONE + "TEXT," +
                    DoctorFoundSchema.CashierTable.Cols.NAME + " TEXT," +
                    DoctorFoundSchema.CashierTable.Cols.ADDRESS + " TEXT," +
                    DoctorFoundSchema.CashierTable.Cols.EMAIL + " TEXT" + ")";

    private static final String adminTable =
            "CREATE TABLE IF NOT EXISTS " + DoctorFoundSchema.AdminTable.NAME + " (" +
                    DoctorFoundSchema.AdminTable.Cols.ID + "INTEGER PRIMARY KEY, " +
                    DoctorFoundSchema.AdminTable.Cols.PHONE + "TEXT," +
                    DoctorFoundSchema.AdminTable.Cols.NAME + " TEXT," +
                    DoctorFoundSchema.AdminTable.Cols.ADDRESS + " TEXT," +
                    DoctorFoundSchema.AdminTable.Cols.EMAIL + " TEXT" + ")";

    private static final String appointmentTable =
            "CREATE TABLE IF NOT EXISTS " + DoctorFoundSchema.AppointmentTable.NAME + " (" +
                    DoctorFoundSchema.AppointmentTable.Cols.APPOINTMENT_NUMBER + "INTEGER PRIMARY KEY, "+
                    DoctorFoundSchema.AppointmentTable.Cols.DATE +" TEXT,"+
                    DoctorFoundSchema.AppointmentTable.Cols.DOCTOR_NAME + "TEXT,"+
                    DoctorFoundSchema.AppointmentTable.Cols.PATIENT_NAME + "TEXT" + ")";

    private static final String paymentTable =
            "CREATE TABLE IF NOT EXISTS " + DoctorFoundSchema.PaymentTable.NAME + " (" +
                    DoctorFoundSchema.PaymentTable.Cols.PAYMENT_ID + "INTEGER PRIMARY KEY, "+
                    DoctorFoundSchema.AppointmentTable.Cols.APPOINTMENT_NUMBER + "TEXT,"+
                    DoctorFoundSchema.PaymentTable.Cols.BALANCE+ "INTEGER, "+
                    DoctorFoundSchema.PaymentTable.Cols.DATE+" TEXT,"+
                    DoctorFoundSchema.PaymentTable.Cols.DOCTOR_NAME+"TEXT," +
                    DoctorFoundSchema.PaymentTable.Cols.INSURANCE+" TEXT,"+
                    DoctorFoundSchema.PaymentTable.Cols.PATIENT_NAME+"TEXT,"+
                    " FOREIGN KEY (APPOINTMENT_NUMBER) REFERENCES Appointment(APPOINTMENT_NUMBER))";

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(doctorTable);
        db.execSQL(patientTable);
        db.execSQL(cashierTable);
        db.execSQL(adminTable);
        db.execSQL(appointmentTable);
        db.execSQL(paymentTable);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + DoctorFoundSchema.DoctorTable.NAME);
        db.execSQL("DROP TABLE IF EXISTS " + DoctorFoundSchema.PatientTable.NAME);
        db.execSQL("DROP TABLE IF EXISTS "+ DoctorFoundSchema.CashierTable.NAME);
        db.execSQL("DROP TABLE IF EXISTS " + DoctorFoundSchema.AdminTable.NAME);
        db.execSQL("DROP TABLE IF EXISTS " + DoctorFoundSchema.AppointmentTable.NAME);
        db.execSQL("DROP TABLE IF EXISTS " + DoctorFoundSchema.PaymentTable.NAME);
        onCreate(db);
    }
    // add doctor record
    public boolean addDoctorRecord(String name, String email, String phone, String address) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(DoctorFoundSchema.DoctorTable.Cols.NAME ,name);
        contentValues.put(DoctorFoundSchema.DoctorTable.Cols.EMAIL ,email);
        contentValues.put(DoctorFoundSchema.DoctorTable.Cols.PHONE ,phone);
        contentValues.put(DoctorFoundSchema.DoctorTable.Cols.ADDRESS ,address);
        long r = db.insert( DoctorFoundSchema.DoctorTable.NAME,null,contentValues);
        if(r > 0){
            return true;
        }
        else {
            return false;
        }
    }
    //add patient record
    public boolean addPatientRecord(String name, String email, String phone, String address) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(DoctorFoundSchema.PatientTable.Cols.NAME,name);
        contentValues.put(DoctorFoundSchema.PatientTable.Cols.EMAIL,email);
        contentValues.put(DoctorFoundSchema.PatientTable.Cols.PHONE,phone);
        contentValues.put(DoctorFoundSchema.PatientTable.Cols.ADDRESS,address);
        long r = db.insert( DoctorFoundSchema.PatientTable.NAME,null,contentValues);
        if(r > 0){
            return true;
        }
        else {
            return false;
        }
    }
    //add cashier record
    public boolean addCashierRecord(String name, String email, String phone, String address) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(DoctorFoundSchema.CashierTable.Cols.NAME,name);
        contentValues.put(DoctorFoundSchema.CashierTable.Cols.EMAIL,email);
        contentValues.put(DoctorFoundSchema.CashierTable.Cols.PHONE,phone);
        contentValues.put(DoctorFoundSchema.CashierTable.Cols.ADDRESS,address);
        long r = db.insert( DoctorFoundSchema.CashierTable.NAME,null,contentValues);
        if(r > 0){
            return true;
        }
        else {
            return false;
        }
    }
    //add admin record
    public boolean addAdminRecord(String name, String email, String phone, String address) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(DoctorFoundSchema.AdminTable.Cols.NAME,name);
        contentValues.put(DoctorFoundSchema.AdminTable.Cols.EMAIL,email);
        contentValues.put(DoctorFoundSchema.AdminTable.Cols.PHONE,phone);
        contentValues.put(DoctorFoundSchema.AdminTable.Cols.ADDRESS,address);
        long r = db.insert( DoctorFoundSchema.AdminTable.NAME,null,contentValues);
        if(r > 0){
            return true;
        }
        else {
            return false;
        }
    }
    //add appointment record
    public boolean addAppointmentRecord(String date, String dname, String pname) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(DoctorFoundSchema.AppointmentTable.Cols.DATE, date);
        contentValues.put(DoctorFoundSchema.AppointmentTable.Cols.DOCTOR_NAME, dname);
        contentValues.put(DoctorFoundSchema.AppointmentTable.Cols.PATIENT_NAME, pname);
        long r = db.insert( DoctorFoundSchema.AppointmentTable.NAME,null,contentValues);
        if(r > 0){
            return true;
        }
        else {
            return false;
        }
    }
    //add payment record
    public boolean addPaymentRecord(String appointmentid, int balance, String date, String dname, String pname, String insurance) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(DoctorFoundSchema.PaymentTable.Cols.APPOINTMENT_NUMBER, appointmentid);
        contentValues.put(DoctorFoundSchema.PaymentTable.Cols.BALANCE, balance);
        contentValues.put(DoctorFoundSchema.PaymentTable.Cols.DATE, date);
        contentValues.put(DoctorFoundSchema.PaymentTable.Cols.DOCTOR_NAME, dname);
        contentValues.put(DoctorFoundSchema.PaymentTable.Cols.PATIENT_NAME, pname);
        contentValues.put(DoctorFoundSchema.PaymentTable.Cols.INSURANCE, insurance);
        long r = db.insert( DoctorFoundSchema.PaymentTable.NAME,null,contentValues);
        if(r > 0){
            return true;
        }
        else {
            return false;
        }
    }

    public Cursor viewAppointmentData(){
        SQLiteDatabase db = this.getReadableDatabase();
        String query = "SELECT * FROM "+ DoctorFoundSchema.AppointmentTable.NAME;
        Cursor c = db.rawQuery(query,null);
        return c;
    }

}
