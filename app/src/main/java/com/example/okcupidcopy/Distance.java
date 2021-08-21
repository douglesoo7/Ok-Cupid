package com.example.okcupidcopy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Distance extends AppCompatActivity {

    private EditText mDistance;
    private Button mtoPreference;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_distance);
        mDistance =findViewById(R.id.spDis);
        mtoPreference =findViewById(R.id.bx1);
        mtoPreference.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PreferenceHelper.writeIntToPreference(Distance.this,"dis", Integer.parseInt(mDistance.getText().toString()));
                Intent intent=new Intent(Distance.this,Preferences.class);
                startActivity(intent);
                finish();
            }
        });
        //
    }
}