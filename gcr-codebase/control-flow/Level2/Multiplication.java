import java.util.Scanner;

public class Multiplication {

	public static void main(String[] args) {

		// creating the Scanner object

		Scanner sc = new Scanner(System.in);

		// Taking input from the user

		System.out.println("Enter the Number");
		
		int n = sc.nextInt();
		
		
		
               if ( n >= 6 && 9 >= n ) {
               // Calculating and printing the table
		for (int i = 1; i <= 10; i++) {
		
		int table = n * i;

		System.out.println(table);

		                           }
		} else {

		System.out.println("You are going to against the rule");

			}

		                
		// closing the Scanner object
		sc.close();

	}

}
