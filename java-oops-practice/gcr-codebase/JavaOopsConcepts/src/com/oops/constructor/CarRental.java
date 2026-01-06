package com.oops.constructor;

public class CarRental {

	private String customerName;
	private String carModel;
	private int rentalDays;
	private int perDayPrice;
	
	public CarRental(String customerName, String carModel, int rentalDays, int perDayPrice){
		this.customerName = customerName;
		this.carModel = carModel;
		this.rentalDays = rentalDays;
		this.perDayPrice = perDayPrice;
	}
	
	public void totalCost() {
		System.out.println("Total Cost: " + (perDayPrice * rentalDays));
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CarRental obj1 = new CarRental("Mohit", "ferrari", 4, 220);
		obj1.totalCost();
	}

}
