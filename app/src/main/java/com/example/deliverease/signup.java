package com.example.deliverease;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class signup extends AppCompatActivity {

    private Button signup_button;
    private Button login_button_to_loginpage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        signup_button = (Button) findViewById(R.id.signup_button);

        signup_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(signup.this, MainActivity.class);
                startActivity(intent);
            }
        });

        login_button_to_loginpage = (Button) findViewById(R.id.login_button_to_loginpage);

        login_button_to_loginpage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(signup.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}