import java.util.Scanner;

public class FactorUsingWhileLoop {

	public static void main(String[] args) {

		// creating the Scanner object

		Scanner sc = new Scanner(System.in);

		// Taking input from the user

		System.out.println("Enter the Number");
		
		int number = sc.nextInt();
		
                int i = 1;
		
		// Caluculatinf the factorial

		while (number >= i) {

		if (number % i == 0) {

		System.out.println(i + " " + "is the factor of " + " " + number);
				} 				                  
                
		i++;
		
		}
                
		// closing the Scanner object
		sc.close();

	}

}
