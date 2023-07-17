package com.example.projectuas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.projectuas.Adapter.BacaanAdapter;
import com.example.projectuas.DataSet.DataBacaan;
import com.example.projectuas.VariableData.Bacaan;

import java.util.ArrayList;

public class BacaanSholat extends AppCompatActivity {

    private RecyclerView rvBacaanSholat;
    private ArrayList<Bacaan> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bacaan_sholat);

        rvBacaanSholat = findViewById(R.id.rvBacaanSholat);
        rvBacaanSholat.setHasFixedSize(true);

        list.addAll(DataBacaan.getListData());
        showRecyclerlist();
    }

    private void showRecyclerlist() {
        rvBacaanSholat.setLayoutManager(new LinearLayoutManager(this));
        BacaanAdapter bacaanAdapter = new BacaanAdapter(list);
        rvBacaanSholat.setAdapter(bacaanAdapter);
    }
}