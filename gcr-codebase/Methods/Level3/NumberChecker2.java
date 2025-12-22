import java.util.Scanner;

public class NumberChecker2 {

    // Method to count digits
    public static int countDigits(int number) {
        int count = 0;
        int n = number;

        while (n != 0) {
            n /= 10;
            count++;
        }
		
        return count;
    }

    // Method to store digits in an array
    public static int[] storeDigits(int number) {
        int size = countDigits(number);
        int[] digits = new int[size];

        int n = number;
		
        for (int i = size - 1; i >= 0; i--) {
            digits[i] = n % 10;
            n /= 10;
        }
		
        return digits;
    }

    // Method to find sum of digits using digits array
    public static int sumOfDigits(int[] digits) {
        int sum = 0;
        for (int d : digits) {
            sum += d;
        }
        return sum;
    }

    // Method to find sum of squares of digits
    public static int sumOfSquaresOfDigits(int[] digits) {
        int sum = 0;
        for (int d : digits) {
            sum += Math.pow(d, 2);
        }
        return sum;
    }

    // Method to check Harshad number
    public static boolean isHarshadNumber(int number, int[] digits) {
        int sum = sumOfDigits(digits);
        return number % sum == 0;
    }

    // Method to find frequency of each digit using 2D array
    public static int[][] digitFrequency(int[] digits) {
        int[][] freq = new int[10][2];

        // Initialize digit column
        for (int i = 0; i < 10; i++) {
            freq[i][0] = i;   // digit
            freq[i][1] = 0;   // frequency
        }

        // Count frequency
        for (int d : digits) {
            freq[d][1]++;
        }

        return freq;
    }

    // Main method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int[] digits = storeDigits(number);

        System.out.println("\nDigits in the number:");
        for (int d : digits) {
            System.out.print(d + " ");
        }

        System.out.println("\n\nCount of digits: " + countDigits(number));
        System.out.println("Sum of digits: " + sumOfDigits(digits));
        System.out.println("Sum of squares of digits: " + sumOfSquaresOfDigits(digits));
        System.out.println("Is Harshad Number? " + isHarshadNumber(number, digits));

        int[][] frequency = digitFrequency(digits);

        System.out.println("\nDigit Frequency:");
        System.out.println("Digit  Frequency");
        for (int i = 0; i < 10; i++) {
            if (frequency[i][1] > 0) {
                System.out.println("  " + frequency[i][0] + "        " + frequency[i][1]);
            }
        }
    }
}
