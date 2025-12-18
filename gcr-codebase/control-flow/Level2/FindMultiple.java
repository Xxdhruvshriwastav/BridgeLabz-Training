import java.util.Scanner;

public class FindMultiple {

	public static void main(String[] args) {

		// creating the Scanner object

		Scanner sc = new Scanner(System.in);

		// Taking input from the user

		System.out.println("Enter the power");
		
		int power = sc.nextInt();
		
		System.out.println("Enter the base");
		
		int base = sc.nextInt();

               int value = 1;


	        for (int i = 1; i <= power; i++ ) {

		 value *= base;

				}

		System.out.println("The value is " + value);
                                
		// closing the Scanner object
		sc.close();

	}

}
