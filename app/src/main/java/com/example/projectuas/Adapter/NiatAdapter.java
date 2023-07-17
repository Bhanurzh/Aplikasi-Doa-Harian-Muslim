package com.example.projectuas.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.projectuas.VariableData.Niat;
import com.example.projectuas.R;

import java.util.ArrayList;

public class NiatAdapter extends RecyclerView.Adapter<NiatAdapter.NiatViewHolder> {
    private ArrayList<Niat> listNiat;

    public NiatAdapter(ArrayList<Niat> list) {
        this.listNiat = list;
    }

    @NonNull
    @Override
    public NiatAdapter.NiatViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_cardview_niatsholat, parent, false);
        return new NiatViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull NiatAdapter.NiatViewHolder holder, int position) {
        Niat niat = listNiat.get(position);
        holder.tvNiat.setText(niat.getNiatSholat());
        holder.tvArab.setText(niat.getHurufArab());
        holder.tvLatin.setText(niat.getHurufLatin());
        holder.tvTerjemahan.setText(niat.getTerjemahan());

        boolean isExpandable = listNiat.get(position).isExpandable();
        holder.expandableLayout.setVisibility(isExpandable ? View.VISIBLE : View.GONE);
    }

    @Override
    public int getItemCount() {
        return listNiat.size();
    }

    public class NiatViewHolder extends RecyclerView.ViewHolder {
        TextView tvNiat, tvArab, tvLatin, tvTerjemahan;
        LinearLayout linearLayout;
        RelativeLayout expandableLayout;

        public NiatViewHolder(@NonNull View itemView) {
            super(itemView);

            tvNiat = itemView.findViewById(R.id.tvNiatSholat);
            tvArab = itemView.findViewById(R.id.tvHurufArab);
            tvLatin = itemView.findViewById(R.id.tvHurufLatin);
            tvTerjemahan = itemView.findViewById(R.id.tvTerjemahan);

            linearLayout = itemView.findViewById(R.id.linear_layout);
            expandableLayout = itemView.findViewById(R.id.expandable_layout);

            linearLayout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Niat niat = listNiat.get(getAdapterPosition());
                    niat.setExpandable(!niat.isExpandable());
                    notifyItemChanged(getAdapterPosition());
                }
            });
        }
    }
}
