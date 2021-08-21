package com.example.okcupidcopy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class password extends AppCompatActivity {
    private TextView mPassword;
    private ImageButton mtoSetting;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_password);
        mPassword =findViewById(R.id.textView23);
        String pass= com.example.okcupidcopy.PreferenceHelper.getStringFromPreference(password.this,"password");
        mPassword.setText(pass);
        mtoSetting =findViewById(R.id.imageButton2);
        mtoSetting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(password.this,Setting.class);
                startActivity(intent);
            }
        });

    }
}