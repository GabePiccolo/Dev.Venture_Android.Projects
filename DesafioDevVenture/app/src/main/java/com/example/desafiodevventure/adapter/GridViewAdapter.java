package com.example.desafiodevventure.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.desafiodevventure.R;
import com.example.desafiodevventure.model.Cats;
import com.squareup.picasso.Picasso;

import java.util.List;
import java.util.Objects;
import java.util.Observable;

public class GridViewAdapter extends BaseAdapter {

    private List<Cats.Object> cats;
    private Context context;


    public GridViewAdapter(List<Cats.Object> cats, Context context) {
        this.cats = cats;
        this.context = context;
    }

    @Override
    public int getCount() {
        return cats.size();
    }

    @Override
    public Object getItem(int position) {
        return cats.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView==null){
            convertView = LayoutInflater.from(context).inflate(R.layout.pics_model, parent, false);
        }

        ImageView imageView = convertView.findViewById(R.id.imageView);

        final Cats.Object thisCats = cats.get(position);

        if(thisCats.getLink() != null && thisCats.getLink().length() > 0){
            Picasso.get().load(thisCats.getLink()).placeholder(R.drawable.placeholder);
        } else {
            Toast.makeText(context, "Empty Image Url", Toast.LENGTH_SHORT).show();
        }

        convertView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        return convertView;
    }
}
