import java.util.Scanner;

        public class CheckForVote {

	public static void main(String[] args) {

		// creating the Scanner object

		Scanner sc = new Scanner(System.in);

		  

		// Creating an array object
		
		 double[] arr = new double [10];
		 
		 
		 // initializing the variables and assigning the values
		 
		 int i = 0;
         double sum = 0;
		 
		 
		 
		 
		 
		 
		// create a infite loop
		 
          while (true ) {
			  
			System.out.println(" Enter the number");
            double num = sc.nextDouble();			
			
			// check the no is greter or size is must be equal or less than i
			if ( num <= 0 || i >= arr.length) {
					
			break;
				
			} 
			
            arr[i] = num;

			i++;
			
			
					  
		  }
		  
		  
		for (int j =0; j < arr.length; j++ ) {
			
			sum += arr[j];
		}  
     		

		// calculating the sum  
        System.out.println(sum);		
		                            
		// closing the Scanner object
		sc.close();

	}

}
