      	        import java.util.Scanner;
	
		public class DoubleOperation {

		public static void main (String [] args ) {

		Scanner sc = new Scanner(System.in);
               
                // taking input from the user 
		
		
		System.out.println("Enter the value of a" );

		double a = sc.nextDouble();
		
		System.out.println("Enter the value of b" );


		double b = sc.nextDouble();
		
		System.out.println("Enter the value of c" );


		double c = sc.nextDouble();


		// Arthematic operation

                double opr1 = a + b *c;
                double opr2 = a * b + c;
		double opr3 = c + a / b;

                // printing the values

                System.out.println("Operation 1 result is: " + opr1);
		System.out.println("Operation 2 result is: " + opr2);
		System.out.println("Operation 3 result is: " + opr3);

                // closing the scanner class 
                
                sc.close();


                

	}

}
