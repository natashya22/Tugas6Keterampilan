package com.example.makeup_tugas6;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

abstract class ListMakeupAdapter extends RecyclerView.Adapter<ListMakeupAdapter.ListViewHolder>{
    private ArrayList<DataMakeup> listKemeja;
    private DataMakeup dataMakeup;

    public ListMakeupAdapter(ArrayList<DataMakeup> list) {
        this.listKemeja = list; }


    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_makeup, parent, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ListViewHolder holder, int position) {
        final DataMakeup dataLaptop =listKemeja.get(position);
        Glide.with(holder.itemView.getContext()).load(dataLaptop.getFoto())
                .apply(new RequestOptions())
                .into(holder.fotoMakeup);

        holder.namaMakeup.setText(dataLaptop.getNama());
        holder.tambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(holder.itemView.getContext(), Beli_Makeup.class);
                holder.itemView.getContext().startActivity(intent);
            }
        });
    }


    @Override
    public int getItemCount() {
        return listKemeja.size(); }


    public class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView fotoMakeup;
        TextView namaMakeup;
        Button tambah;

        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            fotoMakeup = itemView.findViewById(R.id.foto_makeup);
            namaMakeup = itemView.findViewById(R.id.nama_makeup);
            tambah = itemView.findViewById(R.id.tambah); }

    }
}