package com.example.cinedomeprog;

import com.google.gson.annotations.SerializedName;

public class Movie {
    @SerializedName("title")
    private String title;

    @SerializedName("castingShort/directors")
    private String directors;

    @SerializedName("castingShort/actors")
    private String actors;

    @SerializedName("release/releaseDate")
    private String releaseDate;

    @SerializedName("runtime")
    private int runtime;

    @SerializedName("genre/name")
    private String genre;

    @SerializedName("poster/href")
    private String posterPath;

    @SerializedName("trailer/href")
    private String trailerPath;


    public Movie(String title, String directors, String actors, String releaseDate, int runtime, String genre, String posterPath, String trailerPath) {
        this.title = title;
        this.directors = directors;
        this.actors = actors;
        this.releaseDate = releaseDate;
        this.runtime = runtime;
        this.genre = genre;
        this.posterPath = posterPath;
        this.trailerPath = trailerPath;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirectors() {
        return directors;
    }

    public void setDirectors(String directors) {
        this.directors = directors;
    }

    public String getActors() {
        return actors;
    }

    public void setActors(String actors) {
        this.actors = actors;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public int getRuntime() {
        return runtime;
    }

    public void setRuntime(int runtime) {
        this.runtime = runtime;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getPosterPath() {
        return posterPath;
    }

    public void setPosterPath(String posterPath) {
        this.posterPath = posterPath;
    }

    public String getTrailerPath() {
        return trailerPath;
    }

    public void setTrailerPath(String trailerPath) {
        this.trailerPath = trailerPath;
    }
}
