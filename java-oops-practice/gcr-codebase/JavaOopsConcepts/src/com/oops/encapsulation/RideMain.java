package com.oops.encapsulation;

class RideMain {

    static void calculateRide(RideVehicle v) {
        v.getVehicleDetails();
        System.out.println("Fare (10km): " + v.calculateFare(10));
        System.out.println("---------------------");
    }

    public static void main(String[] args) {

        RideVehicle rides[] = {
                new CarRide("CAB101", "Sandeep", 15),
                new BikeRide("BIK202", "Rohit", 10),
                new AutoRide("AUT303", "Amit", 12)
        };

        for (RideVehicle r : rides)
            calculateRide(r);
    }
}