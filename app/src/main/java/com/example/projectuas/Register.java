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

public class Register extends AppCompatActivity {
    EditText username, password, repassword;
    Button btnRegister;
    TextView btnRDLogin;
    DBHelper DB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        username = findViewById(R.id.signup_username);
        password = findViewById(R.id.signup_password);
        repassword = findViewById(R.id.signup_confirm);
        btnRegister = findViewById(R.id.signup_button);
        btnRDLogin = findViewById(R.id.loginRedirectText);
        DB = new DBHelper(this);

        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String user = username.getText().toString();
                String pass = password.getText().toString();
                String repass = repassword.getText().toString();

                if (TextUtils.isEmpty(user) || TextUtils.isEmpty(repass) || TextUtils.isEmpty(pass)){
                    Toast.makeText(Register.this, "Field Tidak Boleh Kosong!", Toast.LENGTH_SHORT).show();
                }else {
                    if (pass.equals(repass)){
                        Boolean checkUser = DB.checkUsername(user);
                        if (checkUser == false){
                            Boolean insert = DB.insertData(user, pass);
                            if (insert == true){
                                Toast.makeText(Register.this, "Registrasi Berhasil", Toast.LENGTH_SHORT).show();
                                Intent moveToLogin = new Intent(getApplicationContext(), Login.class);
                                startActivity(moveToLogin);
                            }else {
                                Toast.makeText(Register.this, "Registrasi Gagal!", Toast.LENGTH_SHORT).show();
                            }
                        }else {
                            Toast.makeText(Register.this, "User Sudah Ada!", Toast.LENGTH_SHORT).show();
                        }
                    }else {
                        Toast.makeText(Register.this, "Password Tidak Sesuai!", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });

        btnRDLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent moveToLogin = new Intent(getApplicationContext(), Login.class);
                startActivity(moveToLogin);
            }
        });
    }
}