import java.util.Scanner;

        public class AvgCalculation {

	public static void main(String[] args) {

		// creating the Scanner object

		Scanner sc = new Scanner(System.in);

		// Taking input from the user math subject marks

		System.out.println("Enter the Subject Math Subject Marks ");
		
		int mathMarks = sc.nextInt();
		
		
		
		// Taking input from the user physics subject marks

		System.out.println("Enter the Subject physics Subject Marks ");
		
		int physicsMarks = sc.nextInt();



		// Taking input from the user chemitry subject marks

		System.out.println("Enter the Subject chemistry Subject Marks ");
		
		int chemistryMarks = sc.nextInt();

		
      		int average =  ( mathMarks + physicsMarks + chemistryMarks )/3;


				 
		 if ( average > 80 ) {
		
		
		System.out.println("Level 4, Above, agency normalize standards ");

		
		} else if (average > 69 ){
		
		System.out.println("Level 3");
		 }  else if (average > 59 ){
		

		System.out.println("Level 2");

				    } else if (average > 49 ){
		

		System.out.println("Level 2");

				    } else  {
		

		System.out.println("Remedial standards");

				    }

				          
					     

		
                                
		// closing the Scanner object
		sc.close();

	}

}
