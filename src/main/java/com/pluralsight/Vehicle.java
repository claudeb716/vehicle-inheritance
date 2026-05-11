package com.pluralsight;

public class Vehicle {
    //Attributes
    private String model;
    private String color;
    private int topSpeed;
    private int fuelcapacity;
    private int numberOfPassengers;
    private int cargoCapacity;
    //Getters and Setters

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }

    public int getFuelcapacity() {
        return fuelcapacity;
    }

    public void setFuelcapacity(int fuelcapacity) {
        this.fuelcapacity = fuelcapacity;
    }

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public void setNumberOfPassengers(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }

    public int getCargoCapacity() {
        return cargoCapacity;
    }

    public void setCargoCapacity(int cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }

    //Methods
    public void startEngine(){}
    public void stopEngine(){}
    public void accelerate(){}
    public void brake(){}

    @Override
    public String toString() {
        return "Vehicle{" +
                "model;" + model + '\'' +
                ", color:'" + color + '\'' +
                ", topSpeed:" + topSpeed +
                ", fuelcapacity:" + fuelcapacity +
                ", numberOfPassengers:" + numberOfPassengers +
                ", cargoCapacity:" + cargoCapacity +
                '}';
    }
}
