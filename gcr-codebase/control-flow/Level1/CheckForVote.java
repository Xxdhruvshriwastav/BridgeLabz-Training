import java.util.Scanner;

public class CheckForVote {

	public static void main(String[] args) {

		// creating the Scanner object

		Scanner sc = new Scanner(System.in);

		// Taking input from the user

		System.out.println("Enter the age");

		int age = sc.nextInt();


		// check the condition for vote
		// above 18 age can vote
		           	
		if ( age > 18) {
		
                System.out.println("He/She can vote ");

		} else {
			
		System.out.println("He/She cannot vote");

		}
		
		
		// closing the Scanner object
		sc.close();

	}

}
