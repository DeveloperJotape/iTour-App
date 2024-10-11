package com.example.itour.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.itour.databinding.ViewholderBestDestinationsBinding;
import com.example.itour.domain.ItemDomain;

import java.util.ArrayList;

public class BestDestinationsAdapter extends RecyclerView.Adapter<BestDestinationsAdapter.Viewholder> {
    ArrayList<ItemDomain> items;
    Context context;
    ViewholderBestDestinationsBinding binding;

    public BestDestinationsAdapter(ArrayList<ItemDomain> items) {
        this.items = items;
    }

    @NonNull
    @Override
    public BestDestinationsAdapter.Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        binding = ViewholderBestDestinationsBinding.inflate(LayoutInflater.from(parent.getContext()),parent, false);
        context = parent.getContext();
        return new Viewholder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull BestDestinationsAdapter.Viewholder holder, int position) {
        binding.idTitleCard.setText(items.get(position).getTitle());
        binding.idPrice.setText("R$ "+items.get(position).getPrice());
        binding.idAddress.setText(items.get(position).getAddress());
        //binding.idScore.setText(items.get(position).getScore());
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public class Viewholder extends RecyclerView.ViewHolder {
        public Viewholder(ViewholderBestDestinationsBinding binding) {
            super(binding.getRoot());
        }
    }
}
