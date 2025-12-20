import java.util.Scanner;

public class ChoclateDistributionAndremaining {

	 
    
	
	// calculating the simple intrest
	
	public static void ChoclateDAR(int numOfCho, int numOfStu) {
	
	// calculation of Distribution and remaing
	int distribution = numOfCho/numOfStu;
	int  remaining = numOfCho%numOfStu;


    System.out.println("distribution of choclate of each student   is " + distribution + "and " + "remaing choclate is" + remaining);	
	  
	
	}
 
    // main method
	
        public static void main(String[] args) {
   
        // creating the scanner object
		
        Scanner sc = new Scanner(System.in);
		
		// taking input from the user
		
		System.out.println("Enter the number of choclate");
		int numOfCho = sc.nextInt();
		System.out.println("Enter the number of Student");
		int numOfStu = sc.nextInt();
		
            
		ChoclateDAR( numOfCho,  numOfStu);
        
		
		// closing the scanner object
		 sc.close();
		
    }
}
