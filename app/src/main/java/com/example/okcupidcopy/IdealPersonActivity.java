package com.example.okcupidcopy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class IdealPersonActivity extends AppCompatActivity {

    private CheckBox mCbHookups,mCbNewFriends, mCbShortTermDating, mCbLongTermDating;
    private Button mBtnIdealPersonNext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ideal_person);
        initViews();
    }

    private void initViews() {
        mCbHookups=findViewById(R.id.cbHookups);
        mCbNewFriends=findViewById(R.id.cbNewFriends);
        mCbShortTermDating=findViewById(R.id.cbShortTermDating);
        mCbLongTermDating=findViewById(R.id.cbLongTermDating);
        mBtnIdealPersonNext=findViewById(R.id.btnIdealPersonNext);
        mBtnIdealPersonNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(IdealPersonActivity.this, InterestedInActivity.class);
                startActivity(intent);
            }
        });
    }
}