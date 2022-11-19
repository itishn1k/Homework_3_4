package com.example.homework_3_4;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.example.homework_3_4.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        binding.getRoot();
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction().add(R.id.fr_continents, new FirstFragment()).commit();
        }
    }
}