
import java.util.Scanner;

public class CheckNumber {


       // declaring the check num..
	 
       public static void checkNo(int number) {
	
	  // condition check negative zero or negative or positive
	  
	  if (number > 0) {
	  System.out.println("No is positive");
	  }else if (number == 0){
	  System.out.println("No is zero");
	  }else {
	  System.out.println("negative");
	  }
	  
	  
	
	}
 
    // main method
	
    public static void main(String[] args) {
   
        // creating the scanner object
		
        Scanner sc = new Scanner(System.in);
		
		// taking input from the user
		
		System.out.println("Enter the value of number ");
		int number = sc.nextInt();
		
            
        checkNo( number);
		
		// closing the scanner object
		// sc.close();
		
    }
}
