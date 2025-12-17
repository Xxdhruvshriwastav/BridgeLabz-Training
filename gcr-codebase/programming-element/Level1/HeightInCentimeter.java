        public class HeightInCentimeter {

	public static void main (String [] args ) {

		// Assigning the value of the variable  
		int feet = 5;
		int inches = 10;

 		// calculating the height in inches note it 1 foot = 12 inches and 1 inch = 2.54 cm

		double heightINCentimeter = (feet * 12 + inches) * 2.54;
                
        // printing the values 	

		System.out.println("Height in cm = " + heightINCentimeter); 

	}

}
