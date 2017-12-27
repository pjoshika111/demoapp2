package com.example.user.demoapp2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class LoginPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);
    }

    public void onloginclick(View view) {
        startActivity(new Intent(LoginPage.this, MainActivity.class));
    }

    public void onRegisterClick(View view) {
        startActivity(new Intent(LoginPage.this, RegisterPage.class));
    }
}
