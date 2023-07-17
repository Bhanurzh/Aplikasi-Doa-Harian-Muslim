package com.example.projectuas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Login extends AppCompatActivity {
    EditText username, password;
    Button btnLogin;
    TextView btnRDRegister;
    DBHelper DB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        username = findViewById(R.id.login_username);
        password = findViewById(R.id.login_password);
        btnLogin = findViewById(R.id.login_button);
        btnRDRegister = findViewById(R.id.signupRedirectText);
        DB = new DBHelper(this);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String user = username.getText().toString();
                String pass = password.getText().toString();

                if (TextUtils.isEmpty(user) || TextUtils.isEmpty(pass)){
                    Toast.makeText(Login.this, "Field Tidak Boleh Kosong!", Toast.LENGTH_SHORT).show();
                }else {
                    Boolean checkUserPass = DB.checkUsernamePassword(user, pass);
                    if (checkUserPass == true){
                        Toast.makeText(Login.this, "Login Berhasil", Toast.LENGTH_SHORT).show();
                        Intent moveToHome = new Intent(getApplicationContext(), Home.class);
                        startActivity(moveToHome);
                    }else {
                        Toast.makeText(Login.this, "Login Gagal", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });

        btnRDRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent moveToRegister = new Intent(getApplicationContext(), Register.class);
                startActivity(moveToRegister);
            }
        });
    }
}