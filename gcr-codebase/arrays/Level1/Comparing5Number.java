import java.util.Scanner;

public class Comparing5Number {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 

        int[] arr = new int[5];

        //  Take user input

        System.out.println("enter numbers:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        //  loop to iterate each element
        for (int i = 0; i < arr.length; i++) {

            int num = arr[i];

            if (num > 0) {
                System.out.print(num + " is Positive");

                // Check even or odd for positive numbers
                if (num % 2 == 0) {
                    System.out.println(" and Even");
                } else {
                    System.out.println(" and Odd");
                }

            } else if (num < 0) {
                System.out.println(num + " is Negative");
            } else {
                System.out.println(num + " is Zero");
            }
        }

        //  Compare first and last elements
        System.out.println("comparing first and last elements");

        if (arr[0] == arr[arr.length - 1]) {
            System.out.println("First and last elements are Equal");
        } else if (arr[0] > arr[arr.length - 1]) {
            System.out.println("First element is Greater than last element");
        } else {
            System.out.println("First element is Less than last element");
        }
        

        // closing the scanner object
        sc.close();
    }
}
