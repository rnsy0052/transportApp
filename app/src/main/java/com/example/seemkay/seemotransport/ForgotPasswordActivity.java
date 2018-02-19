package com.example.seemkay.seemotransport;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ForgotPasswordActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password);
    }

    public void resendOTP(View view) {
    }

    public void sendOTP(View view) {

    }

    public void confirmOTP(View view) {
        Intent intent = new Intent(ForgotPasswordActivity.this,ResetPasswordActivity.class);
        startActivity(intent);

    }


}
