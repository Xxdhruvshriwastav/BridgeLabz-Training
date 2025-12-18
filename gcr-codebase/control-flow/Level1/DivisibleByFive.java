import java.util.Scanner;

public class DivisibleByFive {

	public static void main(String[] args) {

		// creating the Scanner object

		Scanner sc = new Scanner(System.in);

		// Taking input from the user

		System.out.println("Enter the no");

		int num = sc.nextInt();

		// cheking num is divisible by 5 or not

		if (num % 5 == 0) {

			System.out.println("Divisible by 5");

		} else {

			System.out.println("Not divisible by 5");

		}

	}

}
