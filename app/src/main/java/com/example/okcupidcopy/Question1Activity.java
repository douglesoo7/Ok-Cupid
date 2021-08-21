package com.example.okcupidcopy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Question1Activity extends AppCompatActivity implements View.OnClickListener {

    private TextView mCarefree, mIntense,mSkip;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question1);
        initViews();
    }

    private void initViews() {
        mCarefree=findViewById(R.id.tvQ1CareFree);
        mIntense=findViewById(R.id.tvQ1Intense);
        mSkip=findViewById(R.id.tvQ1Skip);
        mCarefree.setOnClickListener(this);
        mIntense.setOnClickListener(this);
        mSkip.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int id=v.getId();
        switch(id){
            case R.id.tvQ1CareFree:
            case R.id.tvQ1Intense:
                Intent intent=new Intent(Question1Activity.this,Question2Activity.class);
                startActivity(intent);
                break;
                
                
            case R.id.tvQ1Skip:
                Intent intent1=new Intent(Question1Activity.this,Question2Activity.class);
                startActivity(intent1);
                break;
        }
    }
}