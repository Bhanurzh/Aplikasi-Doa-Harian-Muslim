package com.example.projectuas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.projectuas.Adapter.DoaAdapter;
import com.example.projectuas.DataSet.DataDoa;
import com.example.projectuas.VariableData.Doa;

import java.util.ArrayList;

public class DoaHarian extends AppCompatActivity {
    private RecyclerView rvDoaHarian;
    private ArrayList<Doa> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doa_harian);

        rvDoaHarian = findViewById(R.id.rvDoaHarian);
        rvDoaHarian.setHasFixedSize(true);

        list.addAll(DataDoa.getListData());
        showRecyclerlist();
    }

    private void showRecyclerlist() {
        rvDoaHarian.setLayoutManager(new LinearLayoutManager(this));
        DoaAdapter doaAdapter = new DoaAdapter(list);
        rvDoaHarian.setAdapter(doaAdapter);
    }
}