import java.util.Scanner;

public class SmallestNo {

	public static void main(String[] args) {

		// creating the Scanner object

		Scanner sc = new Scanner(System.in);

		// Taking input from the user

		System.out.println("Enter the no 1");

		int num1 = sc.nextInt();
		
		System.out.println("Enter the no 2");

		int num2 = sc.nextInt();


		System.out.println("Enter the no 3");

		int num3 = sc.nextInt();

		

		// cheking the smallest no 

		if ( num1 <= num2 && num1 <= num3 ) {

			System.out.println("Smallest no is number 1 ");

		} else if ( num2 <= num1 && num2 <= num3 ){

			System.out.println("smallest no is number 2");

		}
		
		else  {

		        System.out.println("smallest no is number 3");
		}
      
		// closing the Scanner object
		sc.close();

	}

}
