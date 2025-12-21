import java.util.Scanner;

public class FindGretestAndSamllest {


     // declaring the calculateSimpleIntrest
	 
    {
	
	// calculating the simple intrest
	
	public static void findSAG(int first, int second, int third) {
	
	 if (first > second && first > third) {
	  System.out.println(first + " is the gretest number");
	 
	 }else if (second > first && second > third) {
	  System.out.println(second + " is the gretest number");
	 
	 } else {
	 
	 System.out.println(third + " is the gretest number");
	 
	 }
	 
	 
	 if (first < second && first < third) {
	  System.out.println(first + " is the smallest number");
	 
	 }else if (second < first && second < third) {
	  System.out.println(second + " is the smallest number");
	 
	 } else {
	 
	 System.out.println(third + " is the smallest number");
	 
	 }
	 
	 
	 
	  
	
	}
 
    // main method
	
    public static void main(String[] args) {
   
        // creating the scanner object
		
        Scanner sc = new Scanner(System.in);
		
		// taking input from the user
		
		System.out.println("Enter the value of first num");
		int first = sc.nextInt();
		System.out.println("Enter the value of second number");
		int second = sc.nextInt();
		System.out.println("Enter the value of third number");
		int third = sc.nextInt();
            
		findSmallestAndLargest( first,  second,  third);	
        
		
		// closing the scanner object
		// sc.close();
		
    }
}
