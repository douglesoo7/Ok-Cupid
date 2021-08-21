package com.example.okcupidcopy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class IntroduceYourselfActivity extends AppCompatActivity {

    private Button mBtnIntroduceYourselfNext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_introduce_yourself);
        initView();
    }

    private void initView() {
        mBtnIntroduceYourselfNext=findViewById(R.id.btnIntroduceYourselfNext);
        mBtnIntroduceYourselfNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(IntroduceYourselfActivity.this, AnswerQuestionsActivity.class);
                startActivity(intent);
            }
        });
    }
}