package com.example.okcupidcopy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Setting extends AppCompatActivity {
    private Button mpaidfeature;
    private Button mtoEmail;
    private Button mtoPassword;
    private Button mPhonenumber;
    private Button mhelp;
    private Button mtoProfile;
    private ImageButton mtoHomeactivity;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);

        initView();
        intentuse();
    }

    private void intentuse() {
        mpaidfeature.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://help.okcupid.com/article/79-paid-features";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });
        mtoEmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Setting.this,Email.class);
                startActivity(intent);
                finish();
            }
        });
        mtoPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Setting.this,password.class);
                startActivity(intent);
                finish();
            }
        });
        mPhonenumber.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Setting.this,phone_number.class);
                startActivity(intent);
                finish();
            }
        });
        mhelp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://help.okcupid.com";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });
        mtoProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Setting.this,HomeActivity.class);
                startActivity(intent);
                finish();
            }
        });
        mtoHomeactivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Setting.this,Profile.class);
                startActivity(intent);
                finish();
            }
        });


    }

    private void initView() {
        mpaidfeature =findViewById(R.id.textView17);
        mtoEmail =findViewById(R.id.textView18);
        mtoPassword =findViewById(R.id.textView19);
        mPhonenumber =findViewById(R.id.textView20);
        mhelp =findViewById(R.id.textView21);
        mtoProfile =findViewById(R.id.textView22);
        mtoHomeactivity =findViewById(R.id.imb1);
    }
}