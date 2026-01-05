import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int randNo = (int) (Math.random() * 100) + 1; // rand no btw 1 to 100
        int attempt = 0; // no of attempts

        do {
            System.out.println("Guess the no btw 1 to 100");
            int userGuess = sc.nextInt();
            attempt++;

            if (userGuess == randNo) {
                System.out.println("You guess is correct");

            } else if (userGuess < randNo) {
                System.out.println("Your Guess is too low ");

            } else {
                System.out.println("Your Guess is too high ");

            }

        } while (attempt < 5);

        sc.close();
    }
}
