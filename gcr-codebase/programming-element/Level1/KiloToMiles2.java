import java.util.Scanner;


public class KiloToMiles2 {

	public static void main (String [] args ) {

		// creating the scanner object  

		Scanner sc = new Scanner(System.in);

		// Taking the input from the user

		System.out.println("Enter the distance in km ");
		double kilometer = sc.nextDouble();


		double miles  = miles/kilometer ; //  1 mile = 1.6

                // displaying the output

		System.out.println("Distance in miles = " + miles); 

	}

}
