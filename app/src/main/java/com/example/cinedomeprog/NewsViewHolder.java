package com.example.cinedomeprog;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.cinedomeprog.classesCinema.MovieShowtimes;

import androidx.recyclerview.widget.RecyclerView;

class NewsViewHolder extends RecyclerView.ViewHolder {

    TextView title;
    TextView durationCategory;
    TextView pressRating;
    TextView userRating;
    TextView showTime;
    ImageView poster;
    private Context context;

    NewsViewHolder(Context context, View itemView) {
        super(itemView);
        this.title = itemView.findViewById(R.id.post_title);
        this.durationCategory = itemView.findViewById(R.id.duration_category);
        this.pressRating = itemView.findViewById(R.id.press_rating);
        this.userRating = itemView.findViewById(R.id.user_rating);
        this.showTime = itemView.findViewById(R.id.showtime);
        this.poster = itemView.findViewById(R.id.poster);
        this.context = context;
    }

    void setMovie(final MovieShowtimes movieShowtimes) {
        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, MovieActivity.class);
                intent.putExtra("movie", movieShowtimes);
                context.startActivity(intent);
            }
        });
    }
}
