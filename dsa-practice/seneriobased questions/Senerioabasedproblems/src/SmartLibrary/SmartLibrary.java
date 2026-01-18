package SmartLibrary;

import java.util.Scanner;
public class SmartLibrary {

    // Insertion Sort by book title (alphabetical)
    public static void insertionSort(Book[] books) {

        for (int i = 1; i < books.length; i++) {

            Book key = books[i];
            int j = i - 1;

            // compare titles alphabetically
            while (j >= 0 &&
                   books[j].title.compareToIgnoreCase(key.title) > 0) {

                books[j + 1] = books[j];
                j--;
            }

            // insert at correct position
            books[j + 1] = key;
        }
    }

    // Display borrowed books
    public static void printBooks(Book[] books) {

        for (Book b : books) {
            System.out.println(b.title);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of borrowed books: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        Book[] books = new Book[n];

        System.out.println("Enter book titles:");

        for (int i = 0; i < n; i++) {
            String title = sc.nextLine();
            books[i] = new Book(title);
        }

        System.out.println("\nBefore auto-sorting:");
        printBooks(books);

        insertionSort(books);

        System.out.println("\nAfter auto-sorting (Alphabetical Order):");
        printBooks(books);

        sc.close();
    }
}
