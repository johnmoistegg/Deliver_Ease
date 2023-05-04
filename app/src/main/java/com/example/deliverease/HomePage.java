package com.example.deliverease;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class HomePage extends AppCompatActivity {

    ImageView  bigbrew_logo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        bigbrew_logo = findViewById(R.id.bigbrew_logo);

        bigbrew_logo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(HomePage.this,bigbrew.class);
                startActivity(intent);
            }
        });
    }
}