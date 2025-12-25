import java.util.Scanner;

public class RockPaperScissors {

    public static String computerChoice() {

        // Math.random() generates a number between 0.0 and 0.999

        int r = (int) (Math.random() * 3);
        return r == 0 ? "rock" : r == 1 ? "paper" : "scissors";
    }

    public static int findWinner(String user, String comp) {

        if (user.equals(comp))
            return 0;

        if ((user.equals("rock") && comp.equals("scissors")) ||
                (user.equals("paper") && comp.equals("rock")) ||
                (user.equals("scissors") && comp.equals("paper")))
            return 1;

        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int userWins = 0, compWins = 0;

        System.out.print("Enter number of games: ");
        int games = sc.nextInt();

        for (int i = 1; i <= games; i++) {
            System.out.print("Enter rock/paper/scissors: ");
            String user = sc.next();

            String comp = computerChoice();
            int result = findWinner(user, comp);

            if (result == 1)
                userWins++;
            else if (result == -1)
                compWins++;

            System.out.println("Computer: " + comp);
        }

        System.out.println("\nUser Wins: " + userWins);
        System.out.println("Computer Wins: " + compWins);
        System.out.println("User Win %: " + (userWins * 100.0 / games));

        sc.close();
    }
    
}
