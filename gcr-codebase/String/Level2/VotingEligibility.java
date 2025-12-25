import java.util.Scanner;
import java.util.Random;

public class VotingEligibility {

    // Method to generate random ages (2-digit) for n students
    public static int[] generateRandomAges(int n) {
        Random rand = new Random();
        int[] ages = new int[n];
        for (int i = 0; i < n; i++) {
            ages[i] = 10 + rand.nextInt(90); // Generates ages between 10 and 99
        }
        return ages;
    }

    // Method to check voting eligibility and return 2D array with age and
    // eligibility
    public static String[][] checkVotingEligibility(int[] ages) {
        String[][] result = new String[ages.length][2];
        for (int i = 0; i < ages.length; i++) {
            result[i][0] = String.valueOf(ages[i]);
            if (ages[i] < 0) {
                result[i][1] = "Cannot Vote";
            } else if (ages[i] >= 18) {
                result[i][1] = "Can Vote";
            } else {
                result[i][1] = "Cannot Vote";
            }
        }
        return result;
    }

    // Method to display the 2D array in tabular format
    public static void displayResult(String[][] data) {
        System.out.println("Student\tAge\tVoting Eligibility");
        System.out.println("--------------------------------");
        for (int i = 0; i < data.length; i++) {
            System.out.println((i + 1) + "\t" + data[i][0] + "\t" + data[i][1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();

        // Generate random ages for students
        int[] ages = generateRandomAges(n);

        // Check voting eligibility
        String[][] result = checkVotingEligibility(ages);

        // Display the results
        displayResult(result);

        sc.close();
    }
}
