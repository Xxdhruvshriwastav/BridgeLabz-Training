package day1;

class Truck extends Vehicle {

    private double loadFee;

    public Truck(String num, String model, double rate, double loadFee) {
        super(num, model, rate);
        this.loadFee = loadFee;
    }

    @Override
    public double calculateRent(int days) {
        return (baseRate * days) + loadFee;   // operator + polymorphism
    }
}
