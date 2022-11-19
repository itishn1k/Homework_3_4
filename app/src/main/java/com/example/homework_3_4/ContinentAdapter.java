package com.example.homework_3_4;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.homework_3_4.databinding.ItemContinentBinding;

import java.util.ArrayList;

public class ContinentAdapter extends RecyclerView.Adapter<ContinentViewHolder> {

    public ContinentAdapter(ArrayList<Continent> continentList) {
        this.continentList = continentList;
    }

    private  ArrayList<Continent> continentList;

    @NonNull
    @Override
    public ContinentViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ContinentViewHolder(ItemContinentBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ContinentViewHolder holder, int position) {
        holder.bind(continentList.get(position));
    }

    @Override
    public int getItemCount() {
        return continentList.size();
    }
}

class ContinentViewHolder extends RecyclerView.ViewHolder {

    ItemContinentBinding binding;

    public ContinentViewHolder(ItemContinentBinding binding) {
        super(binding.getRoot());
        this.binding = binding;
    }

    public void bind(Continent continent) {
        binding.tvContinent.setText(continent.getName());
        Glide.with(binding.ivImageContinent).load(continent.getShape()).into(binding.ivImageContinent);
    }
}
