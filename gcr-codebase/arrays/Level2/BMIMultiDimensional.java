import java.util.Scanner;

public class BMIMultiDimensional {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take number of persons
        System.out.print("Enter number of persons: ");
        int number = sc.nextInt();

        // 2D array: [person][0=weight, 1=height, 2=BMI]
        double[][] personData = new double[number][3];

        // Array for weight status
        String[] weightStatus = new String[number];

        // Take input for weight and height
        for (int i = 0; i < number; i++) {
            System.out.println("\nPerson " + (i + 1));

            // Weight input with validation
            do {
                System.out.print("Enter weight (kg): ");
                personData[i][0] = sc.nextDouble();
            } while (personData[i][0] <= 0);

            // Height input with validation
            do {
                System.out.print("Enter height (m): ");
                personData[i][1] = sc.nextDouble();
            } while (personData[i][1] <= 0);
        }

        // Calculate BMI and status
        for (int i = 0; i < number; i++) {

            // BMI = weight / (height * height)
            personData[i][2] =
                    personData[i][0] / (personData[i][1] * personData[i][1]);

            double bmi = personData[i][2];

            if (bmi <= 18.4) {
                weightStatus[i] = "Underweight";
            } else if (bmi <= 24.9) {
                weightStatus[i] = "Normal";
            } else if (bmi <= 39.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        // Display result
        for (int i = 0; i < number; i++) {
            System.out.println("Person " + (i + 1));
            System.out.println("Weight: " + personData[i][0] + " kg");
            System.out.println("Height: " + personData[i][1] + " m");
            System.out.println("BMI: " + personData[i][2]);
            System.out.println("Status: " + weightStatus[i]);
            System.out.println();
        }
    }
}
