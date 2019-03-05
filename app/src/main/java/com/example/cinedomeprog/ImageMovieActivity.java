package com.example.cinedomeprog;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import androidx.activity.ComponentActivity;
import androidx.activity.OnBackPressedCallback;
import androidx.annotation.Nullable;

public class ImageMovieActivity extends ComponentActivity implements OnBackPressedCallback {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_movie);
        Intent intent = getIntent();
        String href = intent.getStringExtra("imageHref");

        // Image du film en plein écran
        ImageView fullScreenImage = findViewById(R.id.fullScreenImage);
        Picasso.with(getApplicationContext()).load(href).into(fullScreenImage);
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
