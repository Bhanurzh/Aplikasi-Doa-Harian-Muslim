package com.example.projectuas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Home extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        ImageButton btnNiatSholat = findViewById(R.id.btnNiatSholat);
        btnNiatSholat.setOnClickListener(this);

        ImageButton btnBacaanSholat = findViewById(R.id.btnBacaanSholat);
        btnBacaanSholat.setOnClickListener(this);

        ImageButton btnDoaHarian = findViewById(R.id.btnDoaHarian);
        btnDoaHarian.setOnClickListener(this);

        ImageButton btnDzikir= findViewById(R.id.btnDzikir);
        btnDzikir.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btnNiatSholat:
                Intent moveToNiatSholat = new Intent(Home.this, NiatSholat.class);
                startActivity(moveToNiatSholat);
                break;
            case R.id.btnBacaanSholat:
                Intent moveToBacaanSholat = new Intent(Home.this, BacaanSholat.class);
                startActivity(moveToBacaanSholat);
                break;
            case R.id.btnDoaHarian:
                Intent moveToDoaHarian = new Intent(Home.this, DoaHarian.class);
                startActivity(moveToDoaHarian);
                break;
            case R.id.btnDzikir:
                Intent moveToDzikir = new Intent(Home.this, DzikirSetelahSholat.class);
                startActivity(moveToDzikir);
                break;
        }
    }
}