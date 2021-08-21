package com.example.okcupidcopy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class GenderActivity extends AppCompatActivity {

    private RadioGroup mRgGroup;
    private RadioButton mSelectedGender;
    private Button mBtnGenderNext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gender);
        initViews();
    }

    private void initViews() {
        mRgGroup=findViewById(R.id.radioGrp);
        mBtnGenderNext=findViewById(R.id.btnGenderNext);
        mBtnGenderNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mSelectedGender=mRgGroup.findViewById(mRgGroup.getCheckedRadioButtonId());
                if (mSelectedGender!=null){
                    Intent intent=new Intent(GenderActivity.this, BirthDateActivity.class);
                    startActivity(intent);
                }
                else{
                    Toast.makeText(GenderActivity.this,"Select Gender",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}