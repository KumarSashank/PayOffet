package com.example.payoffet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class Payment extends AppCompatActivity {
    ImageView mImageView,onlineview,offlineview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);
        mImageView=findViewById(R.id.home_pay);
        onlineview=findViewById(R.id.online_button);
        offlineview=findViewById(R.id.offline_button);
        mImageView.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Home Page", Toast.LENGTH_SHORT).show();
                home();
            }
        });

        onlineview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Online Mode", Toast.LENGTH_SHORT).show();
                pay();
            }
        });

        offlineview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Offline Mode", Toast.LENGTH_SHORT).show();
                pay();
            }
        });

    }
    public void home()
    {
        Intent intent = new Intent(this,Home.class);
        startActivity(intent);
    }

    public void pay()
    {
        Intent intent = new Intent(this,send_money.class);
        startActivity(intent);
    }
}