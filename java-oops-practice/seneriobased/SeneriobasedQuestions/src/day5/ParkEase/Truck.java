package day5.ParkEase;

public class Truck extends Vehicle {

    public Truck(String vehicleNumber) {
        super(vehicleNumber, 100);
    }

    @Override
    public double calculateCharges(int hours) {
        double penalty = (hours > 3) ? 200 : 0;
        return (baseRate * hours) + penalty;
    }
}
