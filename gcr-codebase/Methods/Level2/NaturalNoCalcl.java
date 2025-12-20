import java.util.Scanner;

public class NaturalNoCalcl {

   
    public static int naturalNum(int number) {
 
    
	// base condition
	
     if (number == 0) {
	 
	 return 0;
	 
	 }
    
	 return number + naturalNum( number - 1);
	

    }
	
	

    // main method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number");
		
        int number = sc.nextInt();

        int naturaNoSum = number*(number+1)/2;
		
		int value = naturalNum(number);
		
		System.out.println("Value of sum of natural no is " + value);
		
		
		if (naturaNoSum == value ) {
		
		System.out.println("this is correct ");
		
		}
		
		
		// Closing the scanner object

        sc.close();
    }
}
