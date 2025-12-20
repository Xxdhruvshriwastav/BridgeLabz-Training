
import java.util.Scanner;

public class NaturalNo {


       // declaring the check sum of natural num..
	 
       public static void checkNaturalNum(int num) {
	
	  // condition check negative zero or negative or positive
	  
	  int sum = 0;
	  
	  for (int i = 1; i <= num; i++){
	  
	  sum += i;
	  }
	  
	  System.out.println("Sum of natural no of your number is" + sum);
	  
	  
	
	}
 
    // main method
	
    public static void main(String[] args) {
   
        // creating the scanner object
		
        Scanner sc = new Scanner(System.in);
		
		// taking input from the user
		
		System.out.println("Enter the value of number ");
		int num = sc.nextInt();
		
       

		
        checkNaturalNum( num);
		
		// closing the scanner object
		// sc.close();
		
    }
}
