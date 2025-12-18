import java.util.Scanner;

public class GretestFactor {

	public static void main(String[] args) {

		// creating the Scanner object

		Scanner sc = new Scanner(System.in);

		// Taking input from the user

		System.out.println("Enter the Number");
		
		int number = sc.nextInt();
		
		int greterInteger = 1;

		for (int i =1 ; i <= number-1; i++ ) {
                    
		// find the grestest integer
		
		if (number % i == 0) {

		greterInteger = i;

					}

			}

		System.out.println(" The gretest factor is" + " " + greterInteger );
                                
		// closing the Scanner object
		sc.close();

	}

}
