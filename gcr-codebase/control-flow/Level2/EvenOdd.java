import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {

		// creating the Scanner object

		Scanner sc = new Scanner(System.in);

		// Taking input from the user

		System.out.println("Enter the Number");
		
		int n = sc.nextInt();
		
	      // printing even no 

	      System.out.println("Printing Even no");

		
              for (int i = 2; i <= n; i++ ) {
               
               if (i % 2 == 0) {

		System.out.println(i);
			
		}
			}
  
                
 		// printing odd no 

		 System.out.println("Printing Odd no");

		for (int i = 2; i <= n; i++ ) {

		if (i % 2 != 0) {

		System.out.println(i);
			
		}
			}
		
		
	 	// closing the Scanner object
		sc.close();

	}

}
