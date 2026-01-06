package com.oops.encapsulation;

class Book extends LibraryItem implements Reservable {

    public Book(String id, String title, String author) {
        super(id, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 14;
    }

    @Override
    public void reserveItem() {
        System.out.println("Book Reserved");
    }

    @Override
    public boolean checkAvailability() {
        return true;
    }
}
