package com.rarito.cataloguemovieapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailMovieActivity extends AppCompatActivity {

    public static String EXTRA_MOVIE = "extra_movie";
    TextView txtTitle;
    TextView txtDescription;
    ImageView imgPhoto;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_movie);

        // menerima data parcelable dari MainActivity
        Movie film = getIntent().getParcelableExtra(EXTRA_MOVIE);

        imgPhoto = findViewById(R.id.img_photo_recieved);
        imgPhoto.setImageResource(film.getPhoto());

        txtTitle = findViewById(R.id.tv_title_recieved);
        txtTitle.setText(film.getTitle());

        txtDescription = findViewById(R.id.tv_description_recieved);
        txtDescription.setText(film.getDescription());


    }
}
