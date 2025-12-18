import java.util.Scanner;

public class CheckNo {

	public static void main(String[] args) {

		// creating the Scanner object

		Scanner sc = new Scanner(System.in);

		// Taking input from the user

		System.out.println("Enter the number");

		int num = sc.nextInt();

		// check the condition for vote
		// above 18 age can vote

		if (num > 0) {

			System.out.println(" Positive no ");

		} else if (num == 0) {

			System.out.println("number is zero"); // printing the values

		}

		else {

			System.out.println("number is negative");

		}

		// closing the Scanner object
		sc.close();

	}

}
