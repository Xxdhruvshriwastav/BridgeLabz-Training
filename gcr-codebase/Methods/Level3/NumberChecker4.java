import java.util.Arrays;

public class NumberChecker4 {

    // Method to count digits
    public static int countDigits(int number) {
        int count = 0;
        while (number > 0) {
            count++;
            number /= 10;
        }
        return count;
    }

    // Method to store digits in array
    public static int[] storeDigits(int number) {
        int count = countDigits(number);
        int[] digits = new int[count];

        for (int i = count - 1; i >= 0; i--) {
            digits[i] = number % 10;
            number /= 10;
        }
        return digits;
    }

    // Method to reverse digits array
    public static int[] reverseArray(int[] arr) {
        int[] rev = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            rev[i] = arr[arr.length - 1 - i];
        }
        return rev;
    }

    // Method to compare two arrays
    public static boolean compareArrays(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length)
            return false;

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i])
                return false;
        }
        return true;
    }

    // Method to check palindrome using digits
    public static boolean isPalindrome(int number) {
        int[] digits = storeDigits(number);
        int[] reversed = reverseArray(digits);
        return compareArrays(digits, reversed);
    }

    // Method to check Duck Number using digits array
    public static boolean isDuckNumber(int number) {
        int[] digits = storeDigits(number);

        for (int d : digits) {
            if (d == 0) {
                return true;   // contains zero
            }
        }
        return false;
    }

    // main method
    public static void main(String[] args) {

        int number = 12021;

        int[] digits = storeDigits(number);
        int[] reversed = reverseArray(digits);

        System.out.println("Number: " + number);
        System.out.println("Digit Count: " + countDigits(number));
        System.out.println("Digits Array: " + Arrays.toString(digits));
        System.out.println("Reversed Array: " + Arrays.toString(reversed));

        System.out.println("Is Palindrome? " + isPalindrome(number));
        System.out.println("Is Duck Number? " + isDuckNumber(number));
    }
}
