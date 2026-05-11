package com.pluralsight;

public class SemiTruck extends  Vehicle {
    //Attributes
    private int numberOfTrailers;
    //Getters and Setters

    public int getNumberOfTrailers() {
        return numberOfTrailers;
    }

    public void setNumberOfTrailers(int numberOfTrailers) {
        this.numberOfTrailers = numberOfTrailers;
    }

    //Methods
    public void loadCargo(){}
    public void unloadCargo(){}
}
