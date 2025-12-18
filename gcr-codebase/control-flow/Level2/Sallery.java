import java.util.Scanner;

public class Sallery {

	public static void main(String[] args) {

		// creating the Scanner object

		Scanner sc = new Scanner(System.in);

		// Taking input from the user

		System.out.println("Enter the sallery");
		
		int sallery = sc.nextInt();

		System.out.println("Enter the year of service");


		int service = sc.nextInt();

		// calculating the hike value

                int hike = (sallery/100) * 5;



		if (service > 5) {

		sallery+= hike;

		System.out.println(sallery);

		}


	        		
	 	// closing the Scanner object
		sc.close();

	}

}
