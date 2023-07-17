package com.example.projectuas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.projectuas.Adapter.DzikirAdapter;
import com.example.projectuas.DataSet.DataDzikir;
import com.example.projectuas.VariableData.Dzikir;

import java.util.ArrayList;

public class DzikirSetelahSholat extends AppCompatActivity {
    private RecyclerView rvDzikir;
    private ArrayList<Dzikir> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dzikir_setelah_sholat);

        rvDzikir = findViewById(R.id.rvDzikirSholat);
        rvDzikir.setHasFixedSize(true);

        list.addAll(DataDzikir.getListData());
        showRecyclerlist();
    }

    private void showRecyclerlist() {
        rvDzikir.setLayoutManager(new LinearLayoutManager(this));
        DzikirAdapter dzikirAdapter = new DzikirAdapter(list);
        rvDzikir.setAdapter(dzikirAdapter);
    }

}