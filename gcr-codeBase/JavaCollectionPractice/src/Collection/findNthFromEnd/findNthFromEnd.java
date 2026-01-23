package Collection.findNthFromEnd;
import java.util.*;
public class findNthFromEnd {

	public static void main(String[] args) {
	

	       List<String> list = new LinkedList<>();

	        list.add("A");
	        list.add("B");
	        list.add("C");
	        list.add("D");
	        list.add("E");

	        int N = 2;
	
	        System.out.println(list);
	       
	        Iterator<String> fast = list.iterator();
	        Iterator<String> slow = list.iterator();

	        for (int i = 0; i < N; i++) fast.next();

	        while (fast.hasNext()) {
	            fast.next();
	            slow.next();
	        }

	        System.out.println("The value of" + " " + N + "position from last" + " " + slow.next());
	    }
	        
   }

