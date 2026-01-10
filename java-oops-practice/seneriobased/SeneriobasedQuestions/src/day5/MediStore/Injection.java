package day5.MediStore;

public class Injection extends Medicine {

	public Injection (String name, int expiryDate, int quantity) {
		super(name, expiryDate, quantity);
	}
	
	@Override
    public boolean checkExpiry() {
        return expiryDate <= 2023;  // more sensitive
    }
}
