package day5.MediStore;

public class Syrup extends Medicine {

    public Syrup(String name, int expiryDate, int quantity) {
        super(name, expiryDate, quantity);
    }

    @Override
    public boolean checkExpiry() {
        return expiryDate <= 2024;  
    }
}
