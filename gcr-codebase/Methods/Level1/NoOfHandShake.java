
import java.util.Scanner;

public class NoOfHandShake {


       // declaring the calculateSimpleIntrest
	 
       public static void combination(int number) {
	
	   // calculating the combination
	
	   int combination = (number * (number - 1)) / 2;
	  
	  // printing the value of combination
	  
	  System.out.println(combination);
	
	}
 
    // main method
	
    public static void main(String[] args) {
   
        // creating the scanner object
		
        Scanner sc = new Scanner(System.in);
		
		// taking input from the user
		
		System.out.println("Enter the value of number of students");
		int number = sc.nextInt();
		
            
        combination(number);
		
		// closing the scanner object
		// sc.close();
		
    }
}
