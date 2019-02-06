package com.example.cinedomeprog;

import android.content.Context;
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

    public NewAdapter(Context context, Cinema cinema){
        this.context = context;
        this.cinema = cinema;
    }

    @Override
    public NewsViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout, parent, false);
        return new NewsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(NewsViewHolder holder, int position) {
        List<MovieShowtimes> movieShowtimes = cinema.movieShowtimes;
        Movie movie = movieShowtimes.get(position).onShow.movie;
        String display = movieShowtimes.get(position).display;
        holder.title.setText(movie.title);
        holder.showTime.setText(display);
        Picasso.with(context).load(movie.poster.href).into(holder.poster);
    }

    @Override
    public int getItemCount() {
        return cinema.movieShowtimes.size();
    }
}