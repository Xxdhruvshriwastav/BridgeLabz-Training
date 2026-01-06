package day1;

class Car extends Vehicle {

    private double luxurySurcharge;

    public Car(String num, String model, double rate, double surcharge) {
        super(num, model, rate);
        this.luxurySurcharge = surcharge;
    }

    @Override
    public double calculateRent(int days) {
        return (baseRate * days) + luxurySurcharge;   // operator usage
    }
}
