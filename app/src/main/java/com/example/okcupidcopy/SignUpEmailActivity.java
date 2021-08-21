package com.example.okcupidcopy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class SignUpEmailActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageView mIvBack;
    private Button nextSignUpEmail;
    private EditText mEtSignUpEmail;
    private String eMailValidation="[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up_email);
        initViews();
    }

    private void initViews() {
        mIvBack=findViewById(R.id.ivBackSignUpEmail);
        mIvBack.setOnClickListener(this);
        nextSignUpEmail=findViewById(R.id.btnSignUpEmailNext);
        nextSignUpEmail.setOnClickListener(this);
        mEtSignUpEmail =findViewById(R.id.etSignUpEmail);
    }

    @Override
    public void onClick(View v) {
        int id=v.getId();
        switch(id){
            case R.id.ivBackSignUpEmail:
                Intent intent=new Intent(SignUpEmailActivity.this,HomeActivity.class);
                startActivity(intent);
                break;
            case R.id.btnSignUpEmailNext:
                if (isEmailValid()) {
                    PreferenceHelper.getSharedPreference(this);
                    String email=mEtSignUpEmail.getText().toString().trim();
                    PreferenceHelper.writeStringToPreference(SignUpEmailActivity.this,"email",email);
                    Intent intent1 = new Intent(SignUpEmailActivity.this, SignUpPasswordActivity.class);
                    startActivity(intent1);
                    break;
                }
        }
    }
    private boolean isEmailValid() {
        if (mEtSignUpEmail.getText().toString().trim().matches(eMailValidation))
            return true;
        else {
            mEtSignUpEmail.setError("Invalid Email");
            return false;
        }

    }
}