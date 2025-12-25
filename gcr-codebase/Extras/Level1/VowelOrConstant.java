import java.util.*;

public class  VowelOrConstant {

public static void countVowelAndConstant( String s ){
  
   int vowel = 0;
   int consonant = 0;
   
   for (int i = 0; i < s.length(); i++) {
	   
  
   if (s.charAt(i) == 'a' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u' || s.charAt(i) == 'e' ) {
   
   vowel++;
   
   } else {
   
   consonant++;
   
      }
   }
   
   
   System.out.println("the no of vowel is \t " +  vowel);
   System.out.println("the no of vowel is \t " +  consonant);
   
   
   
   }
   
 

public static void main (String args []) {
	
	Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        countVowelAndConstant(s);

  }
}

