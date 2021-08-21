package com.example.okcupidcopy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TellUsAboutYourselfActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tell_us_about_yourself);
        Button btnTellUsNext=findViewById(R.id.btnTellUsAboutNext);
        btnTellUsNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(TellUsAboutYourselfActivity.this,IntroduceYourselfActivity.class);
                startActivity(intent);
            }
        });
    }
}