package com.oops.encapsulation;

class BikeRide extends RideVehicle {

    public BikeRide(String id, String driver, double rate) {
        super(id, driver, rate);
    }

    @Override
    public double calculateFare(double distance) {
        return getRatePerKm() * distance * 0.8; // cheaper
    }
}
