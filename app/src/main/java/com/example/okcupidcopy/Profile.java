package com.example.okcupidcopy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Profile extends AppCompatActivity {
    private Button msetting;
    private Button mpreference;
    private Button mpaidfeature;
    private Button mpaidfeature1;
    private Button mpaidfeature2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        msetting =findViewById(R.id.tset);
        msetting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Profile.this,Setting.class);
                startActivity(intent);
            }
        });
        mpreference =findViewById(R.id.tpre);
        mpreference.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1=new Intent(Profile.this, Preferences.class);
                startActivity(intent1);
            }
        });

        mpaidfeature =findViewById(R.id.textView8);
        mpaidfeature.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://help.okcupid.com/article/79-paid-features";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });
        mpaidfeature1 =findViewById(R.id.textView9);
        mpaidfeature1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://help.okcupid.com/article/79-paid-features";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });
        mpaidfeature2 =findViewById(R.id.textView10);
        mpaidfeature2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://help.okcupid.com/article/218-read-receipts#:~:text=You'll%20now%20be%20able,been%20read%20within%20that%20conversation.";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });

    }

}