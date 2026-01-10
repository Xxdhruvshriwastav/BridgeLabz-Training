package day5.MediStore;

public class Tablet extends Medicine {

    public Tablet(String name, int expiryDate, int quantity) {
        super(name, expiryDate, quantity);
    }

    @Override
    public boolean checkExpiry() {
        return expiryDate <= 2025;
    }
}
