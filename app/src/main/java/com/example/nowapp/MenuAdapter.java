package com.example.nowapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.SwitchCompat;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

public class MenuAdapter extends RecyclerView.Adapter<MenuAdapter.ViewHolder> {
    @NonNull
    @Override
    public MenuAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MenuAdapter.ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.menu_card,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull MenuAdapter.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 10;
    }



    public class ViewHolder extends RecyclerView.ViewHolder {

        CardView image;
        TextView txt,txt1,txt2;
        SwitchCompat button;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            image=itemView.findViewById(R.id.ProfileImage);
            txt=itemView.findViewById(R.id.name);
            txt1=itemView.findViewById(R.id.pri);
            txt2=itemView.findViewById(R.id.price);
            button=itemView.findViewById(R.id.onOff);
        }
    }
}
