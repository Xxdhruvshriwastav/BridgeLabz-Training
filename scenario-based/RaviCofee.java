import java.util.*;

public class  RaviCofee{

    // check plaindrome method
    public static int splitWithotSplit (String s, String [] coffee , int [] price) {
	
	while (true) {
	
	for (int i = 0; i < coffee.length; i ++) {
		
		if(s == coffee[i]) {
			return price[i];
			
		}
		
	}
	
	
		}
		
	}
	
	
	
	
	    
	
   
     // main method

    public static void main (String args []) {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the text");
	String s = sc.nextLine();
	
	String [] coffee = {"COFFEE", "CAFE", "ESPRESSO", "LATTE", "CAPPUCCINO", "MOCHA", "MACCHIATO"};
	int [] price = {120, 140, 200, 250, 300, 350};
	
    


   sc.close();
  }
}

