package BookShelf;

public class BooKShelfMain {

    public static void main(String[] args) {

        BookShelf shelf = new BookShelf();

        Book b1 = new Book("1984", "George Orwell");
        Book b2 = new Book("Dune", "Frank Herbert");
        Book b3 = new Book("Sapiens", "Yuval Noah Harari");

        shelf.addBook("Fiction", b1);
        shelf.addBook("Fiction", b2);
        shelf.addBook("Science", b3);

        System.out.println("Library Catalog");
        shelf.showCatalog();

        System.out.println(" Borrow Book ");
        shelf.borrowBook("Fiction", b1);

        System.out.println(" Updated Catalog ");
        shelf.showCatalog();
    }
}
