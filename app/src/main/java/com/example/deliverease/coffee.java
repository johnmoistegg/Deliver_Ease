package com.example.deliverease;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class coffee extends AppCompatActivity {

    private Button milktea_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coffee);

        milktea_button = (Button) findViewById(R.id.milktea_button);

        milktea_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(coffee.this, bigbrew.class);
                startActivity(intent);
            }
        });
    }
}