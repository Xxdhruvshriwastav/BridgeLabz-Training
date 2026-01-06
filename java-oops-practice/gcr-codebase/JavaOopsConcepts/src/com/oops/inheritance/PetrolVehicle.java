package com.oops.inheritance;

public class PetrolVehicle extends Vehicle implements Refuelable {
    public int mileage; // in km/l

    public PetrolVehicle(int maxspeed, String model, int mileage) {
        super(maxspeed, model);
        this.mileage = mileage;
    }

    @Override
    public void refuel() {
        System.out.println("Refueling the petrol vehicle...");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Mileage: " + mileage + " km/l");
    }
}
