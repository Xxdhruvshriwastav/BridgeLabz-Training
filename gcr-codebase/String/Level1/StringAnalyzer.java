 import java.util.Scanner;
public class StringAnalyzer {
  
  public static boolean compareTwoString(String text, String text2) {
    // The count is used to find the number of occurrences of the character
    int count = 0;
    for (int i = 0; i < text.length(); i++) {
        if (text.charAt(i) == text2.charAt(i)) {
            return true;
        }
	}
		  return false;
    }


	

 
  public static void main(String[] args) {
    // Take user input for Text and Character to check Occurrences
    Scanner sc = new Scanner(System.in);      
    System.out.print("Enter a 1 text: ");
    String text = sc.nextLine();
    System.out.print("Enter text");
    String text2 = sc.nextLine();

    boolean result = compareTwoString( text,  text2);
	
	if (result ){
		
		System.out.println("Both text are equal");
	}else {
		System.out.println("Both text are not equal");
		
	}
	
	sc.close();
  }
}
