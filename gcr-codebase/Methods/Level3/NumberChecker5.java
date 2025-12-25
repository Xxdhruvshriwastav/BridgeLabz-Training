public class NumberChecker5 {

    // Method to check Prime Number
    public static boolean isPrime(int number) {

        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Method to check Neon Number
    public static boolean isNeonNumber(int number) {

        int square = number * number;
        int sum = 0;

        while (square > 0) {
            sum = sum + (square % 10);
            square = square / 10;
        }

        return sum == number;
    }

    // Method to check Spy Number
    public static boolean isSpyNumber(int number) {

        int sum = 0;
        int product = 1;
        int temp = number;

        while (temp > 0) {
            int digit = temp % 10;
            sum = sum + digit;
            product = product * digit;
            temp = temp / 10;
        }

        return sum == product;
    }

    // Method to check Automorphic Number
    public static boolean isAutomorphic(int number) {

        int square = number * number;
        int temp = number;

        while (temp > 0) {
            if (temp % 10 != square % 10) {
                return false;
            }
            temp = temp / 10;
            square = square / 10;
        }

        return true;
    }

    // Method to check Buzz Number
    public static boolean isBuzzNumber(int number) {

        return (number % 7 == 0 || number % 10 == 7);
    }

    // main method
    public static void main(String[] args) {

        int number = 7;

        System.out.println("Number: " + number);
        System.out.println("Is Prime Number? " + isPrime(number));
        System.out.println("Is Neon Number? " + isNeonNumber(number));
        System.out.println("Is Spy Number? " + isSpyNumber(number));
        System.out.println("Is Automorphic Number? " + isAutomorphic(number));
        System.out.println("Is Buzz Number? " + isBuzzNumber(number));
    }
}
