package com.example.projectuas.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.projectuas.VariableData.Doa;
import com.example.projectuas.R;

import java.util.ArrayList;

public class DoaAdapter extends RecyclerView.Adapter<DoaAdapter.DoaViewHolder> {
    private ArrayList<Doa> listDoa;

    public DoaAdapter(ArrayList<Doa> list){
        this.listDoa = list;
    }

    @NonNull
    @Override
    public DoaAdapter.DoaViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_cardview_doaharian, parent, false);
        return new DoaViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull DoaAdapter.DoaViewHolder holder, int position) {
        Doa doa = listDoa.get(position);
        holder.tvDoa.setText(doa.getDoaHarian());
        holder.tvArab.setText(doa.getHurufArab());
        holder.tvLatin.setText(doa.getHurufLatin());
        holder.tvTerjemahan.setText(doa.getTerjemahan());

        boolean isExpandable = listDoa.get(position).isExpandable();
        holder.expandableLayout.setVisibility(isExpandable ? View.VISIBLE : View.GONE);
    }

    @Override
    public int getItemCount() {
        return listDoa.size();
    }

    public class DoaViewHolder extends RecyclerView.ViewHolder {
        TextView tvDoa, tvArab, tvLatin, tvTerjemahan;
        LinearLayout linearLayout;
        RelativeLayout expandableLayout;
        public DoaViewHolder(@NonNull View itemView) {
            super(itemView);

            tvDoa = itemView.findViewById(R.id.tvDoaHarian);
            tvArab = itemView.findViewById(R.id.tvHurufArab);
            tvLatin = itemView.findViewById(R.id.tvHurufLatin);
            tvTerjemahan = itemView.findViewById(R.id.tvTerjemahan);

            linearLayout = itemView.findViewById(R.id.linear_layout);
            expandableLayout = itemView.findViewById(R.id.expandable_layout);

            linearLayout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Doa doa = listDoa.get(getAdapterPosition());
                    doa.setExpandable(!doa.isExpandable());
                    notifyItemChanged(getAdapterPosition());
                }
            });
        }
    }
}
