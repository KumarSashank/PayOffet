package com.example.payoffet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Home extends AppCompatActivity {
    ImageView mImageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Intent intent=getIntent();
        String personal;
        personal = intent.getStringExtra("Key");
        mImageView=findViewById(R.id.payment);
        mImageView.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View view) {
                  Toast.makeText(getApplicationContext(), "Payments", Toast.LENGTH_SHORT).show();
                  pay();
              }
          }
        );
    }
    public void pay()
    {
        Intent intent = new Intent(this,Payment.class);
        startActivity(intent);
    }
}