package com.example.okcupidcopy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Question4Activity extends AppCompatActivity implements View.OnClickListener{

    private TextView mQ4Option1, mQ4Option2,mQ4Skip;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question4);
        initViews();
    }


    private void initViews() {
        mQ4Option1=findViewById(R.id.tvQ4Option1);
        mQ4Option2=findViewById(R.id.tvQ4Option2);
        mQ4Skip=findViewById(R.id.tvQ4Skip);
        mQ4Option1.setOnClickListener(this);
        mQ4Option2.setOnClickListener(this);
        mQ4Skip.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int id=v.getId();
        switch(id){
            case R.id.tvQ4Option1:
            case R.id.tvQ4Option2:
                Intent intent=new Intent(Question4Activity.this,Question5Activity.class);
                startActivity(intent);
                break;


            case R.id.tvQ4Skip:
                Intent intent1=new Intent(Question4Activity.this,Question5Activity.class);
                startActivity(intent1);
                break;
        }
    }
}