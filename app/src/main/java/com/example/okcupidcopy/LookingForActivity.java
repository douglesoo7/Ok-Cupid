package com.example.okcupidcopy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LookingForActivity extends AppCompatActivity {

    private Button mBtnLookingFor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_looking_for);
        mBtnLookingFor=findViewById(R.id.btnLookingForNext);
        mBtnLookingFor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(LookingForActivity.this, IdealPersonActivity.class);
                startActivity(intent);
            }
        });
    }
}