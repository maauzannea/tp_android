package com.example.cinedomeprog;

import android.view.View;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

class NewsViewHolder extends RecyclerView.ViewHolder {

    TextView title;

    NewsViewHolder(View itemView) {
        super(itemView);
        title = itemView.findViewById(R.id.post_title);
    }
}
