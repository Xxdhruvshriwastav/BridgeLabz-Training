    import java.util.Scanner;

	public class DistanceInYardAndMile{

	public static void main (String [] args ) {

	Scanner sc = new Scanner(System.in);
            
     // taking user input of distance in feet

     System.out.println("put the length in feet");

	// taking Input from the user

     int distance = sc.nextInt();

 	// Calculating Yard distance 

	double yardDistance = distance/3.0;
  
  		 
	// Calculating the miles distance 
     double mileDistance = distance/5280.0;
   
	// printing the Yard distance
		
	System.out.println(yardDistance);
		
	// printing the miles distance

    System.out.println(mileDistance);

	// closing the scanner object 
		sc.close();               

	}

}
