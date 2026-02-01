package functionalinterface.lengthchecker;

import java.util.function.Function;
import java.util.function.Predicate;

public class LengthChecker {

	public static void main(String[] args) {
		
		int limit = 20;
		
		Function<String, Integer> lengthFunction
 = str -> str.length();	
		
 
 String message = "java function example";
 
 
 int length = lengthFunction.apply(message);
 System.out.println("Message" + message);
 System.out.println("Length" + " "+ length);
 
 if (length > limit) {
	System.out.println("Mesaage linit exceeds");
} else {
	System.out.println("Message within limit");
}
	}
}
