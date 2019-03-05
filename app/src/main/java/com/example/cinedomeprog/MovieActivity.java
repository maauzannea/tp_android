package com.example.cinedomeprog;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.cinedomeprog.classesCinema.MovieShowtimes;
import com.squareup.picasso.Picasso;


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

        // Titre du film
        TextView movieTitle = findViewById(R.id.movieTitle);
        movieTitle.setText(movieShowtimes.onShow.movie.title);

        // Image du film
        ImageView movieImage = findViewById(R.id.movieImage);
        Picasso.with(getApplicationContext()).load(movieShowtimes.onShow.movie.poster.href).into(movieImage);
        movieImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), ImageMovieActivity.class);
                intent.putExtra("imageHref", movieShowtimes.onShow.movie.poster.href);
                getApplicationContext().startActivity(intent);
            }
        });

        // Date de sortie
        TextView releaseDate = findViewById(R.id.movieReleaseDate);
        String releaseDateString = releaseDate.getText() + " " + movieShowtimes.onShow.movie.release.releaseDate;
        releaseDate.setText(releaseDateString);

        // Durée et catégorie du film
        TextView durationCategory = findViewById(R.id.movieDurationCategory);
        int durationHours = movieShowtimes.onShow.movie.runtime / 3600;
        int durationMinutes = (movieShowtimes.onShow.movie.runtime / 60) % 60;
        String durationCategoryString = durationHours + "h" + durationMinutes + " / "
                                        + movieShowtimes.onShow.movie.genre.get(0).name;
        durationCategory.setText(durationCategoryString);

        // Directeur du film
        TextView director = findViewById(R.id.movieDirector);
        String directorString = director.getText() + " " + movieShowtimes.onShow.movie.castingShort.directors;
        director.setText(directorString);

        // Acteurs du film
        TextView actors = findViewById(R.id.movieActors);
        String actorsString = actors.getText() + " " + movieShowtimes.onShow.movie.castingShort.actors;
        actors.setText(actorsString);

        // Lien vers la bande-annonce
        Button btnVideo = findViewById(R.id.buttonVideoMovie);
        btnVideo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent webIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(movieShowtimes.onShow.movie.trailer.href));
                getApplicationContext().startActivity(webIntent);
            }
        });
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
