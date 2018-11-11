package com.jonas.schmi.instantbutton;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

public class RecyclerAdapter extends RecyclerView.Adapter<ButtonViewHolder> {


    private ButtonModel[] butons = new ButtonModel[]{new ButtonModel("coin", R.raw.coin),
    new ButtonModel("Battle Mode", R.raw.battle_mode), new ButtonModel("Bows", R.raw.bows),
    new ButtonModel("jump", R.raw.jump), new ButtonModel("break a block", R.raw.breakblock),
    new ButtonModel("character", R.raw.character), new ButtonModel("credits", R.raw.credits),
    new ButtonModel("kick", R.raw.kick), new ButtonModel("coin Two", R.raw.coint_two),
    new ButtonModel("choco", R.raw.choco), new ButtonModel("Die", R.raw.die), new ButtonModel("flagpole", R.raw.flagpole),
    new ButtonModel("donut plains", R.raw.donut_plains), new ButtonModel("gameover", R.raw.gameover), new ButtonModel("ghost valley", R.raw.ghost_valley)
    , new ButtonModel("small jump", R.raw.jump_small), new ButtonModel("bowserfall", R.raw.bowserfall)};

    private Context context;

    public RecyclerAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public ButtonViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ButtonViewHolder(LayoutInflater.from(this.context).inflate(R.layout.button_layout, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ButtonViewHolder holder, int position) {
        holder.bind(this.butons[position]);
    }

    @Override
    public int getItemCount() {
        return this.butons.length;
    }
}

