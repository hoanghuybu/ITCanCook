package com.example.itcancook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class VerifyOTPActivity extends AppCompatActivity {

    private Button btnConfirmOTP;
    private ImageView imgViewArrowLeft;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verify_otpactivity);
        mapping();

        //Event
        imgViewArrowLeft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(VerifyOTPActivity.this, ForgotPasswordActivity.class);
                startActivity(intent);
            }
        });

        btnConfirmOTP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(VerifyOTPActivity.this, CreateNewPasswordActivity.class);
                startActivity(intent);
            }
        });
    }

    private void mapping(){
        btnConfirmOTP = findViewById(R.id.btn_confirm);
        imgViewArrowLeft = findViewById(R.id.imgView_arrowLeft_verifyOTP);
    }


}