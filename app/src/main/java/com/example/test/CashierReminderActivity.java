package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class CashierReminderActivity extends AppCompatActivity {
    ListView listView;

    DFhelper db;
    ListView userlist;
    ArrayList<String> listItem;
    ArrayAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cashier_reminder);
        db = new DFhelper(this);

        listItem= new ArrayList<>();
        userlist=findViewById(R.id.appointment);
        viewData();

        userlist.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String text=userlist.getItemAtPosition(position).toString();
                Toast.makeText(CashierReminderActivity.this,""+text,Toast.LENGTH_SHORT).show();
            }
        });

    }

    private void viewData() {
        Cursor cursor =db.viewData();

        if(cursor.getCount()==0){
            Toast.makeText(this, "No data to show", Toast.LENGTH_SHORT).show();
        } else {
            while ((cursor.moveToNext())){
                listItem.add(cursor.getString(1));
            }

            adapter=new ArrayAdapter<>(this,android.R.layout.activity_list_item, listItem);
            userlist.setAdapter(adapter);
        }
    }
}
