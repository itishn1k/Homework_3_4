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
    private ArrayList<Continent> continentList = new ArrayList<>();
    private ContinentAdapter adapter;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentFirstBinding.inflate(getLayoutInflater());
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        loadData();
        adapter = new ContinentAdapter(continentList);
        binding.rvContinents.setAdapter(adapter);
    }

    private void loadData() {
        continentList.add(new Continent("Eurasia","https://upload.wikimedia.org/wikipedia/commons/thumb/3/30/Eurasia_%28orthographic_projection%29.svg/1200px-Eurasia_%28orthographic_projection%29.svg.png"));
        continentList.add(new Continent("Africa","https://upload.wikimedia.org/wikipedia/commons/thumb/8/86/Africa_%28orthographic_projection%29.svg/1200px-Africa_%28orthographic_projection%29.svg.png"));
        continentList.add(new Continent("North America","https://upload.wikimedia.org/wikipedia/commons/thumb/4/43/Location_North_America.svg/1200px-Location_North_America.svg.png"));
        continentList.add(new Continent("South America","https://upload.wikimedia.org/wikipedia/commons/thumb/0/0f/South_America_%28orthographic_projection%29.svg/1200px-South_America_%28orthographic_projection%29.svg.png"));
        continentList.add(new Continent("Australia","https://upload.wikimedia.org/wikipedia/commons/thumb/d/da/Australia_with_AAT_%28orthographic_projection%29.svg/900px-Australia_with_AAT_%28orthographic_projection%29.svg.png"));
        continentList.add(new Continent("Antarctica","https://upload.wikimedia.org/wikipedia/commons/thumb/f/f2/Antarctica_%28orthographic_projection%29.svg/1024px-Antarctica_%28orthographic_projection%29.svg.png"));
    }
}