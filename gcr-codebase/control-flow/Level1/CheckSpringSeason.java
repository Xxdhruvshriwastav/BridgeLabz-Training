import java.util.Scanner;

public class CheckSpringSeason {

	public static void main(String[] args) {

		// creating the Scanner object

		Scanner sc = new Scanner(System.in);

		// Taking input from the user

		System.out.println("Enter the date"); 

		int date = sc.nextInt();
		
		System.out.println("Enter the month");

		int month = sc.nextInt();


		// March 20 to June 20

		
		// cheking the Spring season

		if ( 20 < date && date <30 && 3 < month && month <=5  ) {

			System.out.println("Spring Season ");

		} 
		
		else  {

		        System.out.println("Not Spring Season");
		}
      

		// closing the Scanner object
		sc.close();

	}

}
