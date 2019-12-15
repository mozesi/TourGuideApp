package com.kauzganga.tourguideapp.customAdapters;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;

import com.kauzganga.tourguideapp.Classes.Place;
import com.kauzganga.tourguideapp.DetailsActivity;
import com.kauzganga.tourguideapp.R;

public class PlaceViewHolder extends RecyclerView.ViewHolder {

    public static String PLACENAME = "placeName";
    public static String SERVICEDESCRIPTION = "serviceDescription";
    public static String LOCATION           = "location";
    public static String IMAGE     = "image";

    private TextView nameOfPlace;
    private TextView serviceDescription;
    private TextView locationTextView;
    private ImageView imageView;
    private LinearLayout linearLayout;

    private Context  mContext;

    public PlaceViewHolder(final View songRecyclerView) {
        super(songRecyclerView);

        nameOfPlace = songRecyclerView.findViewById(R.id.place_name);
        imageView = songRecyclerView.findViewById(R.id.place_icon);
        serviceDescription = songRecyclerView.findViewById(R.id.service_description);
        linearLayout = songRecyclerView.findViewById(R.id.recycler_item);
        locationTextView = songRecyclerView.findViewById(R.id.location);
        mContext =songRecyclerView.getContext();
        linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent detailsIntent = new Intent(mContext, DetailsActivity.class);
                detailsIntent.putExtra(PLACENAME,nameOfPlace.getText());
                detailsIntent.putExtra(SERVICEDESCRIPTION,serviceDescription.getText());
                detailsIntent.putExtra(LOCATION,locationTextView.getText());
                detailsIntent.putExtra(IMAGE,imageView.getDrawable().toString());
                mContext.startActivity(detailsIntent);
            }
        });
    }

    public void setPlaceDetails(Place mPlace) {
        imageView.setImageResource(mPlace.getImage());
        nameOfPlace.setText(mPlace.getNameOfPlace());
        locationTextView.setText(mPlace.getLocation());
        serviceDescription.setText(mPlace.getServiceDescription());

    }
}
