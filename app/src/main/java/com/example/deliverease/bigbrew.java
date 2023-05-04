package com.example.deliverease;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class bigbrew extends AppCompatActivity {

    private Button coffee_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bigbrew);

        coffee_button = (Button) findViewById(R.id.coffee_button);

        coffee_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(bigbrew.this, coffee.class);
                startActivity(intent);
            }
        });
    }
}