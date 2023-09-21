package com.example.itcancook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CreateAccountOptionsActivity extends AppCompatActivity {

    private TextView tvLinkLogin;
    private Button btnRegister;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_account_options);
        mapping();


        //Event
        tvLinkLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CreateAccountOptionsActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });

        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CreateAccountOptionsActivity.this, RegisterActivity.class);
                startActivity(intent);
            }
        });
    }

    private void mapping() {
        tvLinkLogin = findViewById(R.id.tv_linkLogin);
        btnRegister = findViewById(R.id.btn_linkRegister);
    }
}