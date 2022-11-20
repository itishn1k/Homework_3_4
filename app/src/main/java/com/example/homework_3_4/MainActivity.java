package com.example.homework_3_4;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.homework_3_4.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        com.example.homework_3_4.databinding.ActivityMainBinding binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction().add(R.id.container, new ContinentsFragment()).commit();
        }
    }
}