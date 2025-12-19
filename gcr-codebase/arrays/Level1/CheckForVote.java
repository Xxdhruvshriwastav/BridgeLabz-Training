import java.util.Scanner;

        public class CheckForVote {

	public static void main(String[] args) {

		// creating the Scanner object

		Scanner sc = new Scanner(System.in);

		System.out.println(" Enter the size of an array ");
		
		int size = sc.nextInt();

		// Creating an array object
		
		 int[] arr = new int [size];

     		 for (int i = 0; i < size; i++) {
              
          	 System.out.println(" Enter the " + i + "th person age ");
             

		  arr[i] = sc.nextInt();

		 }
                 
		for (int j = 0; j < arr.length; j++) {

		if (arr[j] > 18) {

		System.out.println( j + "th person is eligible for vote ");
			
	
				}

						}
		 
		
		
		
		
                                
		// closing the Scanner object
		sc.close();

	}

}
