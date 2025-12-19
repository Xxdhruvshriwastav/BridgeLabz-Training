import java.util.Scanner;

        public class TablePrint6To9 {

	public static void main(String[] args) {

		// creating the Scanner object

		Scanner sc = new Scanner(System.in);

		// Taking input from the user 
		
		System.out.println(" Enter the  Number  ");
		
		int num = sc.nextInt();


		// Initialing the table 

		if (num >= 6 && 9 >= num) {

		for(int i =1; i <=10; i++  ){

		int table = num * i;

		System.out.println(table);

		
       
				}           

		}				
		
		
                                
		// closing the Scanner object
		sc.close();

	}

}
