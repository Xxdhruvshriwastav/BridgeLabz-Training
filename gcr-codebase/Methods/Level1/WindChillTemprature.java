import java.util.Scanner;

public class WindChillTemprature {

	 
    
	
	// calculating the calculateWindChill
	
	 public static void  calculateWindChill(double temperature, double windSpeed)  {
	
	   double windChill = 35.74 + 0.6215 *temperature + (0.4275*temperature - 35.75) * Math.pow(windSpeed, 0.16);


    System.out.println("windChill is" + " " + windChill  );	
	  
	
	} // Math.Po
 
    // main method
	
        public static void main(String[] args) {
   
        // creating the scanner object
		
        Scanner sc = new Scanner(System.in);
		
		// taking input from the user
		
		System.out.println("Enter the number of temperature");
		double temperature = sc.nextDouble();
		System.out.println("Enter the number of windSpeed");
		double windSpeed = sc.nextDouble();
		
            
		calculateWindChill(temperature, windSpeed);
        
		
		// closing the scanner object
		 sc.close();
		
    }
}
