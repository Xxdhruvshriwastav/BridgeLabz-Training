package com.bridgelabz.oops.constructor.levelone;

public class BookClass {

	    public String ISBN;
	    protected String title;
	    private String author;

	    // Constructor
	    BookClass(String ISBN, String title, String author) {
	        this.ISBN = ISBN;
	        this.title = title;
	        this.author = author;
	    }

	    // Public setter for author
	    public void setAuthor(String author) {
	        this.author = author;
	    }

	    // Public getter for author
	    public String getAuthor() {
	        return author;
	    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BookClass book = new BookClass(
                "+91 90909090909",
                "Core Java",
                "John david"
        );

        // Accessing public and protected members
        System.out.println("ISBN: " + book.ISBN);
        System.out.println("Title: " + book.title);

        // Accessing private member using getter
        System.out.println("Author: " + book.getAuthor());

        // Modifying private member using setter
        book.setAuthor("J. Bloch");
        System.out.println("Updated Author: " + book.getAuthor());
	}

}
