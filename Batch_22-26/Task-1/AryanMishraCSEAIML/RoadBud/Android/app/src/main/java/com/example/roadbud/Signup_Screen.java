package com.example.roadbud;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.FirebaseFirestore;

public class Signup_Screen extends AppCompatActivity {
    Button but_signUp;
    EditText et_name;
    EditText et_email;
    EditText et_mob;
    EditText et_pass;
    ProgressDialog progressDialog;
    FirebaseAuth firebaseAuth;
    FirebaseFirestore firebaseFirestore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup_screen);
        but_signUp = findViewById(R.id.but_signup);
        et_name = findViewById(R.id.et_name);
        et_email = findViewById(R.id.et_email);
        et_mob = findViewById(R.id.et_mobile);
        et_pass = findViewById(R.id.et_pass);

        firebaseAuth = FirebaseAuth.getInstance();
        firebaseFirestore = FirebaseFirestore.getInstance();
        progressDialog = new ProgressDialog(this);
        but_signUp.setOnClickListener(view -> {
            String name = et_name.getText().toString();
            String email = et_email.getText().toString().trim();
            String mob = et_mob.getText().toString();
            String pass = et_pass.getText().toString();
            progressDialog.show();
            firebaseAuth
                    .createUserWithEmailAndPassword(email,pass)
                    .addOnSuccessListener(new OnSuccessListener<AuthResult>() {
                        @Override
                        public void onSuccess(AuthResult authResult) {
                            startActivity(new Intent(Signup_Screen.this,Login_Screen.class));
                            progressDialog.cancel();
                            firebaseFirestore.collection("User")
                                    .document(FirebaseAuth.getInstance().getUid())
                                    .set(new UserModel(name,mob,email));

                        }
                    })
                    .addOnFailureListener(new OnFailureListener() {
                        @Override
                        public void onFailure(@NonNull Exception e) {
                            Toast.makeText(Signup_Screen.this, e.getMessage(),Toast.LENGTH_SHORT).show();
                            progressDialog.cancel();
                        }
                    });
        });

    }
}