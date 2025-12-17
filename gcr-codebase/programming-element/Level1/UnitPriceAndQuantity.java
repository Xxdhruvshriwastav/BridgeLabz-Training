        import java.util.Scanner;

	public class UnitPriceAndQuantity {

	public static void main (String [] args ) {

		//Using Scanner class
             
 		Scanner sc = new Scanner(System.in);
		
 		// Taking input from the user 
		
		System.out.println("Enter the unit price of an item");

		int unitItem = sc.nextInt();
		
		// taking input from user of quantity of an item

                System.out.println("Enter the quantity of an item");

		int quantity = sc.nextInt();

		int totalPurchasePrice = unitItem * quantity;

                // printing the value of the total purchase price of the item
		
		System.out.println("Total purchase price of an item is: " + totalPurchasePrice); 
	
		// closing the scanner object 
		sc.close(); 
                

                

	}

}
