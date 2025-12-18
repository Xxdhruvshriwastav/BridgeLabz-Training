import java.util.Scanner;

public class FindMultiple {

	public static void main(String[] args) {

		// creating the Scanner object

		Scanner sc = new Scanner(System.in);

		// Taking input from the user

		System.out.println("Enter the Number");
		
		int number = sc.nextInt();
		
		
		if ( number <= 100) {

		for (int i =1 ; i <= number-1; i++ ) {
                    
		// find the grestest integer
		
		if (number % i == 0) {
		
		System.out.println(" The  number is multiple of " + i );

					}

			}

		}
                                
		// closing the Scanner object
		sc.close();

	}

}
