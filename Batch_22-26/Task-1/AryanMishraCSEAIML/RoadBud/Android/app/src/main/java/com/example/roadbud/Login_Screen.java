package com.example.roadbud;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.material.snackbar.Snackbar;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class Login_Screen extends AppCompatActivity {

    Button but_login;
    EditText et_email;
    EditText et_pass;
    TextView tv_signUp;
    FirebaseAuth firebaseAuth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_screen);
        tv_signUp=findViewById(R.id.tv_signUp);
        et_email =findViewById(R.id.et_Email);
        et_pass = findViewById(R.id.et_password);
        but_login = findViewById(R.id.but_login);
        SharedPreferences sharedPreferences = getSharedPreferences("userPref", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        String Email = sharedPreferences.getString("email",null);
        String Pass = sharedPreferences.getString("pass",null);

        if(Email == null || Pass == null) {

            firebaseAuth = FirebaseAuth.getInstance();
            tv_signUp.setOnClickListener(view -> {
                Intent login = new Intent(Login_Screen.this, Signup_Screen.class);
                startActivity(login);
            });


            but_login.setOnClickListener(view -> {
                String email = et_email.getText().toString().trim();
                String pass = et_pass.getText().toString();
                editor.putString("email", email);
                editor.putString("pass", pass);
                editor.apply();
                if (!email.isEmpty() && !pass.isEmpty()) {
                    firebaseAuth
                            .signInWithEmailAndPassword(email, pass)
                            .addOnSuccessListener(new OnSuccessListener<AuthResult>() {
                                @Override
                                public void onSuccess(AuthResult authResult) {
                                    startActivity(new Intent(Login_Screen.this, HomeActivity.class));
                                    Toast.makeText(Login_Screen.this, "Login Successful", Toast.LENGTH_SHORT).show();
                                    finish();
                                }
                            })
                            .addOnFailureListener(new OnFailureListener() {
                                @Override
                                public void onFailure(@NonNull Exception e) {
                                    Snackbar.make(findViewById(R.id.layout_login), e.getMessage(), Toast.LENGTH_SHORT).show();
                                }
                            });
                } else {
                    Snackbar.make(findViewById(R.id.layout_login), "Empty Email or Password", Snackbar.LENGTH_SHORT).show();
                }
            });
        }
        else{
            startActivity(new Intent(Login_Screen.this, HomeActivity.class));
            finish();
        }



    }
}