package com.example.itcancook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class CreateNewPasswordActivity extends AppCompatActivity {

    private ImageView imgViewArrowLeft;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_new_password);
        mapping();


        //Event
        imgViewArrowLeft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CreateNewPasswordActivity.this, VerifyOTPActivity.class);
                startActivity(intent);
            }
        });
    }

    private void mapping(){
        imgViewArrowLeft = findViewById(R.id.imgView_arrowLeft_createNewPassword);
    }
}