package com.example.test;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DFhelper extends SQLiteOpenHelper {
    private static final int VERSION = 1;
    private static final String DatabseName = "DoctorFound.db";
    SQLiteDatabase db;
    public DFhelper(Context context) {
        super(context,DatabseName,null,VERSION);
    }
    private static final String doctorTable =
            "CREATE TABLE " + DoctorFoundSchema.DoctorTable.NAME + " (" +
                    DoctorFoundSchema.DoctorTable.Cols.PHONE + "INTEGER PRIMARY KEY, " +
                    DoctorFoundSchema.DoctorTable.Cols.USERNAME + " TEXT," +
                    DoctorFoundSchema.DoctorTable.Cols.PASSWORD + " TEXT," +
                    DoctorFoundSchema.DoctorTable.Cols.NAME + " TEXT," +
                    DoctorFoundSchema.DoctorTable.Cols.EMAIL + " TEXT,"+
                    DoctorFoundSchema.DoctorTable.Cols.BIRTHDATE + " TEXT," +
                    DoctorFoundSchema.DoctorTable.Cols.ADDRESS + " TEXT,"
                    +       DoctorFoundSchema.DoctorTable.Cols.CERTIFICATION +" TEXT)" ;

    private static final String patientTable =
            "CREATE TABLE " + DoctorFoundSchema.PatientTable.NAME + " (" +
                    DoctorFoundSchema.PatientTable.Cols.PHONE + "INTEGER PRIMARY KEY, " +
                    DoctorFoundSchema.PatientTable.Cols.USERNAME + " TEXT," +
                    DoctorFoundSchema.PatientTable.Cols.PASSWORD + " TEXT," +
                    DoctorFoundSchema.PatientTable.Cols.NAME + " TEXT," +
                    DoctorFoundSchema.PatientTable.Cols.EMAIL + " TEXT,"+
                    DoctorFoundSchema.PatientTable.Cols.BIRTHDATE + " TEXT," +
                    DoctorFoundSchema.PatientTable.Cols.ADDRESS + " TEXT," +
                    DoctorFoundSchema.PatientTable.Cols.CREDITNUMBER + " INTEGER," +
                    DoctorFoundSchema.PatientTable.Cols.CVV + " INTEGER,"
                    +      DoctorFoundSchema.PatientTable.Cols.EXPDATE +" INTEGER)" ;

    private static final String cashierTable =
            "CREATE TABLE " + DoctorFoundSchema.CashierTable.NAME + " (" +
                    DoctorFoundSchema.CashierTable.Cols.PHONE + "INTEGER PRIMARY KEY, " +
                    DoctorFoundSchema.CashierTable.Cols.USERNAME + " TEXT," +
                    DoctorFoundSchema.CashierTable.Cols.PASSWORD + " TEXT," +
                    DoctorFoundSchema.CashierTable.Cols.NAME + " TEXT," +
                    DoctorFoundSchema.CashierTable.Cols.EMAIL + " TEXT,"+
                    DoctorFoundSchema.CashierTable.Cols.BIRTHDATE + " TEXT," +
                    DoctorFoundSchema.CashierTable.Cols.ADDRESS + " TEXT,"
                    +       DoctorFoundSchema.CashierTable.Cols.CERTIFICATION +" TEXT)" ;

    private static final String adminTable =
            "CREATE TABLE " + DoctorFoundSchema.AdminTable.NAME + " (" +
                    DoctorFoundSchema.AdminTable.Cols.PHONE + "INTEGER PRIMARY KEY, " +
                    DoctorFoundSchema.AdminTable.Cols.USERNAME + " TEXT," +
                    DoctorFoundSchema.AdminTable.Cols.PASSWORD + " TEXT," +
                    DoctorFoundSchema.AdminTable.Cols.NAME + " TEXT," +
                    DoctorFoundSchema.AdminTable.Cols.EMAIL + " TEXT,"+
                    DoctorFoundSchema.AdminTable.Cols.BIRTHDATE + " TEXT,"
                    +       DoctorFoundSchema.AdminTable.Cols.ADDRESS +" TEXT)" ;

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
                    DoctorFoundSchema.PaymentTable.Cols.DOCTOR_NAME+" TEXT, " +
                    DoctorFoundSchema.PaymentTable.Cols.INSURANCE+" TEXT, "+
                    DoctorFoundSchema.PaymentTable.Cols.PATIENT_NAME+" TEXT "+")";

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

    //CUSTOM METHODS
    //create seperate insert method for doctor, patient, admin, and cashier


    //write doctor to database
    public void insertDoctor(DoctorFoundSchema dfs){

        //used to write to database
        db = this.getWritableDatabase();
        ContentValues valuesDoctor = new ContentValues();

        String query = "SELECT * FROM " + DoctorFoundSchema.DoctorTable.NAME;
        Cursor cursor = db.rawQuery(query, null);

        valuesDoctor.put(DoctorFoundSchema.DoctorTable.Cols.PHONE, dfs.getDoctorPhone());
        valuesDoctor.put(DoctorFoundSchema.DoctorTable.Cols.USERNAME, dfs.getDoctorUsername());
        valuesDoctor.put(DoctorFoundSchema.DoctorTable.Cols.PASSWORD, dfs.getDoctorPassword());
        valuesDoctor.put(DoctorFoundSchema.DoctorTable.Cols.NAME, dfs.getDoctorFullName());
        valuesDoctor.put(DoctorFoundSchema.DoctorTable.Cols.EMAIL, dfs.getDoctorEmail());
        valuesDoctor.put(DoctorFoundSchema.DoctorTable.Cols.BIRTHDATE, dfs.getDoctorBirthdate());
        valuesDoctor.put(DoctorFoundSchema.DoctorTable.Cols.ADDRESS, dfs.getDoctorAddress());
        valuesDoctor.put(DoctorFoundSchema.DoctorTable.Cols.CERTIFICATION, dfs.getDoctorCertification());

        db.insert(DoctorFoundSchema.DoctorTable.NAME, null, valuesDoctor);
        db.close(); //close at end
        cursor.close();
    }

    //write patient to database
    public void insertPatient(DoctorFoundSchema dfs){

        //used to write to database
        db = this.getWritableDatabase();
        ContentValues valuesPatient = new ContentValues();

        String query = "SELECT * FROM " + DoctorFoundSchema.PatientTable.NAME;
        Cursor cursor = db.rawQuery(query, null);

        valuesPatient.put(DoctorFoundSchema.PatientTable.Cols.PHONE, dfs.getPatientPhone());
        valuesPatient.put(DoctorFoundSchema.PatientTable.Cols.USERNAME, dfs.getPatientUsername());
        valuesPatient.put(DoctorFoundSchema.PatientTable.Cols.PASSWORD, dfs.getPatientPassword());
        valuesPatient.put(DoctorFoundSchema.PatientTable.Cols.NAME, dfs.getPatientFullName());
        valuesPatient.put(DoctorFoundSchema.PatientTable.Cols.EMAIL, dfs.getPatientEmail());
        valuesPatient.put(DoctorFoundSchema.PatientTable.Cols.BIRTHDATE, dfs.getPatientBirthdate());
        valuesPatient.put(DoctorFoundSchema.PatientTable.Cols.ADDRESS, dfs.getPatientAddress());
        valuesPatient.put(DoctorFoundSchema.PatientTable.Cols.CREDITNUMBER, dfs.getPatientCreditNumber());
        valuesPatient.put(DoctorFoundSchema.PatientTable.Cols.CVV, dfs.getPatientCVV());
        valuesPatient.put(DoctorFoundSchema.PatientTable.Cols.EXPDATE, dfs.getPatientExpDate());

        db.insert(DoctorFoundSchema.PatientTable.NAME, null, valuesPatient);
        db.close(); //close at end
        cursor.close();
    }
    //write cashier to database
    public void insertCashier(DoctorFoundSchema dfs){

        //used to write to database
        db = this.getWritableDatabase();
        ContentValues valuesCashier = new ContentValues();

        String query = "SELECT * FROM " + DoctorFoundSchema.CashierTable.NAME;
        Cursor cursor = db.rawQuery(query, null);

        valuesCashier.put(DoctorFoundSchema.CashierTable.Cols.PHONE, dfs.getCashierPhone());
        valuesCashier.put(DoctorFoundSchema.CashierTable.Cols.USERNAME, dfs.getCashierUsername());
        valuesCashier.put(DoctorFoundSchema.CashierTable.Cols.PASSWORD, dfs.getCashierPassword());
        valuesCashier.put(DoctorFoundSchema.CashierTable.Cols.NAME, dfs.getCashierFullName());
        valuesCashier.put(DoctorFoundSchema.CashierTable.Cols.EMAIL, dfs.getCashierEmail());
        valuesCashier.put(DoctorFoundSchema.CashierTable.Cols.BIRTHDATE, dfs.getCashierBirthdate());
        valuesCashier.put(DoctorFoundSchema.CashierTable.Cols.ADDRESS, dfs.getCashierAddress());
        valuesCashier.put(DoctorFoundSchema.CashierTable.Cols.CERTIFICATION, dfs.getCashierCertification());

        db.insert(DoctorFoundSchema.CashierTable.NAME, null, valuesCashier);
        db.close(); //close at end
        cursor.close();
    }

    //write admin to database
    public void insertAdmin(DoctorFoundSchema dfs){

        //used to write to database
        db = this.getWritableDatabase();
        ContentValues valuesAdmin = new ContentValues();

        String query = "SELECT * FROM " + DoctorFoundSchema.AdminTable.NAME;
        Cursor cursor = db.rawQuery(query, null);

        valuesAdmin.put(DoctorFoundSchema.AdminTable.Cols.PHONE, dfs.getAdminPhone());
        valuesAdmin.put(DoctorFoundSchema.AdminTable.Cols.USERNAME, dfs.getAdminUsername());
        valuesAdmin.put(DoctorFoundSchema.AdminTable.Cols.PASSWORD, dfs.getAdminPassword());
        valuesAdmin.put(DoctorFoundSchema.AdminTable.Cols.NAME, dfs.getAdminFullName());
        valuesAdmin.put(DoctorFoundSchema.AdminTable.Cols.EMAIL, dfs.getAdminEmail());
        valuesAdmin.put(DoctorFoundSchema.AdminTable.Cols.BIRTHDATE, dfs.getAdminBirthdate());
        valuesAdmin.put(DoctorFoundSchema.AdminTable.Cols.ADDRESS, dfs.getAdminAddress());

        db.insert(DoctorFoundSchema.AdminTable.NAME, null, valuesAdmin);
        db.close(); //close at end
        cursor.close();
    }





//    //open database, read, find and return password(String)
//    public String searchPass(String uname){
//
//        //Read from database, using database object at top of code
//        db = this.getReadableDatabase();
//
//        //create query, use cursor to use query
//        String query = "select uname, pass from " + TABLE_NAME;
//        Cursor cursor = db.rawQuery(query, null);
//        String Uname, Pass = "password not found";
//
//        //iterate through all passwords, if find correct uname, break out of loop
//        if(cursor.moveToFirst()){
//            do {
//                Uname = cursor.getString(0);
//
//                if(Uname.equals(uname)){          //"uname" is parameter passed into this custom method
//                    Pass = cursor.getString(1);  //set Pass, to corresponding password
//                    break; //break out of do-while loop
//                }
//            }while(cursor.moveToNext());
//        }
//        cursor.close();
//        db.close();
//        return Pass; //return this password, for comparisons
//    }


}

