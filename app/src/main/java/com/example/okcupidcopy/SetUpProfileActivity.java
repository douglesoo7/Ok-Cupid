package com.example.okcupidcopy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SetUpProfileActivity extends AppCompatActivity {

    private Button mBtnSetupNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_set_up_profile);
        mBtnSetupNext=findViewById(R.id.btnSetupNext);
        mBtnSetupNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(SetUpProfileActivity.this, FirstNameActivity.class);
                startActivity(intent);
            }
        });
    }
}