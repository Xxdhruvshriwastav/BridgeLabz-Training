import java.util.*;

public class  Palindrome{

    // check plaindrome method
    public static boolean checkPalindrome (String s) {
	
	int start = 0;
	int end = s.length()-1;
	
	while (start < end ) {
	 
	
	if (s.charAt(start) != s.charAt(end)) {
	return false;
	
	     } 
	start++;
	end--;
	
	    }
	
	return true;
	}
    
   
     // main method

    public static void main (String args []) {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the text");
	String s = sc.nextLine();
	
	
    boolean result = checkPalindrome (s);
	
	if (result) {
	
	System.out.println("this is palindrone");
	}else {
	
	System.out.println("this is not  palindrone");
	}


   sc.close();
  }
}

