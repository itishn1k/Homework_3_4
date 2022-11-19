package com.example.homework_3_4;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.homework_3_4.databinding.FragmentFirstBinding;

import java.util.ArrayList;


public class FirstFragment extends Fragment {
    private FragmentFirstBinding binding;
    private ContinentAdapter adapter;
    private final ArrayList<String> continentList = new ArrayList<>();

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentFirstBinding.inflate(getLayoutInflater());
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        loadData();
        adapter=new ContinentAdapter(continentList);
        binding.rvContinents.setAdapter(adapter);
    }

    private void loadData() {
        continentList.add("Eurasia");
        continentList.add("Africa");
        continentList.add("South America");
        continentList.add("North America");
        continentList.add("Australia");
    }
}