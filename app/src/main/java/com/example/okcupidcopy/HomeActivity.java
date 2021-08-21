package com.example.okcupidcopy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView mTvSignIn;
    private Button mBtnSignUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        initViews();
    }

    private void initViews() {
        mTvSignIn = findViewById(R.id.tvSignIn);
        mTvSignIn.setOnClickListener(this);

        mBtnSignUp = findViewById(R.id.btnSignUp);
        mBtnSignUp.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        switch (id) {
            case R.id.tvSignIn:
                Intent intent = new Intent(HomeActivity.this, LoginUsingPhoneActivity.class);
                startActivity(intent);
                break;
            case R.id.btnSignUp:
                Intent intent1=new Intent(HomeActivity.this, SignUpEmailActivity.class);
                startActivity(intent1);
                break;
        }
    }
}