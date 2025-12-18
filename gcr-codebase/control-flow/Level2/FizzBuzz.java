import java.util.Scanner;

public class FizzBuzz {

	public static void main(String[] args) {

		// creating the Scanner object

		Scanner sc = new Scanner(System.in);

		// Taking input from the user

		System.out.println("Enter the Number");
		
		int n = sc.nextInt();
		
                if ( n > 0 ) {
               
                for (int i = 1; i <= n; i++ ) {

		if (i % 5 == 0 && i % 3 == 0) {
		
		System.out.println("Fizz and Buzz");

				}

		else if (i % 3 == 0) {

		System.out.println("Fizz");

				}

		else if (i % 5 == 0) {
		
		System.out.println("Buzz");

			}
		          else {

                System.out.println(i);

		  }				
		      }

		         }
		 else {

		System.out.println("Entered wrong value");

			}


		                
		// closing the Scanner object
		sc.close();

	}

}
