package com.example.okcupidcopy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Question5Activity extends AppCompatActivity implements View.OnClickListener{

    private TextView mQ5Option1,mQ5Option2,mQ5Option3,mQ5Option4,mQ5Skip;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question5);
        initViews();
    }

    private void initViews() {
        mQ5Option1=findViewById(R.id.tvQ5Option1);
        mQ5Option2=findViewById(R.id.tvQ5Option2);
        mQ5Option3=findViewById(R.id.tvQ5Option3);
        mQ5Option4=findViewById(R.id.tvQ5Option4);
        mQ5Skip=findViewById(R.id.tvQ5Skip);
        mQ5Option1.setOnClickListener(this);
        mQ5Option2.setOnClickListener(this);
        mQ5Option3.setOnClickListener(this);
        mQ5Option4.setOnClickListener(this);
        mQ5Skip.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int id=v.getId();
        switch(id){
            case R.id.tvQ5Option1:
            case R.id.tvQ5Option2:
            case R.id.tvQ5Option3:
            case R.id.tvQ5Option4:
                PreferenceHelper.getSharedPreference(Question5Activity.this);
                PreferenceHelper.writeStatusToPreference(Question5Activity.this,"status",true);
                Intent intent=new Intent(Question5Activity.this,DashboardActivity.class);
                startActivity(intent);
                finishAffinity();
                break;


            case R.id.tvQ5Skip:
                Intent intent1=new Intent(Question5Activity.this,DashboardActivity.class);
                startActivity(intent1);
                finish();
                break;
        }
    }
}