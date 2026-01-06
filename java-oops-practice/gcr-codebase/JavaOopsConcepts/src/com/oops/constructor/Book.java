package com.oops.constructor;

public class Book {
	
	String title;
	String author;
	double price;
	
	//	default
	Book(){
		title = "Atomic Habits";
		author = "Thomas binden";
		price = 1299;
	}
	
	// parameterized	
	Book(String title, String author, double price){
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	public void show() {
		System.out.println("Title is: " + title);
		System.out.println("Author is: " + author);
		System.out.println("price is: " + price);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Book b1 = new Book();
		b1.show();
	}

}
