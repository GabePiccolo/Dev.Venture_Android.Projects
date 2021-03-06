package com.example.digitalzoo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AnimalListAdapter extends RecyclerView.Adapter<AnimalListAdapter.AnimalViewHolder> {

    List<Animal> animals;
    public AnimalListAdapter(List<Animal> animals){
        this.animals = animals;
    }

    @NonNull
    @Override
    public AnimalViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.animal_item, parent, false);

        return new AnimalViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull AnimalViewHolder holder, int position) {
        holder.imageView.setImageResource(animals.get(position).getImage());
        holder.textViewName.setText(animals.get(position).getName());
        holder.textViewType.setText(animals.get(position).getType());
        holder.textViewLifeSpan.setText(String.valueOf(animals.get(position).getLifeSpan()));
    }

    @Override
    public int getItemCount() {
        return animals.size();
    }

    static class AnimalViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        ImageView imageView;
        TextView textViewName;
        TextView textViewType;
        TextView textViewLifeSpan;

        public AnimalViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.animal_image);
            textViewName = itemView.findViewById(R.id.animal_name);
            textViewType = itemView.findViewById(R.id.animal_type);
            textViewLifeSpan = itemView.findViewById(R.id.animal_lifespan);

            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            Toast.makeText(itemView.getContext(), textViewName.getText(), Toast.LENGTH_SHORT).show();
        }
    }
}
