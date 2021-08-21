package com.example.okcupidcopy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

import java.security.PrivateKey;

public class LoginUsingEmailActivity extends AppCompatActivity implements View.OnClickListener{

    private Button mBtnLoginUsingEmailNext,mBtnLoginUsingEmailUsingPhone;
    private TextView mTvLoginUsingEmailForgotPassword;
    private ImageView mIvLoginUsingEmailBack;
    private TextInputEditText mEtLoginUsingEmailEmail,mEtLoginUsingEmailPassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_using_email);
        initViews();
    }

    private void initViews() {
        mBtnLoginUsingEmailNext=findViewById(R.id.btnLoginUsingEmailNext);
        mBtnLoginUsingEmailUsingPhone=findViewById(R.id.btnLoginUsingEmailUsingPhone);
        mTvLoginUsingEmailForgotPassword=findViewById(R.id.tvLoginUsingEmailForgotPassword);
        mIvLoginUsingEmailBack=findViewById(R.id.ivBackLoginUsingEmail);
        mEtLoginUsingEmailEmail=findViewById(R.id.etLoginUsingEmailEmail);
        mEtLoginUsingEmailPassword=findViewById(R.id.etLoginUsingEmailPassword);

        mBtnLoginUsingEmailNext.setOnClickListener(this);
        mBtnLoginUsingEmailUsingPhone.setOnClickListener(this);
        mTvLoginUsingEmailForgotPassword.setOnClickListener(this);
        mIvLoginUsingEmailBack.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        int id=v.getId();
        switch(id){
            case R.id.btnLoginUsingEmailNext:
                if (mEtLoginUsingEmailEmail.getText().toString().trim().equals(PreferenceHelper.getStringFromPreference(LoginUsingEmailActivity.this,"email")) &&
                        mEtLoginUsingEmailPassword.getText().toString().equals(PreferenceHelper.getStringFromPreference(LoginUsingEmailActivity.this,"password"))) {
                    Intent intent = new Intent(LoginUsingEmailActivity.this, DashboardActivity.class);
                    startActivity(intent);
                    finishAffinity();
                }
                else {
                    Toast.makeText(this, "Invalid Email or Password", Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.btnLoginUsingEmailUsingPhone:
            case R.id.ivBackLoginUsingEmail:
                Intent intent1=new Intent(LoginUsingEmailActivity.this, LoginUsingPhoneActivity.class);
                startActivity(intent1);
                break;

            case R.id.tvLoginUsingEmailForgotPassword:
                break;

        }
    }
}