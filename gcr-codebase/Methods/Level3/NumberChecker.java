import java.util.Scanner;

public class NumberChecker {

    // method of check num digit
    public static int countDigits(int number) {
        int count = 0;
        int n = number;
        while (n != 0) {
            n /= 10;
            count++;
        }
        return count;
    }

    // store digit in arr
    public static int[] storeDigits(int number) {
        int numDigits = countDigits(number);
        int[] digits = new int[numDigits];
        int n = number;
        for (int i = numDigits - 1; i >= 0; i--) {
            digits[i] = n % 10;
            n /= 10;
        }
        return digits;
    }

    
    // check no has atleas one zero
    public static boolean isDuckNumber(int[] digits) {
        for (int i = 1; i < digits.length; i++) { // ignore leading digit
            if (digits[i] == 0) {
                return true;
            }
        }
        return false;
    }

    // check Armstrong number
    public static boolean isArmstrong(int[] digits) {
        int numDigits = digits.length;
        int sum = 0;
        for (int d : digits) {
            sum += Math.pow(d, numDigits);
        }

        // again build digit
        int original = 0;
        for (int d : digits) {
            original = original * 10 + d;
        }

        return sum == original;
    }

    // Method to find largest and second largest digits
	
    public static int[] findLargestAndSecondLargest(int[] digits) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int d : digits) {
            if (d > largest) {
                secondLargest = largest;
                largest = d;
            } else if (d > secondLargest && d != largest) {
                secondLargest = d;
            }
        }
        return new int[]{largest, secondLargest};
    }

    // Method to find smallest and second smallest 
	
    public static int[] findSmallestAndSecondSmallest(int[] digits) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int d : digits) {
            if (d < smallest) {
                secondSmallest = smallest;
                smallest = d;
            } else if (d < secondSmallest && d != smallest) {
                secondSmallest = d;
            }
        }
        return new int[]{smallest, secondSmallest};
    }

    // Main method to test the utility
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int[] digits = storeDigits(number);

        System.out.println("Number of digits: " + countDigits(number));
        System.out.print("Digits array: ");
        for (int d : digits) System.out.print(d + " ");
        System.out.println();

        System.out.println("Is Duck Number? " + isDuckNumber(digits));
        System.out.println("Is Armstrong Number? " + isArmstrong(digits));

        int[] largest = findLargestAndSecondLargest(digits);
        System.out.println("Largest digit: " + largest[0] + ", Second Largest: " + largest[1]);

        int[] smallest = findSmallestAndSecondSmallest(digits);
        System.out.println("Smallest digit: " + smallest[0] + ", Second Smallest: " + smallest[1]);
    }
}
