import java.util.Scanner;

public class FizzBuzz {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a positive number:");
        int number = sc.nextInt();

        if (number <= 0) {
            System.out.println("Please enter a positive integer.");
            return;
        }

        String[] result = new String[number];

        int index = 0;   // array index

        // Loop from 1 to number
        for (int i = 1; i <= number; i++) {

            if (i % 3 == 0 && i % 5 == 0) {
                result[index] = "FizzBuzz";
            }
            else if (i % 3 == 0) {
                result[index] = "Fizz";
            }
            else if (i % 5 == 0) {
                result[index] = "Buzz";
            }
            else {
                result[index] = String.valueOf(i);
            }

            index++; // move to next array position
        }

        // Print results
        for (int i = 0; i < result.length; i++) {
            System.out.println("Position " + (i + 1) + " = " + result[i]);
        }

        sc.close();
    }
}
