package com.example.okcupidcopy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Question3Activity extends AppCompatActivity implements View.OnClickListener{

    private TextView mQ3Option1, mQ3Option2,mQ3Skip;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question3);
        initViews();
    }

    private void initViews() {
        mQ3Option1=findViewById(R.id.tvQ3Option1);
        mQ3Option2=findViewById(R.id.tvQ3Option2);
        mQ3Skip=findViewById(R.id.tvQ3Skip);
        mQ3Option1.setOnClickListener(this);
        mQ3Option2.setOnClickListener(this);
        mQ3Skip.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int id=v.getId();
        switch(id){
            case R.id.tvQ3Option1:
            case R.id.tvQ3Option2:
                Intent intent=new Intent(Question3Activity.this,Question4Activity.class);
                startActivity(intent);
                break;


            case R.id.tvQ3Skip:
                Intent intent1=new Intent(Question3Activity.this,Question4Activity.class);
                startActivity(intent1);
                break;
        }
    }
}