import java.util.Scanner;

public class FindMultipleUsingWhileLoopp {

	public static void main(String[] args) {

		// creating the Scanner object

		Scanner sc = new Scanner(System.in);

		// Taking input from the user

		System.out.println("Enter the number");
		
		int number = sc.nextInt();
		
		System.out.println("Enter the base");
		
		
		
		int i = 1;

		if (number > 0 && number < 100  ) {

	        while (number > i) {
		 
		if ( number % i ) {
		
		
		System.out.println("This no is divisible by " + i);
		i++;
					}

				          }
					     }

		
                                
		// closing the Scanner object
		sc.close();

	}

}
