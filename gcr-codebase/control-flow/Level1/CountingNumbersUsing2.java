import java.util.Scanner;

public class CountingNumbersUsing2 {

	public static void main(String[] args) {

		// creating the Scanner object

		Scanner sc = new Scanner(System.in);

		// Taking input from the user

				
		int sum =0;

		
		// Adding logic 


		while (true) {
                
		System.out.println("Enter the Number");
		
		int n = sc.nextInt();
         
                // If user add 0 or negative value program will be terminate

		if (n <= 0) {

		  break;
			
		     } else {
              
		sum = sum + n;
				}

		
           
		}
    
		System.out.println(sum);
		
		  
                
		// closing the Scanner object
		sc.close();

	}

}
