
import java.util.Scanner;

public class CheckSpring {


       // declaring the check num..
	 
       public static void checkSpring(int date, int month) {
	
	  // condition check negative zero or negative or positive
	  
	  if ((date > 20 || date < 32) && (month >= 3 && month <= 5)) {
	  
	  System.out.println("Yes, it is Spring Season");
	  
	  }else {
	  System.out.println("Oops, It is not Spring Season");
	  }
	  
	  
	
	}
 
    // main method
	
    public static void main(String[] args) {
   
        // creating the scanner object
		
        Scanner sc = new Scanner(System.in);
		
		// taking input from the user
		
		System.out.println("Enter the value of date ");
		int date = sc.nextInt();
		
        System.out.println("Enter the value of month ");
		int month = sc.nextInt();

		
        checkSpring(date, month);
		
		// closing the scanner object
		// sc.close();
		
    }
}
