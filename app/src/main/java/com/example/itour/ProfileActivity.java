package com.example.itour;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class ProfileActivity extends AppCompatActivity {

    @Override
    //Codificar
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_profile);
    }

    public void screenEditProfile(View view) {
        Intent in = new Intent(ProfileActivity.this, EditProfileActivity.class);
        startActivity(in);
    }
}