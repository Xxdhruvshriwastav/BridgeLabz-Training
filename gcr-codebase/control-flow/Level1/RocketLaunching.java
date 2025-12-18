import java.util.Scanner;

public class RocketLaunching {

	public static void main(String[] args) {

		// creating the Scanner object

		Scanner sc = new Scanner(System.in);

		// Taking input from the user

		System.out.println("Enter the Timer");

		int time = sc.nextInt();

		System.out.println("You Entered the" + time + " " + "countdown");
		// condition

		while ( time >= 1 ) {
		
		System.out.println(time);

		// Decrement operator 

   		time --;

		} 
		
                // printing the values
		System.out.println("Rocket launched");

		// closing the Scanner object
		sc.close();

	}

}
