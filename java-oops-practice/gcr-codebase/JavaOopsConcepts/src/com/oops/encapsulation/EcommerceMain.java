package com.oops.encapsulation;

public class EcommerceMain {
	static void printFinalPrice(Product p) {

        double tax = (p instanceof Taxable) ? ((Taxable) p).calculateTax() : 0;

        double finalPrice = p.getPrice() + tax - p.calculateDiscount();

        System.out.println("Product: " + p.getName());
        System.out.println("Final Price: " + finalPrice);
        System.out.println("------------------");
    }
	 public static void main(String[] args) {

	        Product products[] = {
	                new Electronics(1, "Laptop", 60000),
	                new Clothing(2, "Shirt", 1500),
	                new Groceries(3, "Rice", 1000)
	        };

	        for (Product p : products)
	            printFinalPrice(p);
	    }
	 
}
