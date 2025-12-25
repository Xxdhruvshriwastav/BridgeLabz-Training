import java.util.*;

public class  ReverseStringg {

// To find reverse String Method

public static void reverseString( String s ){
  
   String str = "";
   
   for (int i = s.length()-1; i >= 0; i--) {
  
     str += s.charAt(i);
   
   }
   
   
   
   System.out.println(str);
   
   
   
   }
   
     // main method

    public static void main (String args []) {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the text");
	String s = sc.nextLine();
	
	
    reverseString(s);

  }
}

