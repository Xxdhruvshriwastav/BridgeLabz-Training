import java.util.Scanner;

        public class LeapYearSingleCondition {

	public static void main(String[] args) {

		// creating the Scanner object

		Scanner sc = new Scanner(System.in);

		// Taking input from the user

		System.out.println("Enter the year");
		
		int Year = sc.nextInt();
		
		
		
		

				 
		 if ( Year % 4 == 0 && Year > 1582 ) {
		
		
		System.out.println("Yes, this is leap year");

		
		} else {
		
		System.out.println("This is not leap year");

				}	
				          
					     

		
                                
		// closing the Scanner object
		sc.close();

	}

}
