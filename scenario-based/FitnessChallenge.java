import java.util.Scanner;

public class FitnessChallenge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int pushups[] = new int[7];

        for (int i = 0; i < pushups.length; i++) {
            System.out.println("Enter the no of pushups done on day and 0 for skip days " + (i + 1));
            pushups[i] = sc.nextInt();

        }

        int totalPushups = 0;
        int workoutDays = 0;

        double avgPushups = 0.0;

        for (int val : pushups) {

            if (val == 0) {
                continue;
            }

            totalPushups += val;

            workoutDays++;
        }

        avgPushups = totalPushups / (double) workoutDays;

        System.out.println("The number of days of workout this is " + " " + workoutDays);
        System.out.println("The average pushups done on workout days of 7 days is" + " " + avgPushups);
        sc.close();
    }
}
