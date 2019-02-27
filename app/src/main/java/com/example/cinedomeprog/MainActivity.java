package com.example.cinedomeprog;

import android.os.Bundle;
import android.util.Log;

import com.example.cinedomeprog.classesCinema.Cinema;
import com.example.cinedomeprog.retro.ApiUtil;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private final String TAG = MainActivity.class.getSimpleName();

    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recycler_id);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setHasFixedSize(true);

        ApiUtil.getServiceClass().getAllMovies().enqueue(new Callback<Cinema>() {
            @Override
            public void onResponse(Call<Cinema> call, Response<Cinema> response) {
                if(response.isSuccessful()){
                    Cinema cinema = response.body();
                    if (cinema != null) {
                        Log.d(TAG, "Returned count " + cinema.movieShowtimes.size());
                    }
                    NewAdapter adapter = new NewAdapter(getApplicationContext(), cinema);
                    recyclerView.setAdapter(adapter);
                }
            }

            @Override
            public void onFailure(Call<Cinema> call, Throwable t) {
                //showErrorMessage();
                Log.e(TAG, "error loading from API", t);
            }
        });
    }
}
