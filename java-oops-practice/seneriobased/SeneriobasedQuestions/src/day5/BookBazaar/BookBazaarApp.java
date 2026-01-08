package day5.BookBazaar;

public class BookBazaarApp {

    public static void main(String[] args) {

        Book ebook = new EBook("Java Mastery", "Ashish", 500, 10);
        Book printedBook = new PrintedBook("DSA Handbook", "Vedant", 800, 5);

        Order order1 = new Order("Rudra", ebook, 2);
        Order order2 = new Order("Rudra", printedBook, 1);

        if (ebook.reduceStock(2)) {
            System.out.println("EBook Total: ₹" + order1.calculateTotal());
        }

        if (printedBook.reduceStock(1)) {
            System.out.println("Printed Book Total: ₹" + order2.calculateTotal());
        }

        order1.updateStatus("CONFIRMED");
        System.out.println("Order Status: " + order1.getStatus());
    }
}
