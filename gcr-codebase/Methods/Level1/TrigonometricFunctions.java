import java.util.Scanner;

public class TrigonometricFunctions {

    // method to calculate trigonometric functions
    public static double[] calculateTrigonometricFunctions(double angle) {

        // convert degrees to radians
        double radians = Math.toRadians(angle);

        // calculate trigonometric values
        double sin = Math.sin(radians);
        double cos = Math.cos(radians);
        double tan = Math.tan(radians);

        // store results in array
        double[] result = { sin, cos, tan };

        return result;
    }

    // main method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter angle in degrees");
        double angle = sc.nextDouble();

        double[] values = calculateTrigonometricFunctions(angle);

        for (int i = 0; i < values.length; i++ ) {
			
			System.out.println(values[i] + "  ");
			
		}
		
		
		// Closing the scanner object

        sc.close();
    }
}
