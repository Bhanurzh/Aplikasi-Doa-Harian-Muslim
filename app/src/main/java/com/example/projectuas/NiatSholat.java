package com.example.projectuas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.projectuas.Adapter.NiatAdapter;
import com.example.projectuas.DataSet.DataNiat;
import com.example.projectuas.VariableData.Niat;

import java.util.ArrayList;

public class NiatSholat extends AppCompatActivity {

    private RecyclerView rvNiatSholat;
    private ArrayList<Niat> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_niat_sholat);

        rvNiatSholat = findViewById(R.id.rvNiatSholat);
        rvNiatSholat.setHasFixedSize(true);

        list.addAll(DataNiat.getListData());
        showRecyclerlist();
    }

    private void showRecyclerlist() {
        rvNiatSholat.setLayoutManager(new LinearLayoutManager(this));
        NiatAdapter niatAdapter = new NiatAdapter(list);
        rvNiatSholat.setAdapter(niatAdapter);
    }
}