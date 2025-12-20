import java.util.Scanner;

public class CalculateRound {


     // declaring the calculateSimpleIntrest
	 
    public static void calculateRound(int first, int second, int third) {
	
	int distance = 5;
	
	
	// calculating the perimeter
	
	  int perimeter = first + second + third;
	  
	// calculating the round  
	  int round = distance/perimeter;
	  
	  // printing the value of round
	  
	  System.out.println("It will take " + round + "round");
	
	}
 
    // main method
	
    public static void main(String[] args) {
   
        // creating the scanner object
		
        Scanner sc = new Scanner(System.in);
		
		// taking input from the user
		
		System.out.println("Enter the value of 1 side");
		int first = sc.nextInt();
		System.out.println("Enter the value of 2 side");
		int second = sc.nextInt();
		System.out.println("Enter the value of 3 side");
		int third = sc.nextInt();
            
        calculateRound(first, second, third);
		
		// closing the scanner object
		// sc.close();
		
    }
}
