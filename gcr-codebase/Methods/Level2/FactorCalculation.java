import java.util.Scanner;

public class FactorCalculation {

   
    public static int[] factorCalculation(int number) {

     // intialoize
	   int count = 0;
	   
	   // calculate size of an array
	    
		for (int j = 1; j <= number; j++ ){
	   
	    if (number % j ==0) {
		 
		 count++;
		
		}
	   
	   }
	
	// intialize the array 
	
	int[] result = new int[count];
		
		
		// find the factor and put in array indexes
        
	   int index = 0;
	   
       for (int i = 1; i <= number; i++ ){
	   
	    if (number % i ==0 ) {
		 // store results in array
		  result [index] = i;
		 index++;
		
		}
	   
	   }

        // store results in array
        

        return result;
    }
      
	  
	 // for factor sum 
	  
	 public static int sumFactor(int [] result ) {
		 
		int sum = 0;

	    for (int i = 0; i< result.length; i++) {
			
			sum += result[i];
			
		}
		 
		return sum;
		 
	 }
	 
	 // for product factor 
	 
	 public static int  productFactor(int [] result ) {
		 
		int product = 1;

	    for (int i = 0; i< result.length; i++) {
			
			product *= result[i];
			
		}
		 
		return product;
		 
	 } 
	  
	    // for Square sum
	  
	 public static double squareSum(int [] result ) {
		 
		int sumSquare = 0;

	    for (int i = 0; i< result.length; i++) {
			
			sumSquare += Math.pow(result[i], 2);
			
		}
		 
		return sumSquare;
		 
	 } 
	 
	 
	 
    // main method
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the number");
    int number = sc.nextInt();

    int[] values = factorCalculation(number);

    System.out.println("Factors are:");
    for (int i = 0; i < values.length; i++) {
        System.out.print(values[i] + " ");
    }

    System.out.println("\nSum of factors = " + sumFactor(values));
    System.out.println("Product of factors = " + productFactor(values));
    System.out.println("Sum of squares of factors = " + squareSum(values));

    sc.close();
}

}
