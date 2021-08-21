package com.example.okcupidcopy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class InterestedInActivity extends AppCompatActivity {

    private Button mBtnInterestedIntNext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interested_in);

        mBtnInterestedIntNext=findViewById(R.id.btnInterestedInNext);
        mBtnInterestedIntNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(InterestedInActivity.this, IdealPersonAgeActivity.class);
                startActivity(intent);
            }
        });
    }
}