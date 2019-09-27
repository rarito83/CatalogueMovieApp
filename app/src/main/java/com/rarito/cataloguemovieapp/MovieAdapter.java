package com.rarito.cataloguemovieapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MovieAdapter extends BaseAdapter {

    private final Context context;
    private ArrayList<Movie> film;

    public MovieAdapter(Context context) {
        this.context = context;
        film = new ArrayList<>();
    }

    public void setMovie(ArrayList<Movie> film) {
        this.film = film;
    }

    @Override
    public int getCount() {
        return film.size();
    }

    @Override
    public Object getItem(int i) {
        return film.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = LayoutInflater.from(context).inflate(R.layout.item_movie, viewGroup, false);
        }

        ViewHolder viewHolder = new ViewHolder(view);
        Movie film = (Movie) getItem(i);
        viewHolder.bind(film);
        return view;
    }

    private class ViewHolder {
        private TextView txtName;
        private TextView txtDescription;
        private ImageView imgPhoto;

        ViewHolder(View view) {
            imgPhoto = view.findViewById(R.id.img_photo);
            txtName = view.findViewById(R.id.txt_name);
            txtDescription = view.findViewById(R.id.txt_description);
        }

        void bind(Movie film) {
            imgPhoto.setImageResource(film.getPhoto());
            txtName.setText(film.getTitle());
            txtDescription.setText(film.getDescription());
        }
    }
}
