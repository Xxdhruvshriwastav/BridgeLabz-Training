import java.util.Scanner;

public class CheckNaturalNoWithTwoResult {

	public static void main(String[] args) {

		// creating the Scanner object

		Scanner sc = new Scanner(System.in);

		// Taking input from the user

		System.out.println("Enter the no ");

		int n = sc.nextInt();

		int naturalNo = n * (n+1) / 2;
		
		System.out.println("Enter the natural no  ");

           	int num = sc.nextInt();


		// check wether it is natural no or not

		if (num == naturalNo ) {
		
                System.out.println("This is natural no  ");

		} else {
			
		System.out.println("This is not Natural no");

		}
		
		
		// closing the Scanner object
		sc.close();

	}

}
