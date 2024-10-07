package com.example.itour;

import android.content.Intent;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class ProfileActivity extends AppCompatActivity {

    FirebaseAuth auth;
    FirebaseUser user;

    @Override
    //Codificar
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_profile);

        auth = FirebaseAuth.getInstance();
        user = auth.getCurrentUser();
        if(user == null) {
            Intent intent = new Intent(getApplicationContext(), LoginActivity.class);
            startActivity(intent);
            finish();
        }


        /* ADICIONAR LOGOUT NA TELA DE PERFIL
        *
        *   button.setOnClickListner(new View.OnClickListner() {
        *
        *       FirebaseAuth.getInstance().signOut();
        *
        *      Intent intent = new Intent(getApplicationContext(), LoginActivity.class);
        *       startActivity(intent);
        *       finish();
        *
        *   })
        *
        * */

    }
}