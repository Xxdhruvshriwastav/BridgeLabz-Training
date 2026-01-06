package com.oops.inheritance;

class Author extends Book {

	public String name;
	public String bio;

	public Author(String name, String bio, String title, int publicationYear) {

		super(title, publicationYear);

		this.name = name;
		this.bio = bio;

	}

	public void displayInfoAuthor() {

		System.out.println("The name is " + name);
		System.out.println("The bio is " + bio);
		displayInfoBook();

	}

}
