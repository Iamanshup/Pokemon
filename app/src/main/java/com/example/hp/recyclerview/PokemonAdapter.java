package com.example.hp.recyclerview;

import android.graphics.Typeface;
import android.support.annotation.NonNull;
import android.support.annotation.Size;
import android.support.v7.widget.RecyclerView;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class PokemonAdapter extends RecyclerView.Adapter<PokemonAdapter.PokemonViewHolder> {

    ArrayList<Pokemon> arrayList;

    public PokemonAdapter(ArrayList<Pokemon> arrayList) {
        this.arrayList = arrayList;
    }

    @NonNull
    @Override
    public PokemonViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_layout, parent, false);
        Animation animation = AnimationUtils.loadAnimation(parent.getContext(), R.anim.fade_in);
        view.startAnimation(animation);
        return new PokemonViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PokemonViewHolder holder, int position) {
        Pokemon obj = arrayList.get(position);
        Typeface tf = Typeface.defaultFromStyle(Typeface.BOLD);
        holder.tv.setTypeface(tf);
        holder.tv.setGravity(Gravity.CENTER_VERTICAL);
        holder.tv.setTextSize(20);
        holder.tv.setText(obj.getName());
        holder.iv.setImageResource(obj.getImage());
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class PokemonViewHolder extends RecyclerView.ViewHolder {
        TextView tv;
        ImageView iv;
        public PokemonViewHolder(View itemView) {
            super(itemView);

            iv = itemView.findViewById(R.id.iv);
            tv = itemView.findViewById(R.id.tv);
        }
    }
}
