package com.oops.encapsulation;

class Truck extends Vehicle {

    public Truck(String num, double rate) {
        super(num, "Truck", rate);
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days * 1.5;
    }
}
