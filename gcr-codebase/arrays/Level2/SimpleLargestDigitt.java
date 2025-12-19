import java.util.Scanner;

public class SimpleLargestDigitt {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // take number input
        System.out.println("Enter a number: ");
        int number = sc.nextInt();

        int maxDigit = 10;            // max size of array
        int[] digits = new int[maxDigit];  // array to store digits
        int index = 0;                // index for array

        // store digits in array
        while (number != 0) {
            if (index == maxDigit) {
                break; // stop if array is full
            }
            digits[index] = number % 10; // get last digit
            number = number / 10;        // remove last digit
            index++;
        }

        int largest = 0;
        int secondLargest = 0;

        // find largest and second largest
        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        // display result
        System.out.println("Largest digit = " + largest);
        System.out.println("Second largest digit = " + secondLargest);
    }
}
