package com.inheritance;

public class ElectricVehicle extends Vehicle implements Refuelable {

    public int batteryCapacity; // in kWh

    public ElectricVehicle(int maxspeed, String model, int batteryCapacity) {
        super(maxspeed, model);
        this.batteryCapacity = batteryCapacity;
    }

    @Override
    public void refuel() {
        System.out.println("Charging the electric vehicle...");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Battery Capacity: " + batteryCapacity + " kWh");
    }
}
