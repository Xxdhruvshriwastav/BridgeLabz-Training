public class NumberChecker6 {

    // Method to calculate sum of proper divisors  // 28 -> 1 2 4 7 14 = 28; so this is proper divisors
    public static int sumOfDivisors(int number) {
        int sum = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum;
    }

    // Method to check Perfect Number
    public static boolean isPerfect(int number) {
        return sumOfDivisors(number) == number;
    }

    // Method to check Abundant Number   // sum of proper divisors > number
	
    public static boolean isAbundant(int number) {
        return sumOfDivisors(number) > number;
    }

    // Method to check Deficient Number  sum of proper divisors > number
    public static boolean isDeficient(int number) {
        return sumOfDivisors(number) < number;
    }

    // Method to calculate factorial of a number     
    public static int factorial(int n) {
        int fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    // Method to check Strong Number   // 145    1! =  1, 4! = 24 , 5! = 120  1 + 24 + 120 = 145
    public static boolean isStrong(int number) {
        int sum = 0;
        int temp = number;

        while (temp > 0) {
            int digit = temp % 10;
            sum += factorial(digit);
            temp /= 10;
        }

        return sum == number;
    }

    // Main method
    public static void main(String[] args) {

        int number = 28;

        System.out.println("Number: " + number);
        System.out.println("Is Perfect Number? " + isPerfect(number));
        System.out.println("Is Abundant Number? " + isAbundant(number));
        System.out.println("Is Deficient Number? " + isDeficient(number));
        System.out.println("Is Strong Number? " + isStrong(number));
    }
}
