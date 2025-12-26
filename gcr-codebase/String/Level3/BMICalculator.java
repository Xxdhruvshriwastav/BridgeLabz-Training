import java.util.Scanner;

public class BMICalculator {

    // Method to calculate BMI and determine status
    public static String[] calculateBMI(double weight, double heightCm) {
        double heightM = heightCm / 100.0; // convert cm to meters
        double bmi = weight / (heightM * heightM);
        String status;

        if (bmi <= 18.4) {
            status = "Underweight";
        } else if (bmi <= 24.9) {
            status = "Normal";
        } else if (bmi <= 39.9) {
            status = "Overweight";
        } else {
            status = "Obese";
        }

        return new String[] { String.format("%.2f", weight),
                String.format("%.2f", heightCm),
                String.format("%.2f", bmi),
                status };
    }

    // Method to process the entire team and return 2D array with BMI data
    public static String[][] processTeam(double[][] data) {
        String[][] result = new String[data.length][4];
        for (int i = 0; i < data.length; i++) {
            result[i] = calculateBMI(data[i][0], data[i][1]);
        }
        return result;
    }

    
    // Method to display the results in tabular format
    public static void displayResults(String[][] data) {
        System.out.println("Person\tWeight(kg)\tHeight(cm)\tBMI\t\tStatus");
        System.out.println("---------------------------------------------------------------");
        for (int i = 0; i < data.length; i++) {
            System.out.println(
                    (i + 1) + "\t" + data[i][0] + "\t\t" + data[i][1] + "\t\t" + data[i][2] + "\t" + data[i][3]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 10;
        double[][] teamData = new double[n][2]; // 0: weight, 1: height

        // Take user input for weight and height
        for (int i = 0; i < n; i++) {
            System.out.print("Enter weight (kg) for person " + (i + 1) + ": ");
            teamData[i][0] = sc.nextDouble();
            System.out.print("Enter height (cm) for person " + (i + 1) + ": ");
            teamData[i][1] = sc.nextDouble();
        }

        // Process BMI
        String[][] bmiResults = processTeam(teamData);

        // Display results
        displayResults(bmiResults);

        sc.close();
    }
}
