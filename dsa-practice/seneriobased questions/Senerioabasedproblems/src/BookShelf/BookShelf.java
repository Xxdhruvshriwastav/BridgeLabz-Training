package BookShelf;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

public class BookShelf {

    // genre → list of books
    HashMap<String, LinkedList<Book>> catalog = new HashMap<>();

    // duplicate avoid 
    HashSet<Book> uniqueBooks = new HashSet<>();

    // Book add / return
    public void addBook(String genre, Book book) {

        // duplicate check
        if (uniqueBooks.contains(book)) {
            System.out.println("Duplicate book not allowed: " + book.title);
            return;
        }

        // if  genre box are not  
        if (!catalog.containsKey(genre)) {
            catalog.put(genre, new LinkedList<>());
        }

        catalog.get(genre).add(book);
        uniqueBooks.add(book);

        System.out.println(book.title + " added to " + genre);
    }

    // Book borrow / remove
    public void borrowBook(String genre, Book book) {

        LinkedList<Book> books = catalog.get(genre);

        if (books != null && books.remove(book)) {
            uniqueBooks.remove(book);
            System.out.println(book.title + " borrowed");
        } else {
            System.out.println("Book not found");
        }
    }

    // Show full library
    public void showCatalog() {

        for (String genre : catalog.keySet()) {
            System.out.println("Genre: " + genre);

            for (Book book : catalog.get(genre)) {
                System.out.println("  " + book.title + " by " + book.author);
            }
        }
    }
}

