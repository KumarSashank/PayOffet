package com.example.payoffet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class Login extends AppCompatActivity {
    ImageView mImageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        mImageView=findViewById(R.id.sign_up);
        mImageView.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "otp sent", Toast.LENGTH_SHORT).show();
                getotp();
            }
        });
    }
    public void getotp()
    {
        Intent intent = new Intent(this,verification.class);
        startActivity(intent);
    }
}