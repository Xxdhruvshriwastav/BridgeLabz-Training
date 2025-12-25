import java.util.Scanner;

public class StudentScoreCard {

    // Method to generate random 2-digit scores for Physics, Chemistry, Maths
    public static int[][] generateScores(int numStudents) {
        int[][] scores = new int[numStudents][3]; // 3 subjects: Physics, Chemistry, Maths
        for (int i = 0; i < numStudents; i++) {
            for (int j = 0; j < 3; j++) {
                scores[i][j] = 10 + (int)(Math.random() * 90); // Random 2-digit number (10-99)
            }
        }
        return scores;
    }

    // Method to calculate total, average, and percentage
	
    public static double[][] calculateResults(int[][] scores) {
        int numStudents = scores.length;
        double[][] results = new double[numStudents][3]; // total, average, percentage
        for (int i = 0; i < numStudents; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;

            results[i][0] = Math.round(total * 100.0) / 100.0;
            results[i][1] = Math.round(average * 100.0) / 100.0;
            results[i][2] = Math.round(percentage * 100.0) / 100.0;
        }
        return results;
    }

    // Method to display scorecard
    public static void displayScoreCard(int[][] scores, double[][] results) {
        System.out.println("Student\tPhysics\tChemistry\tMaths\tTotal\tAverage\tPercentage");
        for (int i = 0; i < scores.length; i++) {
            System.out.print((i + 1) + "\t");
            for (int j = 0; j < 3; j++) {
                System.out.print(scores[i][j] + "\t");
            }
            for (int j = 0; j < 3; j++) {
                System.out.print(results[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int numStudents = sc.nextInt();

        int[][] scores = generateScores(numStudents);
        double[][] results = calculateResults(scores);
        displayScoreCard(scores, results);
    }
}
