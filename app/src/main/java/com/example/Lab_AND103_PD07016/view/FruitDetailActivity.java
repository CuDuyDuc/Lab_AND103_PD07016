package com.example.Lab_AND103_PD07016.view;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.bumptech.glide.Glide;
import com.example.Lab_AND103_PD07016.R;
import com.example.Lab_AND103_PD07016.adapter.ImageAdapter;
import com.example.Lab_AND103_PD07016.databinding.ActivityFruitDetailBinding;
import com.example.Lab_AND103_PD07016.model.Fruit;

public class FruitDetailActivity extends AppCompatActivity {
    ActivityFruitDetailBinding binding;
    Fruit fruit;
    private ImageAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        binding = ActivityFruitDetailBinding.inflate(getLayoutInflater());
        super.onCreate(savedInstanceState);

        setContentView(binding.getRoot());

        showData();
        binding.btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }
    private void showData() {
        //get data object intent
        Intent intent = getIntent();
        fruit = (Fruit) intent.getSerializableExtra("fruit");

        binding.tvName.setText("Name: " + fruit.getName());
        binding.tvPrice.setText("Price: " + fruit.getPrice());
        binding.tvDescription.setText("Description: " + fruit.getDescription());
        binding.tvQuantity.setText("Quantity: " + fruit.getQuantity());
        binding.tvStatus.setText("Status: "+fruit.getStatus());

        adapter = new ImageAdapter(this, fruit.getImage());
        binding.rcvImg.setAdapter(adapter);
    }
}