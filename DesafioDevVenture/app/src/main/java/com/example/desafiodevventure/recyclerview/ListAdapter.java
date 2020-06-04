package com.example.desafiodevventure.recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import com.example.desafiodevventure.R;
import com.example.desafiodevventure.model.Cats;

import java.util.List;
import java.util.Objects;

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.CatsViewHolder> {

    private List<Cats.Object> cats;

    public ListAdapter(List<Cats.Object> cats) {
        this.cats = cats;
    }

    @NonNull
    @Override
    public CatsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.pics_layout, parent, false);
        return new CatsViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull CatsViewHolder holder, int position) {
       //holder.imageView.setImageResource(cats.get(position).getLink());
    }

    @Override
    public int getItemCount() {
        return 0;
    }

    static class CatsViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;

        public CatsViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageView);
        }
    }

}
