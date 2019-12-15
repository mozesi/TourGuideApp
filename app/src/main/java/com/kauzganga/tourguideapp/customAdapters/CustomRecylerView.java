package com.kauzganga.tourguideapp.customAdapters;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.kauzganga.tourguideapp.Classes.Place;
import com.kauzganga.tourguideapp.R;

import java.util.ArrayList;


public class CustomRecylerView extends RecyclerView.Adapter<PlaceViewHolder> {

    private int  placesSize;
    ArrayList <Place> tourPlaces;

    public CustomRecylerView(ArrayList <Place> mPlaces){
        this.placesSize = mPlaces.size();
        this.tourPlaces = mPlaces;
    }
    @NonNull
    @Override
    public PlaceViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View songRecyclerView = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_item, parent, false);
        return new PlaceViewHolder(songRecyclerView);
    }

    @Override
    public void onBindViewHolder(@NonNull PlaceViewHolder holder, int position) {
        holder.setPlaceDetails(tourPlaces.get(position));
    }

    @Override
    public int getItemCount() {
        return tourPlaces.size();
    }
}
