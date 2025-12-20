import java.util.Scanner;

public class Leapyear {

   
    public static void leapYearr(int year) {

    if (year > 1582) {

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("This is a Leap Year");
        } else {
            System.out.println("This is NOT a Leap Year");
        }

    } else {
        System.out.println("Year should be greater than 1582");
    }
}

	  
	
	

    // main method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the year");
		
        int year = sc.nextInt();

        leapYearr(year);
		
		
		
		
		// Closing the scanner object

        sc.close();
    }
}
