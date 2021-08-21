package com.example.okcupidcopy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.google.android.material.textfield.TextInputEditText;

public class LoginUsingPhoneActivity extends AppCompatActivity implements View.OnClickListener {

    private Button mBtnLoginUsingPhoneNext,mBtnLoginUsingPhoneUsingEmail;
    private ImageView mIvLoginUsingPhoneBack;
    private TextInputEditText savephone;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_using_phone);
        initView();
    }

    private void initView() {
        mBtnLoginUsingPhoneNext=findViewById(R.id.btnLoginUsingPhoneNext);
        mIvLoginUsingPhoneBack=findViewById(R.id.ivBackLoginUsingPhone);
        mBtnLoginUsingPhoneUsingEmail=findViewById(R.id.btnLoginUsingPhoneLogInUsingEmail);
        savephone=findViewById(R.id.etLoginUsingPhone);
        mBtnLoginUsingPhoneUsingEmail.setOnClickListener(this);
        mIvLoginUsingPhoneBack.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int id=v.getId();
        switch (id){
            case R.id.ivBackLoginUsingPhone:
                Intent intent=new Intent(LoginUsingPhoneActivity.this,HomeActivity.class);
                startActivity(intent);
                break;
            case R.id.btnLoginUsingPhoneLogInUsingEmail:
                Intent intent1=new Intent(LoginUsingPhoneActivity.this,LoginUsingEmailActivity.class);
                startActivity(intent1);
                break;
        }
    }
}