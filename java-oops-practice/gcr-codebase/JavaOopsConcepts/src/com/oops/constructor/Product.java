package com.oops.constructor;

public class Product {

	private String productName;
	private int price;
	private static int totalProducts;
	
	Product(String productName, int price){
		this.productName = productName;
		this.price = price;
		totalProducts = totalProducts+1;
	}
	
	public void displayProductDetails() {
		System.out.println("Product name: " + productName);
		System.out.println("Price: " + price);
	}
	
	public static void displayTotalProducts() {
		System.out.println("Total Products: " + totalProducts);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p1 = new Product("Rice", 79);
		p1.displayProductDetails();
		displayTotalProducts();
		
	}

}
