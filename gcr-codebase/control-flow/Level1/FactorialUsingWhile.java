import java.util.Scanner;

public class FactorialUsingWhile {

	public static void main(String[] args) {

		// creating the Scanner object

		Scanner sc = new Scanner(System.in);

		// Taking input from the user

		System.out.println("Enter the Number");
		
		int n = sc.nextInt();
		
               int fact =1;
		
		// Caluculatinf the factorial

		while (n >= 1) {

		     fact = fact * n;

		     n--;
		                        };

		
		// printing the value of factorial	
		System.out.println(fact);
                
		// closing the Scanner object
		sc.close();

	}

}
