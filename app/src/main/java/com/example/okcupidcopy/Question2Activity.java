package com.example.okcupidcopy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Question2Activity extends AppCompatActivity implements View.OnClickListener {

    private TextView mQ2Option1,mQ2Option2,mQ2Option3, mQ2Option4, mQ2Skip;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question2);
        initViews();
    }

    private void initViews() {
        mQ2Option1=findViewById(R.id.tvQ2Option1);
        mQ2Option2=findViewById(R.id.tvQ2Option2);
        mQ2Option3=findViewById(R.id.tvQ2Option3);
        mQ2Option4 =findViewById(R.id.tvQ2Option4);
        mQ2Skip =findViewById(R.id.tvQ2Skip);
        mQ2Option1.setOnClickListener(this);
        mQ2Option2.setOnClickListener(this);
        mQ2Option3.setOnClickListener(this);
        mQ2Option4.setOnClickListener(this);
        mQ2Skip.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int id=v.getId();
        switch(id){
            case R.id.tvQ2Option1:
            case R.id.tvQ2Option2:
            case R.id.tvQ2Option3:
            case R.id.tvQ2Option4:
                Intent intent=new Intent(Question2Activity.this,Question3Activity.class);
                startActivity(intent);
                break;


            case R.id.tvQ2Skip:
                Intent intent1=new Intent(Question2Activity.this,Question3Activity.class);
                startActivity(intent1);
                break;
        }
    }
}