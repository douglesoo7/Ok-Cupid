package com.example.okcupidcopy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class Preferences extends AppCompatActivity {
    private ImageButton mgender;
    private ImageButton mAge;
    private ImageButton mDistance;
    private ImageButton mConnection;
    private ImageButton mHeight;
    private ImageButton mstate;
    private ImageButton mskincolour;
    private ImageButton mbody;


    private TextView mage;
    private TextView mg1;
    private TextView mdis1;
    private TextView mcon;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preferences);
        initViews();
        useintent();
    }

    private void useintent() {
        mgender.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Preferences.this,Gender.class);
                startActivity(intent);
                finish();
            }
        });

        mAge.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Preferences.this,Age.class);
                startActivity(intent);
                finish();
            }
        });
        mDistance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Preferences.this,Distance.class);
                startActivity(intent);
                finish();
            }
        });
        mConnection.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Preferences.this,Connection.class);
                startActivity(intent);
                finish();
            }
        });


        shared();

        NotImplemented();

    }

    private void NotImplemented() {
        mHeight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Preferences.this,"Not implemented",Toast.LENGTH_SHORT).show();
            }
        });
        mstate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Preferences.this,"Not implemented",Toast.LENGTH_SHORT).show();
            }
        });
        mskincolour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Preferences.this,"Not implemented",Toast.LENGTH_SHORT).show();
            }
        });
        mbody.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Preferences.this,"Not implemented",Toast.LENGTH_SHORT).show();
            }
        });


    }

    private void shared() {
        String age=PreferenceHelper.getStringFromPreference(Preferences.this,"age");
        mage.setText(age);

        String gender=PreferenceHelper.getStringFromPreference(Preferences.this,"g");
        mg1.setText(gender);

        int distance=PreferenceHelper.getIntFromPreference(Preferences.this,"dis");
        mdis1.setText(distance + "");

        String con=PreferenceHelper.getStringFromPreference(Preferences.this,"con");
        mcon.setText(con);
    }

    private void initViews() {
        mgender =findViewById(R.id.imageBun);
        mAge =findViewById(R.id.imageBun1);
        mDistance =findViewById(R.id.imageBun2);
        mConnection =findViewById(R.id.imageBun3);
        mHeight =findViewById(R.id.imageBun4);
        mstate =findViewById(R.id.imageBun5);
        mskincolour =findViewById(R.id.imageBun6);
        mbody =findViewById(R.id.imageBun7);

        mage=findViewById(R.id.Ag1);
        mg1=findViewById(R.id.g1);
        mdis1=findViewById(R.id.d1);
        mcon=findViewById(R.id.cnx);
    }
}