import java.util.Scanner;

public class GretestFactorUsingWhileLoop {

	public static void main(String[] args) {

		// creating the Scanner object

		Scanner sc = new Scanner(System.in);

		// Taking input from the user

		System.out.println("Enter the Number");
		
		int number = sc.nextInt();
		
		int greterInteger = 1;  

		int i = 1;  

		// Applying Conditional statment
		
		while (number > i) {
		
		if (number % i == 0) {
		
		greterInteger = i;
					}
		i++;

			}

			

		


		System.out.println(" The gretest factor is" + " " + greterInteger );
                                
		// closing the Scanner object

		sc.close();

	}

}
