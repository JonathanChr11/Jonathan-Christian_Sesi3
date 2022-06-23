package com.example.jonathanchristian_sesi3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button logout;
    TextView username, email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        logout = findViewById(R.id.btn_logout);
        username = findViewById(R.id.tv_username);
        email = findViewById(R.id.tv_email);

        Intent intent = getIntent();
        String tempUsername = intent.getStringExtra("account username");

        username.setText(tempUsername);

        String tempEmail = intent.getStringExtra("account email");

        email.setText(tempEmail);

        logout.setOnClickListener(v -> {
            Intent logoutIntent = new Intent(MainActivity.this, LoginActivity.class);
            startActivity(logoutIntent);
        });
    }
}