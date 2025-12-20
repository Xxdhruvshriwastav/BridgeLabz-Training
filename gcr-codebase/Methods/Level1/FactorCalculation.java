import java.util.Scanner;

public class FactorCalculation {

   
    public static int[] factorCalculation(int number) {



    int[] result = new int[number];
	
       int idx = 0;
	   
       for (int i = 1; i <= number; i++ ){
	   
	    if (number % i ==0) {
		 // store results in array
		 int [result] = i;
		 idx++;
		
		}
	   
	   }

        // store results in array
        

        return result;
    }

    // main method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number");
		
        int number = sc.nextInt();

        int [] values = factorCalculation(number);

        for (int i = 0; i < values.length; i++ ) {
			
			System.out.println(values[i] + "  ");
			
		}
		
		
		// Closing the scanner object

        sc.close();
    }
}
