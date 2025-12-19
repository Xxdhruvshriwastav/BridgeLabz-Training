import java.util.Scanner;

        public class MeanHeight {

	public static void main(String[] args) {

		// creating the Scanner object

		Scanner sc = new Scanner(System.in);

		System.out.println(" Enter the size of an array ");
		
		int size = sc.nextInt();

		// Creating an array object
		
		 int[] arr = new int [size];
		 
		 int totalHeight = 1;


            // Calculating the total height and also putting value in array
     		 for (int i = 0; i < size; i++) {
              
          	 System.out.println(" Enter the " + i + "th person height ");
             
		      arr[i] = sc.nextInt();
			  
			  totalHeight += arr[i];
			  

		 }
                 
	   // calculating mean
		int mean = totalHeight/ size;

		
        // printing value
		System.out.println(mean);
			
	

		
		
                                
		// closing the Scanner object
		sc.close();

	}

}
