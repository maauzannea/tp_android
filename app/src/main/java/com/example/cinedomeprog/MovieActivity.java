package com.example.cinedomeprog;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.VideoView;

import com.example.cinedomeprog.classesCinema.MovieShowtimes;

import androidx.activity.ComponentActivity;
import androidx.activity.OnBackPressedCallback;
import androidx.annotation.Nullable;

public class MovieActivity extends ComponentActivity implements OnBackPressedCallback {

    private final String TAG = MovieActivity.class.getSimpleName();

    private MovieShowtimes movieShowtimes;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie);
        Intent intent = getIntent();
        movieShowtimes = (MovieShowtimes) intent.getSerializableExtra("movie");
        TextView movieTitle = findViewById(R.id.movieTitle);
        movieTitle.setText(movieShowtimes.onShow.movie.title);
        /*VideoView videoView =findViewById(R.id.movieTrailer);
        videoView.setVideoPath(movieShowtimes.onShow.movie.trailer.href);
        videoView.start();*/
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }

    @Override
    public boolean handleOnBackPressed() {
        return false;
    }
}
