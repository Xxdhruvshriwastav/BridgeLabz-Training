package designpatternpracticeproblem.lms;


import java.util.*;

public class LibraryCatalog {

    private static LibraryCatalog instance;

    private List<Book> books = new ArrayList<>();
    private List<Observer> users = new ArrayList<>();

    private LibraryCatalog() {}

    public static LibraryCatalog getInstance() {
        if (instance == null) {
            instance = new LibraryCatalog();
        }
        return instance;
    }

    // Observer
    public void subscribe(Observer o) {
        users.add(o);
    }

    private void notifyUsers(String bookName) {
        for (Observer o : users) {
            o.update("New book arrived: " + bookName);
        }
    }

    // Business
    public void addBook(Book book) {
        books.add(book);
        notifyUsers(book.getTitle());
    }
}
