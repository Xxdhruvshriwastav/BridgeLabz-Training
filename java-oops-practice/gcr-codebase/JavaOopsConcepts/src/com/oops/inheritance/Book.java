package com.oops.inheritance;

public class Book {

	public String title;
	public int publicationYear;

	Book(String title, int publicationYear) {

		this.title = title;
		this.publicationYear = publicationYear;
	}

	public void displayInfoBook() {

		System.out.println("The title is " + title);
		System.out.println("The publicationYear is " + publicationYear);

	}
}
