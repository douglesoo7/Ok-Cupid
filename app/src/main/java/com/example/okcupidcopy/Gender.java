package com.example.okcupidcopy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class Gender extends AppCompatActivity {
    private CheckBox mc1;
    private CheckBox mc2;
    private Button mb1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gender_preferences);
        mc1=findViewById(R.id.checkBox);
        mc2=findViewById(R.id.checkBox1);
        mb1=findViewById(R.id.bgen);
        mc1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PreferenceHelper.writeStringToPreference(Gender.this,"g","Male");
            }

        });

        mc1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PreferenceHelper.writeStringToPreference(Gender.this,"g","Male");
            }

        });

        mb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Gender.this,Preferences.class);
                startActivity(intent);
            }

        });

    }

}