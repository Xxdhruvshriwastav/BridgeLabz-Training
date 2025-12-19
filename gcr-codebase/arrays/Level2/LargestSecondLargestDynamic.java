import java.util.Scanner;

public class LargestSecondLargestDynamic {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        if (number < 0) {
            number = -number; // handle negative numbers
        }

        int maxDigit = 10;              // initial array size
        int[] digits = new int[maxDigit];
        int index = 0;

        // Store digits in array (resize dynamically if needed)
        while (number != 0) {

            // if array is full, increase size by 10
            if (index == maxDigit) {
                maxDigit += 10;                
                int[] temp = new int[maxDigit]; 
                for (int i = 0; i < index; i++) {
                    temp[i] = digits[i];      
                }
                digits = temp;                 
            }

            digits[index] = number % 10;   
            number = number / 10;          
            index++;
        }

        if (index == 0) { // number was 0
            System.out.println("Largest digit = 0");
            System.out.println("No second largest digit");
            return;
        }

        // Initialize largest and second largest
        int largest = digits[0];
        int secondLargest = Integer.MIN_VALUE;

        // Find largest and second largest
        for (int i = 1; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        // Display result
        System.out.println("Largest digit = " + largest);

        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("No second largest digit");
        } else {
            System.out.println("Second largest digit = " + secondLargest);
        }
    }
}
