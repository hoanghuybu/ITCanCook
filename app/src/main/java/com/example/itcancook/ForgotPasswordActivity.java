package com.example.itcancook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class ForgotPasswordActivity extends AppCompatActivity {

    private ImageView imgViewArrowLeft;
    private Button btnForgotPassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password);
        mapping();

        //Event
        imgViewArrowLeft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ForgotPasswordActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });
        btnForgotPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ForgotPasswordActivity.this, VerifyOTPActivity.class);
                startActivity(intent);
            }
        });
    }

    private void mapping() {
        imgViewArrowLeft = findViewById(R.id.imgView_arrowLeft_forgotPassword);
        btnForgotPassword = findViewById(R.id.btn_sendCode_forgotPassword);
    }
}