package com.example.itour;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class ScreenTwoActivity extends AppCompatActivity {

    Button btnToLogin;
    TextView txtToRegister;

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

}