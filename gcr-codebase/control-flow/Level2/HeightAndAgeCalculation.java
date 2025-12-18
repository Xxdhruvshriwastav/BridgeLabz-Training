import java.util.Scanner;

public class HeightAndAgeCalculation {

	public static void main(String[] args) {

		// creating the Scanner object

		Scanner sc = new Scanner(System.in);

		// Taking input from the user




                // amar details

		System.out.println("Enter the age of amar");
		
		int ageOfAmar = sc.nextInt();

		System.out.println("Enter the height of amar");
		
		int heightOfAmar = sc.nextInt();





                // Akbar details

		System.out.println("Enter the age of Akbar");
		
		int ageOfAkbar = sc.nextInt();

		System.out.println("Enter the height of Akbar");
		
		int heightOfAkbar = sc.nextInt();



 
	        

		// Anthony details

		System.out.println("Enter the age of Anthony ");
		
		int ageOfAnthony = sc.nextInt();

		System.out.println("Enter the height age of Anthony");
		
		int heightOfAnthony = sc.nextInt();



		
		
		// age calculation


		if (ageOfAmar < ageOfAkbar && ageOfAmar < ageOfAnthony ) {

		System.out.println("Amar is Youngest among all");
		
					}
		else if (ageOfAkbar < ageOfAmar && ageOfAkbar < ageOfAnthony ) {

                System.out.println("Akbar is Youngest among all");
						}
		else {
		System.out.println("Akbar is Youngest among all");
				}
		


		// height calculation

		if (heightOfAmar > heightOfAkbar && heightOfAmar > heightOfAnthony ) {

		System.out.println("Amar is Tallest among all");
		
					}
		else if (heightOfAkbar > heightOfAmar && heightOfAkbar > heightOfAnthony ) {

                System.out.println("Akbar is Tallest among all");
						}
		else {
		System.out.println("Anthony is Tallest among all");
				}

                
		
		                
		// closing the Scanner object
		sc.close();

	}

}
