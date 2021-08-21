package com.example.okcupidcopy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AnswerQuestionsActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer_questions);
        Button btnAnswerQuestionsNext=findViewById(R.id.btnAnswerQuestionsNext);
        btnAnswerQuestionsNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(AnswerQuestionsActivity.this,Question1Activity.class);
                startActivity(intent);
            }
        });
    }
}