package com.example.projectuas.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.projectuas.R;
import com.example.projectuas.VariableData.Bacaan;

import java.util.ArrayList;

public class BacaanAdapter extends RecyclerView.Adapter<BacaanAdapter.BacaanViewHolder> {
    private ArrayList<Bacaan> listBacaan;

    public BacaanAdapter(ArrayList<Bacaan> list){
        this.listBacaan = list;
    }

    @NonNull
    @Override
    public BacaanAdapter.BacaanViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_cardview_bacaansholat, parent, false);
        return new BacaanViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull BacaanAdapter.BacaanViewHolder holder, int position) {
        Bacaan bacaan = listBacaan.get(position);
        holder.tvBacaan.setText(bacaan.getBacaanSholat());
        holder.tvArab.setText(bacaan.getHurufArab());
        holder.tvLatin.setText(bacaan.getHurufLatin());
        holder.tvTerjemahan.setText(bacaan.getTerjemahan());

        boolean isExpandable = listBacaan.get(position).isExpandable();
        holder.expandableLayout.setVisibility(isExpandable ? View.VISIBLE : View.GONE);
    }

    @Override
    public int getItemCount() {
        return listBacaan.size();
    }

    public class BacaanViewHolder extends RecyclerView.ViewHolder {
        TextView tvBacaan, tvArab, tvLatin, tvTerjemahan;
        LinearLayout linearLayout;
        RelativeLayout expandableLayout;
        public BacaanViewHolder(@NonNull View itemView) {
            super(itemView);

            tvBacaan = itemView.findViewById(R.id.tvBacaanSholat);
            tvArab = itemView.findViewById(R.id.tvHurufArab);
            tvLatin = itemView.findViewById(R.id.tvHurufLatin);
            tvTerjemahan = itemView.findViewById(R.id.tvTerjemahan);

            linearLayout = itemView.findViewById(R.id.linear_layout);
            expandableLayout = itemView.findViewById(R.id.expandable_layout);

            linearLayout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Bacaan bacaan = listBacaan.get(getAdapterPosition());
                    bacaan.setExpandable(!bacaan.isExpandable());
                    notifyItemChanged(getAdapterPosition());
                }
            });
        }
    }
}
