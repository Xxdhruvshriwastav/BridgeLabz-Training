      	        import java.util.Scanner;
	
		public class Handshake {

		public static void main (String [] args ) {

		Scanner sc = new Scanner(System.in);
               
                System.out.println("Enter the no of students");  

                

                // n = no of students

                int n = sc.nextInt(); 
		
		int totalNoOfHandShake = (n * (n - 1)) / 2;

                // printing the total no of handshake combination
                System.out.println("total no of handshake combination" + totalNoOfHandShake ); 

                // closing the scanner class 
                
                sc.close();

                

	}

}
