package com.example.cinedomeprog.retro;

import com.example.cinedomeprog.Movie;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface MoviesList {
    @GET("pam/cine.json")
    Call<List<Movie>> getAllMovies();
}
