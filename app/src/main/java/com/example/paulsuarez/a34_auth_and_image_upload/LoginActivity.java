package com.example.paulsuarez.a34_auth_and_image_upload;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class LoginActivity extends AppCompatActivity {
    private static final String TAG = "LOGIN";

    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login); // might need to be activity_main
    }
}
