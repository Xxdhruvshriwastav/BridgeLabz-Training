import java.util.Scanner;

public class FizzBuzzz2 {

	public static void main(String[] args) {

		// creating the Scanner object

		Scanner sc = new Scanner(System.in);

		// Taking input from the user

		System.out.println("Enter the Number");
		
		int n = sc.nextInt();
		

		// Checking the no is positive or not
		
                if ( n > 0 ) {
               
		
		// no should be posiive

                while (n >=1 ) {

		// Buzz or Fizz condition

		if (n % 5 == 0 && n % 3 == 0) {
		
		System.out.println("Fizz and Buzz");

				}


		// fizz condtion
		else if (n % 3 == 0) {

		System.out.println("Fizz");

				}

		// buzz condition

		else if (n % 5 == 0) {
		
		System.out.println("Buzz");

			}
		          else {

		// printing the value of interger

                System.out.println(n);

		  }	

			
		      n--;
                              }

		                 }
		 else {
		
		// entered the undesired value
		System.out.println("Entered wrong value");

			}


		                
		// closing the Scanner object
		sc.close();

	}

}
