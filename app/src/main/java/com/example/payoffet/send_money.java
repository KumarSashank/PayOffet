package com.example.payoffet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class send_money extends AppCompatActivity {
    ImageView msend;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send_money);
        msend=findViewById(R.id.send);
        msend.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "send", Toast.LENGTH_SHORT).show();
                upi();
            }
        });

    }

    public void upi()
    {
        Intent intent = new Intent(this,upi.class);
        startActivity(intent);
    }
}