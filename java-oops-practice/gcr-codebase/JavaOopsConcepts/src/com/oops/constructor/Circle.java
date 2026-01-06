package com.bridgelabz.oops.constructor.levelone;

public class Circle {

	double radius = 5;
	
	Circle(){
		this(5);
	}
	
	Circle(double radius){
		System.out.println("Radius is: " + radius);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c1 = new Circle(3.5);	
		Circle c2 = new Circle();
	}

}
