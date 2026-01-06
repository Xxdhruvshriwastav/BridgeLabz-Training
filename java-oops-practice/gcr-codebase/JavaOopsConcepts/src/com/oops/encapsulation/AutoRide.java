package com.oops.encapsulation;

class AutoRide extends RideVehicle {

    public AutoRide(String id, String driver, double rate) {
        super(id, driver, rate);
    }

    @Override
    public double calculateFare(double distance) {
        return getRatePerKm() * distance * 0.9;
    }
}