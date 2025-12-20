import java.util.Scanner;

public class FindQuotentAndReminder {

	 
    
	
	// calculating the simple intrest
	
	public static void findQAR(double first, double second) {
	
	double quotent = first/second;

    double reminder = first%second;


    System.out.println("quotent is " + quotent + "and " + "reminder is" + reminder);	
	  
	
	}
 
    // main method
	
    public static void main(String[] args) {
   
        // creating the scanner object
		
        Scanner sc = new Scanner(System.in);
		
		// taking input from the user
		
		System.out.println("Enter the value of first num");
		double first = sc.nextDouble();
		System.out.println("Enter the value of second number");
		double second = sc.nextDouble();
		
            
		findQAR( first,  second);	
        
		
		// closing the scanner object
		 sc.close();
		
    }
}
