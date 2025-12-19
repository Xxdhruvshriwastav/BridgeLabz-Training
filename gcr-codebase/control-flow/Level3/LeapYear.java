import java.util.Scanner;

        public class LeapYear {

	public static void main(String[] args) {

		// creating the Scanner object

		Scanner sc = new Scanner(System.in);

		// Taking input from the user

		System.out.println("Enter the year");
		
		int Year = sc.nextInt();
		
		
		
		

				 
		 if ( Year % 4 == 0  ) {
		
		
		System.out.println("Yes, this is leap year");

		
		} else {

			// Printing the year is valid or not, Year >= 1582
		
	          System.out.println("Now you entered the wrong  year Sequence, it must be more than 1582"); 
							

					}
		
				          
					     

		
                                
		// closing the Scanner object
		sc.close();

	}

}
