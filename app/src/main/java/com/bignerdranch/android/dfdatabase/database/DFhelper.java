package com.bignerdranch.android.dfdatabase.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DFhelper extends SQLiteOpenHelper {
    private static final int VERSION = 1;
    private static final String DatabseName = "DoctorFound.db";
    public DFhelper(Context context) {
        super(context,DatabseName,null,VERSION);
    }
    private static final String doctorTable =
            "CREATE TABLE " + DoctorFoundSchema.DoctorTable.NAME + " (" +
                    DoctorFoundSchema.DoctorTable.Cols.PHONE + "INTEGER PRIMARY KEY," +
                    DoctorFoundSchema.DoctorTable.Cols.NAME + "," +
                    DoctorFoundSchema.DoctorTable.Cols.EMAIL + " TEXT,"
            +       DoctorFoundSchema.DoctorTable.Cols.ADDRESS +" TEXT)" ;

    private static final String patientTable =
            "CREATE TABLE " + DoctorFoundSchema.PatientTable.NAME + " (" +
                   DoctorFoundSchema.PatientTable.Cols.PHONE + "INTEGER PRIMARY KEY, " +
                  DoctorFoundSchema.PatientTable.Cols.NAME + " TEXT," +
                    DoctorFoundSchema.DoctorTable.Cols.EMAIL + " TEXT,"
                    +      DoctorFoundSchema.PatientTable.Cols.ADDRESS +" TEXT)" ;
    private static final String cashierTable =
            "CREATE TABLE " + DoctorFoundSchema.CashierTable.NAME + " (" +
                    DoctorFoundSchema.CashierTable.Cols.PHONE + "INTEGER PRIMARY KEY, " +
                    DoctorFoundSchema.CashierTable.Cols.NAME + " TEXT," +
                    DoctorFoundSchema.CashierTable.Cols.ADDRESS + " TEXT," +
                    DoctorFoundSchema.CashierTable.Cols.EMAIL + " TEXT" + ")";
    private static final String adminTable =
            "CREATE TABLE " + DoctorFoundSchema.AdminTable.NAME + " (" +
            DoctorFoundSchema.AdminTable.Cols.PHONE + "INTEGER PRIMARY KEY, " +
                    DoctorFoundSchema.AdminTable.Cols.NAME + " TEXT," +
                    DoctorFoundSchema.AdminTable.Cols.ADDRESS + " TEXT," +
                    DoctorFoundSchema.AdminTable.Cols.EMAIL + " TEXT" + ")";
    private static final String appointmentTable =
            "CREATE TABLE " + DoctorFoundSchema.AppointmentTable.NAME + " (" +
                    DoctorFoundSchema.AppointmentTable.Cols.APPOINTMENT_NUMBER + "INTEGER PRIMARY KEY, "+
                    DoctorFoundSchema.AppointmentTable.Cols.DATE +" TEXT,"+
                    DoctorFoundSchema.AppointmentTable.Cols.DOCTOR_NAME + " TEXT,"+
                    DoctorFoundSchema.AppointmentTable.Cols.PATIENT_NAME + " TEXT" + ")";
    private static final String paymentTable =
            "CREATE TABLE " + DoctorFoundSchema.PaymentTable.NAME + " (" +
                    DoctorFoundSchema.PaymentTable.Cols.PAYMENT_ID + "INTEGER PRIMARY KEY, "+
                    DoctorFoundSchema.PaymentTable.Cols.BALANCE+" INTEGER, "+
                    DoctorFoundSchema.PaymentTable.Cols.DATE+" TEXT, "+
                    DoctorFoundSchema.PaymentTable.Cols.DOCTOR_NAME+" TEXT," +
                    DoctorFoundSchema.PaymentTable.Cols.INSURANCE+" TEXT,"+
                    DoctorFoundSchema.PaymentTable.Cols.PATIENT_NAME+" TEXT"+")";

    @Override
    public void onCreate(SQLiteDatabase db) {
      db.execSQL(doctorTable);
      db.execSQL(patientTable);
      db.execSQL(cashierTable);
      db.execSQL(adminTable);
      db.execSQL(cashierTable);
      db.execSQL(paymentTable);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
