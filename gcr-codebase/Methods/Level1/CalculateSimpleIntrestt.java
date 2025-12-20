import java.util.Scanner;

public class CalculateSimpleIntrestt {


     // declaring the calculateSimpleIntrest
	 
    public static void calculateSI(int p, int r, int t) {
	
	// calculating the simple intrest
	
	  int calculateSimpleIntrest =  p * r * t  / 100;
	  
	  // printing the value of calculateSI
	  
	  System.out.println(calculateSimpleIntrest);
	
	}
 
    // main method
	
    public static void main(String[] args) {
   
        // creating the scanner object
		
        Scanner sc = new Scanner(System.in);
		
		// taking input from the user
		
		System.out.println("Enter the value of p");
		int p = sc.nextInt();
		System.out.println("Enter the value of r");
		int r = sc.nextInt();
		System.out.println("Enter the value of t");
		int t = sc.nextInt();
            
        calculateSI(p , r , t);
		
		// closing the scanner object
		// sc.close();
		
    }
}
