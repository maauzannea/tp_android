package com.example.cinedomeprog;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.cinedomeprog.classesCinema.Cinema;
import com.example.cinedomeprog.classesCinema.Movie;
import com.example.cinedomeprog.classesCinema.MovieShowtimes;
import com.squareup.picasso.Picasso;

import java.util.List;

public class NewAdapter extends RecyclerView.Adapter<NewsViewHolder>{

    private Context context;

    private Cinema cinema;

    NewAdapter(Context context, Cinema cinema){
        this.context = context;
        this.cinema = cinema;
    }

    @NonNull
    @Override
    public NewsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout, parent, false);
        return new NewsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull NewsViewHolder holder, int position) {
        String pressRatingString, userRatingString;
        List<MovieShowtimes> movieShowtimes = cinema.movieShowtimes;
        Movie movie = movieShowtimes.get(position).onShow.movie;
        String display = movieShowtimes.get(position).display;
        int durationHours = movie.runtime / 3600;
        int durationMinutes = (movie.runtime / 60) % 60;
        String durationCategoryString = durationHours + "h" + durationMinutes + " / " + movie.genre.get(0).name;

        pressRatingString = context.getString(R.string.press_rating_string);
        if (movie.statistics.pressRating != 0) {
            pressRatingString += " " + movie.statistics.pressRating;
        } else {
            pressRatingString += " NA";
        }

        userRatingString = context.getString(R.string.user_rating_string);
        if (movie.statistics.userRating != 0) {
            userRatingString += " " + movie.statistics.userRating;
        } else {
            userRatingString += " NA";
        }

        holder.title.setText(movie.title);
        holder.showTime.setText(display);
        holder.durationCategory.setText(durationCategoryString);
        holder.pressRating.setText(pressRatingString);
        holder.userRating.setText(userRatingString);
        Picasso.with(context).load(movie.poster.href).into(holder.poster);
    }

    @Override
    public int getItemCount() {
        return cinema.movieShowtimes.size();
    }
}