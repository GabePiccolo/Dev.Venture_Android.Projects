package com.example.desafiodevventure.recyclerview;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import com.example.desafiodevventure.model.Cats;

import java.util.List;

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.CatsViewHolder> {

    List<Cats> cats;

    public ListAdapter(List<Cats> cats) {
        this.cats = cats;
    }

    @NonNull
    @Override
    public CatsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull CatsViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    static class CatsViewHolder extends RecyclerView.ViewHolder {
        public CatsViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }

}
