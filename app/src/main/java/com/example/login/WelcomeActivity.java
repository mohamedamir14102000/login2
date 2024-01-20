package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class WelcomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) Button btnretour = findViewById(R.id.btnretour);

        TextView tvWelcomeMessage = findViewById(R.id.tvWelcomeMessage);

        String name = getIntent().getStringExtra("name");
        String surname = getIntent().getStringExtra("surname");
        String welcomeMessage = "Hello " + name + " " + surname + "! You have successfully registered.";
        tvWelcomeMessage.setText(welcomeMessage);

        btnretour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(WelcomeActivity.this, RegistreActivity.class);
                startActivity(i);
            }
        });

    }
}
