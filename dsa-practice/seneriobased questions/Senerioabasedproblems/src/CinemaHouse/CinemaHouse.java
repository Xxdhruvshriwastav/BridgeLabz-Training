package CinemaHouse;

import java.util.Scanner;

public class CinemaHouse {

    // Bubble Sort method
    public static void bubbleSort(int[] showTimes) {

        int n = showTimes.length;

        for (int i = 0; i < n - 1; i++) {

            for (int j = 0; j < n - i - 1; j++) {

                // swap if order is wrong
                if (showTimes[j] > showTimes[j + 1]) {

                    int temp = showTimes[j];
                    showTimes[j] = showTimes[j + 1];
                    showTimes[j + 1] = temp;
                }
            }
        }
    }

    // Print showtimes
    public static void printShows(int[] arr) {
        for (int time : arr) {
            System.out.print(time + " ");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of shows today: ");
        int n = sc.nextInt();

        int[] showTimes = new int[n];

        System.out.println("Enter show times (24-hour format):");

        for (int i = 0; i < n; i++) {
            showTimes[i] = sc.nextInt();
        }

        System.out.println("Before sorting:");
        printShows(showTimes);

        bubbleSort(showTimes);

        System.out.println("After sorting show times:");
        printShows(showTimes);

        sc.close();
    }
}
