import java.util.Scanner;

public class ElectionBoothManager {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int votesCandidate1 = 0;
        int votesCandidate2 = 0;
        int votesCandidate3 = 0;

        while (true) {

            System.out.print("\nEnter Age (or 0 to exit): ");
            int age = sc.nextInt();

            if (age == 0) {
                System.out.println("\nVoting session closed.");
                break;
            }

            // Check voting eligibility
            if (age < 18) {
                System.out.println("❌ Not eligible to vote.");
                continue;
            }

            System.out.println("Enter your vote:");
            System.out.println("1 - Candidate A");
            System.out.println("2 - Candidate B");
            System.out.println("3 - Candidate C");

            int vote = sc.nextInt();

            // Record vote
            if (vote == 1)
                votesCandidate1++;
            else if (vote == 2)
                votesCandidate2++;
            else if (vote == 3)
                votesCandidate3++;
            else
                System.out.println("❌ Invalid vote!");
        }

        // Display Result Summary
        System.out.println("\n----- Voting Summary -----");
        System.out.println("Candidate A: " + votesCandidate1);
        System.out.println("Candidate B: " + votesCandidate2);
        System.out.println("Candidate C: " + votesCandidate3);

        sc.close();
    }
}
