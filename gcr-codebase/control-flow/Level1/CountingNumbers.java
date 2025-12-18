import java.util.Scanner;

public class CountingNumbers {

	public static void main(String[] args) {

		// creating the Scanner object

		Scanner sc = new Scanner(System.in);

		// Taking input from the user

		System.out.println("Enter the Number");
		
		int n = sc.nextInt();
		
		int sum =0;

		if (n > 0 ) {
		
		while (n > 0 ) {
           
		sum = sum + n;

		n--;


		}

		System.out.println(sum);

		  }
			 else {

		System.out.println("You entered either negative, 0 or  special character");
					
		}
		
		
                
		// closing the Scanner object
		sc.close();

	}

}
