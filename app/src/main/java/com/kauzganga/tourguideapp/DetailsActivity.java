package com.kauzganga.tourguideapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.kauzganga.tourguideapp.customAdapters.PlaceViewHolder;

public class DetailsActivity extends AppCompatActivity {
    private ImageView placeImageView;
    private TextView placeNameTextView;
    private TextView locationTextView;
    private TextView serviceDescTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        placeImageView = findViewById(R.id.place_image_view);
        placeNameTextView = findViewById(R.id.place_name);
        serviceDescTextView = findViewById(R.id.service_desc);
        locationTextView = findViewById(R.id.location);

        Intent intent = getIntent();
        if(intent != null){
           placeNameTextView.setText(intent.getStringExtra(PlaceViewHolder.PLACENAME));
           serviceDescTextView.setText(intent.getStringExtra(PlaceViewHolder.SERVICEDESCRIPTION));
           locationTextView.setText(intent.getStringExtra(PlaceViewHolder.LOCATION));
           //placeImageView.setImageResource(intent.getIntExtra(PlaceViewHolder.IMAGE,0));
            Log.i("resource 666666",intent.getStringExtra(PlaceViewHolder.IMAGE));

        }
    }
}
