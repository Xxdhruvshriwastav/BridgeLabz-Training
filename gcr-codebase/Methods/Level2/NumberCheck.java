import java.util.Scanner;

public class NumberCheck {

    // Method to check whether number is positive or negative
    public static boolean isPositive(int num) {
        return num >= 0;
    }

    // Method to check whether number is even or odd
    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    // Method to compare two numbers
    
    public static int compare(int num1, int num2) {

        if (num1 > num2) {
            return 1;
        } else if (num1 == num2) {
            return 0;
        } else {
            return -1;
        }
    }

    // Main method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];

        // Taking user input
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter number " + (i + 1));
            arr[i] = sc.nextInt();
        }

        // Checking positive/negative and even/odd
        for (int i = 0; i < arr.length; i++) {

            if (isPositive(arr[i])) {
                System.out.print(arr[i] + " is Positive and ");

                if (isEven(arr[i])) {
                    System.out.println("Even");
                } else {
                    System.out.println("Odd");
                }

            } else {
                System.out.println(arr[i] + " is Negative");
            }
        }

        // Comparing first and last elements
        int result = compare(arr[0], arr[arr.length - 1]);

        System.out.println("\nComparison of first and last elements:");

        if (result == 1) {
            System.out.println("First element is greater than last element");
        } else if (result == 0) {
            System.out.println("First element is equal to last element");
        } else {
            System.out.println("First element is less than last element");
        }

        sc.close();
    }
}
