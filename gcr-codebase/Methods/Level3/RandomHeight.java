import java.util.Random;

public class RandomHeight {
	
// method to calculate mean 	

// main method
public static void main(String [] args ) {
int [] height = new int [11];
Random ran = new Random();   // create an object to call methods

 for (int i = 0; i <height.length; i++) {
 // creating random num 
 height[i] = ran.nextInt(101) + 150; // Generate heights between 150–250 cm
 
 System.out.println(height[i]);
 
 }

}

}