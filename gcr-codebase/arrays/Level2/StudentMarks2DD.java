import java.util.Scanner;

public class StudentMarks2DD {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take number of students
        System.out.print("Enter number of students: ");
        int number = sc.nextInt();

        // 2D array: [student][0=Physics, 1=Chemistry, 2=Maths]
        double[][] marks = new double[number][3];

        // Arrays for percentage and grade
        double[] percentage = new double[number];
        String[] grade = new String[number];

        // Input marks
        for (int i = 0; i < number; i++) {
            System.out.println("\nStudent " + (i + 1));

            for (int j = 0; j < 3; j++) {
                do {
                    if (j == 0)
                        System.out.print("Enter Physics marks: ");
                    else if (j == 1)
                        System.out.print("Enter Chemistry marks: ");
                    else
                        System.out.print("Enter Maths marks: ");

                    marks[i][j] = sc.nextDouble();
                } while (marks[i][j] < 0 || marks[i][j] > 100);
            }
        }

        // Calculate percentage and grade
        for (int i = 0; i < number; i++) {

            double total = marks[i][0] + marks[i][1] + marks[i][2];
            percentage[i] = (total / 300) * 100;

            if (percentage[i] >= 75) {
                grade[i] = "A";
            } else if (percentage[i] >= 60) {
                grade[i] = "B";
            } else if (percentage[i] >= 40) {
                grade[i] = "C";
            } else {
                grade[i] = "Fail";
            }
        }

        // Display result
        System.out.println("\n===== STUDENT REPORT =====");
        for (int i = 0; i < number; i++) {
            System.out.println("Student " + (i + 1));
            System.out.println("Physics: " + marks[i][0]);
            System.out.println("Chemistry: " + marks[i][1]);
            System.out.println("Maths: " + marks[i][2]);
            System.out.println("Percentage: " + percentage[i] + "%");
            System.out.println("Grade: " + grade[i]);
            System.out.println();
        }
    }
}
