import java.util.Scanner;

public class CheckNaturalNoWithTwoResultForLoop {

	public static void main(String[] args) {

		// creating the Scanner object

		Scanner sc = new Scanner(System.in);

		// Taking input from the user

		System.out.println("Enter the no ");

		int n = sc.nextInt();

		int naturalNo = n * (n+1) / 2;

		int sum = 0;
           	             
		// calculating the sum using the loop
   
                for(int i= n; n >=1; n--) {

		sum+=n;

			}

		// check wether it is natural no or not

		if (sum == naturalNo ) {
		
                System.out.println("This is natural no  ");

		} else {
			
		System.out.println("This is not Natural no");

		}
		
		
		// closing the Scanner object
		sc.close();

	}

}
