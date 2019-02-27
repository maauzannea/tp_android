package com.example.cinedomeprog;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

class NewsViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    TextView title;
    TextView durationCategory;
    TextView pressRating;
    TextView userRating;
    TextView showTime;
    ImageView poster;

    NewsViewHolder(View itemView) {
        super(itemView);
        title = itemView.findViewById(R.id.post_title);
        durationCategory = itemView.findViewById(R.id.duration_category);
        pressRating = itemView.findViewById(R.id.press_rating);
        userRating = itemView.findViewById(R.id.user_rating);
        showTime = itemView.findViewById(R.id.showtime);
        poster = itemView.findViewById(R.id.poster);
    }

    @Override
    public void onClick(View v) {
        //TODO intent vers une nouvelle activité qui affichera le détail du film
    }
}
