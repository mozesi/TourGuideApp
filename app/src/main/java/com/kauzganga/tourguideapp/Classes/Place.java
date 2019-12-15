package com.kauzganga.tourguideapp.Classes;

public class Place {

    private String nameOfPlace;
    private String serviceDescription;
    private int image;
    private String location;

    public Place(String mNameofPlace, String mLocation,String mServiceDescription, int mImage){
        this.nameOfPlace = mNameofPlace;
        this.serviceDescription = mServiceDescription;
        this.image = mImage;
        this.location =mLocation;


    }

    public String getNameOfPlace() {
        return nameOfPlace;
    }

    public String getServiceDescription() {
        return serviceDescription;
    }

    public int getImage() {
        return image;
    }

    public String getLocation() {
        return location;
    }

}
