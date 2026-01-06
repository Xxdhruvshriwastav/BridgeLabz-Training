package com.oops.constructor;

public class Vehicle {
	
	 // Instance Variables
    String ownerName;
    String vehicleType;

    // Class Variable
    static double registrationFee = 1500.0;

    // Constructor
    Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    // Instance Method
    void displayVehicleDetails() {
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Fee: ₹" + registrationFee);
    }

    // Class Method
    static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle v1 = new Vehicle("Amit", "Car");
        Vehicle v2 = new Vehicle("Neha", "Bike");

        v1.displayVehicleDetails();
        v2.displayVehicleDetails();

        // Update registration fee for all vehicles
        Vehicle.updateRegistrationFee(2000.0);

        v1.displayVehicleDetails();
        v2.displayVehicleDetails();
	}

}
