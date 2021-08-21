package com.example.okcupidcopy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class SignUpPasswordActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageView mIvBack;
    private Button mSignUp;
    private EditText mEtSignUpPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up_password);
        initViews();
    }

    private void initViews() {
        mIvBack = findViewById(R.id.ivBackSignUpPassword);
        mIvBack.setOnClickListener(this);
        mSignUp = findViewById(R.id.btnPasswordSignUp);
        mSignUp.setOnClickListener(this);
        mEtSignUpPassword = findViewById(R.id.etSignUpPassword);
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        switch (id) {
            case R.id.ivBackSignUpPassword:
                Intent intent = new Intent(SignUpPasswordActivity.this, SignUpEmailActivity.class);
                startActivity(intent);
                break;
            case R.id.btnPasswordSignUp:
                if (isPasswordValid()) {
                    PreferenceHelper.getSharedPreference(this);
                    String password = mEtSignUpPassword.getText().toString();
                    PreferenceHelper.writeStringToPreference(SignUpPasswordActivity.this, "password", password);
                    Intent intent1 = new Intent(SignUpPasswordActivity.this, SetUpProfileActivity.class);
                    startActivity(intent1);
                    break;
                }
        }
    }

    private boolean isPasswordValid() {
        if (mEtSignUpPassword.getText().toString().length() >= 8)
            return true;
        else {
            mEtSignUpPassword.setError("Password Length Too Short");
            return false;
        }

    }
}