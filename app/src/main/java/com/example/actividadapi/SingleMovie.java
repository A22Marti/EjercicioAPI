package com.example.actividadapi;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

import org.json.JSONException;
import org.json.JSONObject;

public class SingleMovie extends AppCompatActivity {

    private TextView titleTextView;
    private ImageView imageView;
    private TextView releaseDateTextView;
    private TextView overviewTextView;
    private Button backButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_movie);


        titleTextView = findViewById(R.id.Title);
        imageView = findViewById(R.id.image);
        releaseDateTextView = findViewById(R.id.Year);
        overviewTextView = findViewById(R.id.introduction);
        backButton = findViewById(R.id.back);

        String movieData = getIntent().getStringExtra("movie_data");

        processMovieData(movieData);

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                onBackPressed();
            }
        });
    }

    private void processMovieData(String movieData) {
        try {
            JSONObject jsonObject = new JSONObject(movieData);

            MovieModelClass model = new MovieModelClass();
            model.setYear(jsonObject.getString("release_date"));
            model.setName2(jsonObject.getString("title"));
            model.setImg2(jsonObject.getString("poster_path"));
            model.setOverview(jsonObject.getString("overview"));

            updateUI(model);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    private void updateUI(MovieModelClass model) {
        titleTextView.setText(model.getName2());
        releaseDateTextView.setText(model.getYear());
        overviewTextView.setText(model.getOverview());

        Glide.with(this)
                .load("https://image.tmdb.org/t/p/w500" + model.getImg2())
                .into(imageView);
    }
}
