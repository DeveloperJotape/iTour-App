package com.example.itour;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class ScreenTwoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_screen_2);

    }

    public void screenLogin(View view) {
        Intent in = new Intent(ScreenTwoActivity.this, LoginActivity.class);
        startActivity(in);
    }

    public void screenRegister(View view) {
        Intent in = new Intent(ScreenTwoActivity.this, RegisterActivity.class);
        startActivity(in);
    }

}