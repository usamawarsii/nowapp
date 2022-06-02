package com.example.nowapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.makeramen.roundedimageview.RoundedImageView;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {
    @NonNull
    @Override
    public Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.dash_card,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 8;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        RoundedImageView imagePro;
        ImageView logo;
        TextView txt,txt1,txt2,txt3;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imagePro=itemView.findViewById(R.id.ProfileImage);
            logo=itemView.findViewById(R.id.expndlogo);
            txt=itemView.findViewById(R.id.name);
            txt1=itemView.findViewById(R.id.order);
            txt2=itemView.findViewById(R.id.orderId);
            txt3=itemView.findViewById(R.id.id);

        }
    }
}
