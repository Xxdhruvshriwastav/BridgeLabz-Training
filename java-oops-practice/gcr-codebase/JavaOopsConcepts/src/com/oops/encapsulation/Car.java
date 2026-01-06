package com.oops.encapsulation;

class Car extends Vehicle implements Insurable {

    public Car(String num, double rate) {
        super(num, "Car", rate);
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    @Override
    public double calculateInsurance() {
        return 2000;
    }

    @Override
    public String getInsuranceDetails() {
        return "Car Insurance Applied";
    }
}
