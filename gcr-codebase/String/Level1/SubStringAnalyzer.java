 import java.util.*;
public class SubStringAnalyzer {
  
    public static String subString( String text, int start, int end) {
  
     String result = "";
    String[] str = new String[text.length()];
    for (int i = start; i < end ; i ++) {
        
         result += text.charAt(i);		
		
        }
		
		
		return result;
  }

    public static boolean compareTwoString(String s1, String s2) {

    // Step 1: Check length first
    if (s1.length() != s2.length()) {
        return false;
    }

    // Step 2: Compare characters safely
    for (int i = 0; i < s1.length(); i++) {
        if (s1.charAt(i) != s2.charAt(i)) {
            return false;
        }
    }

    return true;
}

   
   

 
  public static void main(String[] args) {
    // Take user input for Text and Character to check Occurrences
    Scanner sc = new Scanner(System.in);      
    System.out.print("Enter a 1 text: ");
    String text = sc.nextLine();
	
	System.out.print("Enter the 2 text: ");
    String text2 = sc.nextLine();
    
	System.out.print("Enter start index: ");
    int start = sc.nextInt();

    System.out.print("Enter end index: ");
    int end = sc.nextInt();


    boolean checkk = compareTwoString( text,  text2);
	
	String str = subString( text, start, end);
	System.out.print(str);
	
	// this is built in method
	
	String builtInSubstring = text.substring(start, end);
	System.out.print(builtInSubstring);
	
	
	if (checkk ){
		
		System.out.println("Both text are equal");
	}else {
		System.out.println("Both text are not equal");
		
	}
	
	sc.close();
  }
}
