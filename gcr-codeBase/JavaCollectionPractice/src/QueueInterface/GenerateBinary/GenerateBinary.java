package QueueInterface.GenerateBinary;
import java.util.*;
public class GenerateBinary {
	
	public static void reverse(int n) {
		
		Queue<String> q = new LinkedList<>();
		 q.add("1");
		
		for(int i = 1; i <= n; i++) {
			
			String front = q.remove();
			
			System.out.println(front + " ");
			
			
			q.add(front + "0");
			q.add(front + "1");
			
		}
		
	}
	

	public static void main(String[] args) {
		
		int n = 7;
		
		reverse(n);
		
		
	}
}
