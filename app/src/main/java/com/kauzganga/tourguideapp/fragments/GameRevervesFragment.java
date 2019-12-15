package com.kauzganga.tourguideapp.fragments;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.kauzganga.tourguideapp.Classes.Place;
import com.kauzganga.tourguideapp.R;
import com.kauzganga.tourguideapp.customAdapters.CustomRecylerView;

import java.util.ArrayList;

/**
 Fragment to display list of restaurants
 */
public class GameRevervesFragment extends Fragment {
    private RecyclerView.LayoutManager layoutManager;
    private RecyclerView recyclerView;
    private String[] gameReservesArray;
    private ArrayList<Place> gameReserves = new ArrayList<Place>();
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_main, container, false);
    }
    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState){
        super.onViewCreated(view,savedInstanceState);
        gameReservesArray = getResources().getStringArray(R.array.game_names);
        for(int x=0; x<gameReservesArray.length; x++) {
            gameReserves.add(new Place(gameReservesArray[x],"Mzuzu", getString(R.string.service_desc), R.drawable.outline_restaurant));
        }
        recyclerView = view.findViewById(R.id.recyler_view);
        layoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(new CustomRecylerView(gameReserves));
    }
}
