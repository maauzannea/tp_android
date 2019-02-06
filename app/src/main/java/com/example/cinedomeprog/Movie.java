package com.example.cinedomeprog;

import com.google.gson.annotations.SerializedName;

public class Movie {

    private static final String PATH = "movieShowtimes/onShow/movie/";

    @SerializedName(PATH + "title")
    private String title;

    @SerializedName(PATH + "castingShort/directors")
    private String directors;

    @SerializedName(PATH + "castingShort/actors")
    private String actors;

    @SerializedName(PATH + "release/releaseDate")
    private String releaseDate;

    @SerializedName(PATH + "runtime")
    private int runtime;

    @SerializedName(PATH + "genre/name")
    private String genre;

    @SerializedName(PATH + "poster/href")
    private String posterPath;

    @SerializedName(PATH + "trailer/href")
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
