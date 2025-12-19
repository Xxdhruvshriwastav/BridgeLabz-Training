import java.util.Scanner;

public class ReverseNumberUsingArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int maxDigit = 10;               // initial size
        int[] digits = new int[maxDigit];
        int index = 0;

        // Store digits in array
        while (number != 0) {

            // increase array size if needed
            if (index == maxDigit) {
                maxDigit += 10;
                int[] temp = new int[maxDigit];
                for (int i = 0; i < index; i++) {
                    temp[i] = digits[i];
                }
                digits = temp;
            }

            digits[index] = number % 10;   // get last digit
            number = number / 10;          // remove last digit
            index++;
        }

        // Display reversed number
        System.out.print("Reversed number: ");
        for (int i = 0; i < index; i++) {
            System.out.print(digits[i]);
        }
    }
}
