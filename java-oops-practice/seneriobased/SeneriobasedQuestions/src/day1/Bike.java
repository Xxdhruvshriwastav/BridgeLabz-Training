package day1;

class Bike extends Vehicle {

    public Bike(String num, String model, double rate) {
        super(num, model, rate);
    }

    @Override
    public double calculateRent(int days) {
        return baseRate * days;   // simple rent
    }
}

