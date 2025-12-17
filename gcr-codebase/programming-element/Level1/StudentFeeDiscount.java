import java.util.Scanner;


public class StudentFeeDiscount {

	public static void main (String [] args ) {

		// creating the scanner object  

		Scanner sc = new Scanner(System.in);

		// Taking the input from the user

		System.out.println("Enter the Fee  ");
		int fee = sc.nextInt();
		
		// Enter the discount 
		System.out.println("Enter the Discount ");
		int discount = sc.nextInt();
		
		// closing the scanner object
                sc.close();


		int disCountFee = fee/100 * discount;

                // displaying the output

		System.out.println(disCountFee); 

	}

}
