import java.util.Arrays;

public class FactorUtils {

    // Method to find factors of a number and return as array
    public static int[] findFactors(int number) {
        // First, count the number of factors
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }

        // Create array to store factors
        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index++] = i;
            }
        }
        return factors;
    }

    // Method to find the greatest factor
    public static int greatestFactor(int[] factors) {
        return factors[factors.length - 1]; // Last element in sorted array
    }

    // Method to find sum of factors
    public static int sumOfFactors(int[] factors) {
        int sum = 0;
        for (int f : factors) {
            sum += f;
        }
        return sum;
    }

    // Method to find product of factors
    public static long productOfFactors(int[] factors) {
        long product = 1;
        for (int f : factors) {
            product *= f;
        }
        return product;
    }

    // Method to find product of cube of factors
    public static long productOfCubeOfFactors(int[] factors) {
        long product = 1;
        for (int f : factors) {
            product *= Math.pow(f, 3);
        }
        return product;
    }

    // main method
    public static void main(String[] args) {

        int number = 6;

        int[] factors = findFactors(number);

        System.out.println("Number: " + number);
        System.out.println("Factors Array: " + Arrays.toString(factors));
        System.out.println("Greatest Factor: " + greatestFactor(factors));
        System.out.println("Sum of Factors: " + sumOfFactors(factors));
        System.out.println("Product of Factors: " + productOfFactors(factors));
        System.out.println("Product of Cube of Factors: " + productOfCubeOfFactors(factors));
    }
}
