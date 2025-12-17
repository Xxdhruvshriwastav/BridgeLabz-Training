        import java.util.Scanner;

	public class PerimeterOfSquare2{

	public static void main (String [] args ) {

		Scanner sc = new Scanner(System.in);

		// taking Input from the user
                int perimeterOfSquare = sc.nextInt();

 		// Athematic operation 

		int side = perimeterOfSquare/4;

                // printing the perimeterOfSquare
		
		System.out.println("length of Square is  " + side);

		// closing the scanner object 
		sc.close(); 
                

                

	}

}
