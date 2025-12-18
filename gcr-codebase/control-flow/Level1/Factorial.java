import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {

		// creating the Scanner object

		Scanner sc = new Scanner(System.in);

		// Taking input from the user

		System.out.println("Enter the Number");
		
		int n = sc.nextInt();
		
               int fact =1;
		
		// Caluculatinf the factorial

		for (int i = n; i >= 1; i--){

		     fact = fact * i;
		                        };

		
		// printing the value of factorial	
		System.out.println(fact);
                
		// closing the Scanner object
		sc.close();

	}

}
