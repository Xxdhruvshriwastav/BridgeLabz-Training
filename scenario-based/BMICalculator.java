import java.util.Scanner;

public class BMICalculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Input: Weight in kilograms
        System.out.print("Enter weight in kg: ");
        double weightInKg = scanner.nextDouble();

        // Input: Height in meters
        System.out.print("Enter height in meters: ");
        double heightInMeters = scanner.nextDouble();

        // BMI formula → BMI = weight / (height * height)
        double bmiValue = weightInKg / (heightInMeters * heightInMeters);

        System.out.println("\nYour BMI is: " + bmiValue);

        // Determine BMI category using if-else conditions
        if (bmiValue < 18.5) {
            System.out.println("Category: Underweight");
        } else if (bmiValue >= 18.5 && bmiValue <= 24.9) {
            System.out.println("Category: Normal");
        } else {
            System.out.println("Category: Overweight");
        }

        scanner.close();
    }
}
