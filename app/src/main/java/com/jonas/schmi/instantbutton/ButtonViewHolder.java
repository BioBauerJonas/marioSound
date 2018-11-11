package com.jonas.schmi.instantbutton;

import android.media.MediaPlayer;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ButtonViewHolder extends RecyclerView.ViewHolder {

    private Button button;
    private TextView textView;

    ButtonViewHolder(View itemView) {
        super(itemView);
        this.button = itemView.findViewById(R.id.soundButton);
        this.textView = itemView.findViewById(R.id.buttonText);
    }

    private boolean playing = false;

    public void bind(ButtonModel model) {
        this.textView.setText(model.title);
        final int location = model.soundLocation;
        final MediaPlayer mp = MediaPlayer.create(textView.getContext(), location);

        this.button.setOnClickListener(v -> {
            if (playing)
                mp.stop();
            else
                mp.start();
        playing = !playing;
        });
    }
}
