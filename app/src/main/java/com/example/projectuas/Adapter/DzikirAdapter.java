package com.example.projectuas.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.projectuas.VariableData.Dzikir;
import com.example.projectuas.R;

import java.util.ArrayList;

public class DzikirAdapter extends RecyclerView.Adapter<DzikirAdapter.DzikirViewHolder> {
    private ArrayList<Dzikir> listDzikir;

    public DzikirAdapter(ArrayList<Dzikir> list){
        this.listDzikir = list;
    }

    @NonNull
    @Override
    public DzikirAdapter.DzikirViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_cardview_dzikir, parent, false);
        return new DzikirViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull DzikirAdapter.DzikirViewHolder holder, int position) {
        Dzikir dzikir = listDzikir.get(position);
        holder.tvDzikir.setText(dzikir.getDzikir());
        holder.tvArab.setText(dzikir.getHurufArab());
        holder.tvLatin.setText(dzikir.getHurufLatin());
        holder.tvTerjemahan.setText(dzikir.getTerjemahan());
    }

    @Override
    public int getItemCount() {
        return listDzikir.size();
    }

    public class DzikirViewHolder extends RecyclerView.ViewHolder {
        TextView tvDzikir, tvArab, tvLatin, tvTerjemahan;
        public DzikirViewHolder(@NonNull View itemView) {
            super(itemView);

            tvDzikir = itemView.findViewById(R.id.tvDzikir);
            tvArab = itemView.findViewById(R.id.tvHurufArab);
            tvLatin = itemView.findViewById(R.id.tvHurufLatin);
            tvTerjemahan = itemView.findViewById(R.id.tvTerjemahan);
        }
    }
}
