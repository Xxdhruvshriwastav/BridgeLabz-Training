import java.util.Scanner;

public class CheckNaturalNo {

	public static void main(String[] args) {

		// creating the Scanner object

		Scanner sc = new Scanner(System.in);

		// Taking input from the user

		System.out.println("Enter the no ");

		int n = sc.nextInt();

		int naturalNo = n * (n+1) / 2;

           	
		if ( n < 0 ) {
		
                System.out.println("Not natural no  ");

		} else {
			
		System.out.println("The sum of " + n + "natural numbers is" + naturalNo);

		}
		
		
		// closing the Scanner object
		sc.close();

	}

}
