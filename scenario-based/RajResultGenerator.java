import java.util.Scanner;

public class RajResultGenerator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int totalMarks = 0;
        int[] marks = new int[5];

        // Input marks using for loop
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter marks of Subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
            totalMarks += marks[i];
        }

        double average = totalMarks / 5.0;

        System.out.println("\nAverage Marks = " + average);

        // Convert average to grade indicator
        int gradeCode = (int) (average / 10);

        String grade;

        // Switch for grade assignment
        switch (gradeCode) {

            case 9:
            case 10:
                grade = "A+";
                break;

            case 8:
                grade = "A";
                break;

            case 7:
                grade = "B";
                break;

            case 6:
                grade = "C";
                break;

            case 5:
                grade = "D";
                break;

            default:
                grade = "Fail";
        }

        System.out.println("Grade Awarded: " + grade);

        sc.close();
    }
}
