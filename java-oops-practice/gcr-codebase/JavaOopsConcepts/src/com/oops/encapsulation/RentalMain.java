package com.oops.encapsulation;

class RentalMain {
    public static void main(String[] args) {

        Vehicle vehicles[] = {
                new Car("BR01A1234", 2000),
                new Bike("BR02B5678", 700),
                new Truck("BR03C9999", 5000)
        };

        for (Vehicle v : vehicles) {
            System.out.println("Vehicle: " + v.getVehicleNumber());
            System.out.println("Rental Cost (5 days): " + v.calculateRentalCost(5));

            if (v instanceof Insurable)
                System.out.println("Insurance: " + ((Insurable) v).calculateInsurance());

            System.out.println("---------------------");
        }
    }
}
