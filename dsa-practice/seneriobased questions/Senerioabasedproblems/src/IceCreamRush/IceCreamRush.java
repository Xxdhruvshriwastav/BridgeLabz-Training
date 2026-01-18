package IceCreamRush;

import java.util.Scanner;

public class IceCreamRush {

    // Bubble Sort based on sales count
    public static void bubbleSort(IceCream[] arr) {

        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {

            for (int j = 0; j < n - i - 1; j++) {

                // compare adjacent flavors
                if (arr[j].salesCount > arr[j + 1].salesCount) {

                    IceCream temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Print flavor list
    public static void printFlavors(IceCream[] arr) {

        for (IceCream ice : arr) {
            System.out.println(
                "Flavor: " + ice.flavorName +
                " | Sold: " + ice.salesCount + " times"
            );
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of ice cream flavors: ");
        int n = sc.nextInt();

        IceCream[] flavors = new IceCream[n];

        System.out.println("Enter flavor name and weekly sales:");

        for (int i = 0; i < n; i++) {
            String name = sc.next();
            int sales = sc.nextInt();
            flavors[i] = new IceCream(name, sales);
        }

        System.out.println("\nBefore sorting:");
        printFlavors(flavors);

        bubbleSort(flavors);

        System.out.println("\nAfter sorting by popularity (ascending):");
        printFlavors(flavors);

        sc.close();
    }
}
