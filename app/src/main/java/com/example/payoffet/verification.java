package com.example.payoffet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class verification extends AppCompatActivity {
    ImageView mImageView;
    EditText mTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verification);
        mImageView=findViewById(R.id.sign_up);
        mTextView=findViewById(R.id.Name);
        String name=mTextView.getText().toString();
        mImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Signed Up", Toast.LENGTH_SHORT).show();
                home(name);
            }
        });
    }
    public void home(String person)
    {
        Intent intent = new Intent(this,Home.class);
        intent.putExtra("Key",person);
        startActivity(intent);
    }
}