package com.example.okcupidcopy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import java.lang.reflect.Array;

public class IdealPersonAgeActivity extends AppCompatActivity {

    private Spinner mSpAgeFrom,mSpAgeTo;
    private Button mBtnIdealPersonAge;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ideal_person_age);

        initViews();

        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<String>(IdealPersonAgeActivity.this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.ages));
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mSpAgeFrom.setAdapter(arrayAdapter);


        ArrayAdapter<String> arrayAdapter1=new ArrayAdapter<String>(IdealPersonAgeActivity.this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.ages));
        arrayAdapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mSpAgeTo.setAdapter(arrayAdapter1);
    }

    private void initViews() {
        mSpAgeFrom=findViewById(R.id.spAgeFrom);
        mSpAgeTo=findViewById(R.id.spAgeTo);
        mBtnIdealPersonAge=findViewById(R.id.btnInterestedInNext);
        mBtnIdealPersonAge.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(IdealPersonAgeActivity.this,TellUsAboutYourselfActivity.class);
                startActivity(intent);
            }
        });
    }
}