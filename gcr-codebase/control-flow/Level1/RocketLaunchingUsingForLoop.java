import java.util.Scanner;

public class RocketLaunchingUsingForLoop {

	public static void main(String[] args) {

		// creating the Scanner object

		Scanner sc = new Scanner(System.in);

		// Taking input from the user

		System.out.println("Enter the Timer");
		
		int n = sc.nextInt();

		
		// condition using for loop 

		for (int timer = n; timer >= 1; timer--){
	
		System.out.println(timer);
		

				}

	
                // printing the values
		System.out.println("Rocket launched");

		// closing the Scanner object
		sc.close();

	}

}
