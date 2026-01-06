package day1;

abstract class Vehicle implements Rentable {

	protected String vehicleNumber;   // accessible to child classes
    protected String model;
    protected double baseRate;
	
    public Vehicle(String vehicleNumber, String model, double baseRate) {
        this.vehicleNumber = vehicleNumber;
        this.model = model;
        this.baseRate = baseRate;
    }
    
    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public String getModel() {
        return model;
    }

    public double getBaseRate() {
        return baseRate;
    }

    // Common method
    public void showDetails() {
        System.out.println("Vehicle No: " + vehicleNumber);
        System.out.println("Model: " + model);
        System.out.println("Base Rate: " + baseRate);
    }
}
