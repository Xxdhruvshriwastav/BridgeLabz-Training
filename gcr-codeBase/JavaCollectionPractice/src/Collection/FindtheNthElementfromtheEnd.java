package Collection;
import java.util.*;

public class FindtheNthElementfromtheEnd {

	public static void main(String[] args) {
		int pos = 2;
		
		List<String> l = new LinkedList<>();
		l.add("A");
		l.add("B");
		l.add("C");
		l.add("D");
		l.add("E");
		
		System.out.println(l);
		
		Iterator<String> fast = l.iterator();
		Iterator<String> slow = l.iterator();
		
		
		for(int i = 0; i < pos; i++) fast.next();
		
		while(fast.hasNext()) {
			fast.next();
			slow.next();
		}
		
	System.out.println("The num from prev position is " + slow.next() );
		
	}
}
