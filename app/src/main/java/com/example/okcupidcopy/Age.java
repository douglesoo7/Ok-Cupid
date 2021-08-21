package com.example.okcupidcopy;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Calendar;

public class Age extends AppCompatActivity {

    private TextView tAge;
    private Button mBtnBirthDate;
    DatePickerDialog.OnDateSetListener setListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_age);


        Calendar calendar=Calendar.getInstance();
        final int year=calendar.get(Calendar.YEAR);
        final int month=calendar.get(Calendar.MONDAY);
        final int day=calendar.get(Calendar.DAY_OF_MONTH);

        tAge=findViewById(R.id.tAge);

        tAge.setOnClickListener(new View.OnClickListener() {



            @RequiresApi(api = Build.VERSION_CODES.N)
            @Override
            public void onClick(View v) {
                DatePickerDialog datePickerDialog=new DatePickerDialog(Age.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int month, int day) {
                        month=month+1;
                        String dob=day+"/"+month+"/"+year;
                        tAge.setText(dob);
                    }
                },year,month,day);
                datePickerDialog.show();
            }
        });

        mBtnBirthDate=findViewById(R.id.button);
        mBtnBirthDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PreferenceHelper.writeStringToPreference(Age.this,"age",tAge.getText().toString());
                Intent intent=new Intent(Age.this,Preferences.class);
                startActivity(intent);
            }
        });
    }
}