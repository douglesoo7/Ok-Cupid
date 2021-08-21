package com.example.okcupidcopy;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Spinner;

import java.util.Calendar;

public class BirthDateActivity extends AppCompatActivity {
    private EditText mEtDob;
    private Button mBtnBirthDateNext;
    DatePickerDialog.OnDateSetListener setListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_birth_date);

        Calendar calendar=Calendar.getInstance();
        final int year=calendar.get(Calendar.YEAR);
        final int month=calendar.get(Calendar.MONDAY);
        final int day=calendar.get(Calendar.DAY_OF_MONTH);

        mEtDob=findViewById(R.id.etDob);
        mEtDob.setOnClickListener(new View.OnClickListener() {



            @RequiresApi(api = Build.VERSION_CODES.N)
            @Override
            public void onClick(View v) {
                DatePickerDialog datePickerDialog=new DatePickerDialog(BirthDateActivity.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int month, int day) {
                        month=month+1;
                        String dob=day+"/"+month+"/"+year;
                        mEtDob.setText(dob);
                    }
                },year,month,day);
                datePickerDialog.show();
            }
        });
        mBtnBirthDateNext=findViewById(R.id.btnBirthDateNext);
        mBtnBirthDateNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(BirthDateActivity.this,LocationActivity.class);
                startActivity(intent);
            }
        });

    }



}