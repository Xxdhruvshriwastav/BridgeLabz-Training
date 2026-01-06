package day1;

public class Customer {

	 private int customerId;
	    private String name;

	    public Customer(int id, String name) {
	        this.customerId = id;
	        this.name = name;
	    }

	    public void showCustomer() {
	        System.out.println("\nCustomer ID: " + customerId);
	        System.out.println("Name: " + name);
	    }
}
