import java.util.Scanner;

        public class TablePrint {

	public static void main(String[] args) {

		// creating the Scanner object

		Scanner sc = new Scanner(System.in);

		// Taking input from the user 
		
		System.out.println(" Enter the  Number  ");
		
		int num = sc.nextInt();


		// Initialing the table 

		

		for(int i =1; i <=10; i++  ){

		int table = num * i;

		System.out.println(table);

		
       
				}               
		
		
                                
		// closing the Scanner object
		sc.close();

	}

}
