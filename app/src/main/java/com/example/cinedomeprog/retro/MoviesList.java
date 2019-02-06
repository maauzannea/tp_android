package com.example.cinedomeprog.retro;

import com.example.cinedomeprog.classesCinema.Cinema;

import retrofit2.Call;
import retrofit2.http.GET;

public interface MoviesList {
    @GET("cine.json")
    Call<Cinema> getAllMovies();
}
