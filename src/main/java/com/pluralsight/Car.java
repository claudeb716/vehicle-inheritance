package com.pluralsight;

public class Car extends Vehicle {
    //Attributes
     private int numberOfDoors;
     //Getters and Setters

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    //Methods
    public void openTrunk(){}
    public void closeTrunk(){}
}
