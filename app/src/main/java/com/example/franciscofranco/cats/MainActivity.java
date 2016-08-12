package com.example.franciscofranco.cats;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    private ImageView imageView;
    private static final String API_KEY = "MTA4Njky";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = (ImageView) findViewById(R.id.imageView);
    }

    public void refresh(View v) {
        String url = "http://thecatapi.com/api/images/get?format=src&api_key=" + API_KEY;

        Picasso.with(this)
                .load(url)
                .skipMemoryCache()
                .placeholder(R.mipmap.loading)
                .into(imageView);
    }

}
