package com.pluralsight;

public class Main {
    public static void main(String[] args) {

        //Create an instance of each Vehicle types
        // Use setters
        //Moped
        Moped mo = new Moped();
        mo.setMaxWeight(200);
        mo.setColor("Red");
        mo.setModel("Suzuki");
        mo.setTopSpeed(200);
        System.out.println("Moped Weights: " + mo.getMaxWeight());
        System.out.println("Moped Color: " + mo.getColor());
        System.out.println("Moped Model: " + mo.getModel());
        System.out.println("Moped Top Speed: " + mo.getTopSpeed());
        System.out.println(mo);
        // Car

        //SemiTruck
        //HoverCraft
    }
}
