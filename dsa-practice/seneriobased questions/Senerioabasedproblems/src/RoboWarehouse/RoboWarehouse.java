package RoboWarehouse;

import java.util.Scanner;

class RoboWarehouse {

    // Method to apply Insertion Sort
    public static void insertionSort(int[] weight) {

        for (int i = 1; i < weight.length; i++) {

            int key = weight[i];   // new package weight
            int j = i - 1;

            // shift heavier packages to right
            
            while (j >= 0 && weight[j] > key) {
                weight[j + 1] = weight[j];
                j--;
            }

            // insert package at correct position
            
            weight[j + 1] = key;
        }
    }

    // Method to print shelf
    
    public static void printShelf(int[] arr) {
        for (int w : arr) {
            System.out.print(w + " ");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of packages: ");
        int n = sc.nextInt();

        int[] weight = new int[n];

        System.out.println("Enter package weights:");

        for (int i = 0; i < n; i++) {
            weight[i] = sc.nextInt();
        }

        System.out.println("\nBefore loading on shelf:");
        printShelf(weight);

        insertionSort(weight);

        System.out.println("\n\nAfter robot loads packages (Ascending Order):");
        printShelf(weight);

        sc.close();
    }
}
