package com.example.Lab_AND103_PD07016.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.Lab_AND103_PD07016.R;
import com.example.Lab_AND103_PD07016.databinding.ItemFruitBinding;
import com.example.Lab_AND103_PD07016.databinding.ItemImageBinding;

import java.util.ArrayList;

public class ImageAdapter extends RecyclerView.Adapter<ImageAdapter.ViewHolder>{
    private Context context;
    private ArrayList<String> list;

    public ImageAdapter(Context context, ArrayList<String> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public ImageAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemImageBinding binding = ItemImageBinding.inflate(LayoutInflater.from(parent.getContext()),parent,false);

        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull ImageAdapter.ViewHolder holder, int position) {
        String url = list.get(position);
        String newUrl = url.replace("localhost", "10.0.2.2");

        Glide.with(context)
                .load(newUrl)
                .thumbnail(Glide.with(context).load(R.drawable.image_icon))
                .into(holder.binding.img);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ItemImageBinding binding;
        public ViewHolder(ItemImageBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}