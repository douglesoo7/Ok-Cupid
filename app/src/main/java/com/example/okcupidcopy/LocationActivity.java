package com.example.okcupidcopy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import com.hbb20.CountryCodePicker;

public class LocationActivity extends AppCompatActivity {

    private Button mBtnLocationNext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_location);
        initView();
    }

    private void initView() {
        mBtnLocationNext=findViewById(R.id.btnLocationNext);
        mBtnLocationNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(LocationActivity.this,LookingForActivity.class);
                startActivity(intent);
            }
        });
    }


}