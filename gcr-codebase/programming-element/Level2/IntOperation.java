      	        import java.util.Scanner;
	
		public class IntOperation {

		public static void main (String [] args ) {

		Scanner sc = new Scanner(System.in);
               
                // taking input from the user 
		
		
		System.out.println("Enter the value of a" );

		int a = sc.nextInt();
		
		System.out.println("Enter the value of b" );


		int b = sc.nextInt();
		
		System.out.println("Enter the value of c" );


		int c = sc.nextInt();


		// Arthematic operation

                int opr1 = a + b *c;
                int opr2 = a * b + c;
		int opr3 = c + a / b;

                // printing the values

                System.out.println("Operation 1 result is: " + opr1);
		System.out.println("Operation 2 result is: " + opr2);
		System.out.println("Operation 3 result is: " + opr3);

                // closing the scanner class 
                
                sc.close();

                

	}

}
