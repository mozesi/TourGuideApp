package com.kauzganga.tourguideapp.customAdapters;

import android.util.Log;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.kauzganga.tourguideapp.fragments.BeachesFragments;
import com.kauzganga.tourguideapp.fragments.GameRevervesFragment;
import com.kauzganga.tourguideapp.fragments.HotelsFragment;
import com.kauzganga.tourguideapp.fragments.RestaurantsFragment;

public class CustomFragmentAdapter extends FragmentPagerAdapter {
    public CustomFragmentAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if(position == 0){
            return new RestaurantsFragment();
        }else if(position == 1){
            return new GameRevervesFragment();
        }else if(position == 2){
            return new HotelsFragment();
        }else{
            return new BeachesFragments();
        }

    }

    @Override
    public int getCount() {
        return 4;
    }
}
