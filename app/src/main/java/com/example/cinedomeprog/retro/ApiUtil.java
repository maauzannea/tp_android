package com.example.cinedomeprog.retro;

public class ApiUtil {

    private static final String BASE_URL = "https://etudiants.openium.fr/";

    public static MoviesList getServiceClass(){
        return RetrofitAPI.getRetrofit(BASE_URL).create(MoviesList.class);
    }
}