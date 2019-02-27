package com.example.cinedomeprog.classesCinema;

import java.io.Serializable;
import java.util.List;

public class Movie implements Serializable {
    public String title;
    public CastingShort castingShort;
    public Release release;
    public int runtime;
    public Poster poster;
    public Trailer trailer;
    public Statistics statistics;
    public List<Genre> genre;
}
