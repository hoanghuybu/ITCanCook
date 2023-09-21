package com.example.itcancook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    private ImageView imgViewArrowLeft;
    private TextView tvForgotPassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        mapping();


        //Event
        imgViewArrowLeft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this, CreateAccountOptionsActivity.class);
                startActivity(intent);
            }
        });

        tvForgotPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this, ForgotPasswordActivity.class);
                startActivity(intent);
            }
        });
    }

    private void mapping() {
        imgViewArrowLeft = findViewById(R.id.imgView_arrowLeft);
        tvForgotPassword = findViewById(R.id.tv_forgotpassword);
    }
}