package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import com.parse.ParseObject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import com.parse.ParseObject;

public class RegistreActivity extends AppCompatActivity {

    private EditText etName, etSurname, etAge, etUsername, etPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        etName = findViewById(R.id.Name);
        etSurname = findViewById(R.id.Surname);
        etAge = findViewById(R.id.Age);
        etUsername = findViewById(R.id.Username);
        etPassword = findViewById(R.id.Password);

        Button btnRegister = findViewById(R.id.btnRegister);
        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                registerUser();
            }
        });
    }

    private void registerUser() {
        String name = etName.getText().toString().trim();
        String surname = etSurname.getText().toString().trim();
        int age = Integer.parseInt(etAge.getText().toString().trim());
        String username = etUsername.getText().toString().trim();
        String password = etPassword.getText().toString().trim();

        ParseObject userObject = new ParseObject("User");
        userObject.put("Name", name);
        userObject.put("Surname", surname);
        userObject.put("Age", age);
        userObject.put("Username", username);
        userObject.put("Password", password);

        userObject.saveInBackground(e -> {

            if ( name == "" || surname== "" || etAge.getText().toString()== "" || username== ""|| password== "")
            {
                Toast.makeText(RegistreActivity.this, "Registration failed. Please try again.", Toast.LENGTH_SHORT).show();
            }



             else {
                openWelcomeActivity(name, surname);}
        });
    }

    private void openWelcomeActivity(String name, String surname) {
        Intent intent = new Intent(RegistreActivity.this, WelcomeActivity.class);
        intent.putExtra("name", name);
        intent.putExtra("surname", surname);
        startActivity(intent);
        finish();
    }
}

