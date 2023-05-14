package com.example.firebaseloginyt;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyrecycAdaptor extends RecyclerView.Adapter<MyrecycAdaptor.Myholder> {

    private ArrayList<Car> cars;

    public MyrecycAdaptor(ArrayList<Car> cars) {
        this.cars=cars;
    }

    @NonNull
    @Override
    public Myholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_posts,parent,false);
        return new Myholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Myholder holder, int position) {
        holder.txtmodel.setText(cars.get(position).getModel());
        holder.txtmarka.setText(cars.get(position).getMarka());
        holder.imglogo.setImageResource(cars.get(position).getLogo());
    }

    @Override
    public int getItemCount() {
        return cars.size();
    }

    public class Myholder extends RecyclerView.ViewHolder {
        TextView txtmodel,txtmarka;
        ImageView imglogo;
        public Myholder(@NonNull View itemView) {
            super(itemView);

            imglogo=itemView.findViewById(R.id.img_logo);
            txtmarka=itemView.findViewById(R.id.txt_marka);
            txtmodel=itemView.findViewById(R.id.txt_model);
        }
    }
}
