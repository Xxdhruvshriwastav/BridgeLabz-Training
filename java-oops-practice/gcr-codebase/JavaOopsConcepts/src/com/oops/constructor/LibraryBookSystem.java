package com.bridgelabz.oops.constructor.levelone;

public class LibraryBookSystem {

	private String title;
	private String author;
	private double price;
	private boolean availability;
	
	public LibraryBookSystem(String title, String author, double price){
		this.title = title;
		this.author = author;
		this.price = price;
		this.availability = true;
	}
	
	public void borrowBook() {
		if(!availability) {
			System.out.println("Book is not Available");
		}
		else {
			System.out.println("Book Borrowed Successfully");
			availability = false;
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LibraryBookSystem obj1 = new LibraryBookSystem("Atomic Habit", "Thomas", 189);
		obj1.borrowBook();
		obj1.borrowBook();
	}

}
