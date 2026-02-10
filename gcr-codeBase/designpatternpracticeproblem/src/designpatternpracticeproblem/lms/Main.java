package designpatternpracticeproblem.lms;


public class Main {

    public static void main(String[] args) {

        LibraryCatalog catalog = LibraryCatalog.getInstance();

        User u1 = UserFactory.createUser("Student");
        User u2 = UserFactory.createUser("Faculty");
        User u3 = UserFactory.createUser("Librarian");

        catalog.subscribe(u1);
        catalog.subscribe(u2);
        catalog.subscribe(u3);

        Book book1 = new Book.BookBuilder("Clean Code")
                .author("Robert Martin")
                .edition(2)
                .genre("Programming")
                .build();

        Book book2 = new Book.BookBuilder("Java Basics")
                .build();

        catalog.addBook(book1);
        catalog.addBook(book2);
    }
}
