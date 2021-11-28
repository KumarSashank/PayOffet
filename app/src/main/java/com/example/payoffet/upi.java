package com.example.payoffet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class upi extends AppCompatActivity {
    ImageView mdone;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_upi);
        mdone=findViewById(R.id.done);
        mdone.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Done", Toast.LENGTH_SHORT).show();
                sent();
            }
        });
    }

    public void sent()
    {
        Intent intent = new Intent(this,done.class);
        startActivity(intent);
    }
}