package com.example.okcupidcopy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class phone_number extends AppCompatActivity {
    private TextView mphone;
    private ImageButton mtoSetting;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phone_number);
        mphone=findViewById(R.id.textView23);
        mtoSetting =findViewById(R.id.imageBut2);
        int phone=PreferenceHelper.getIntFromPreference(phone_number.this,"phone");
        mphone.setText(phone+"");
        mtoSetting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(phone_number.this,Setting.class);
                startActivity(intent);
            }
        });

    }
}