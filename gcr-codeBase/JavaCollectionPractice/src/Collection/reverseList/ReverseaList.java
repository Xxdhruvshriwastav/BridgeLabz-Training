package Collection.reverseList;
import java.util.*;

public class ReverseaList {

	public static void main(String[] args) {
		
		List<Integer> l = new ArrayList<>();
		
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		l.add(5);
		
		
		int start = 0;
        int end = l.size() - 1;
		
        while(start < end ) {
        	
        	int temp = l.get(start);
        	l.set(start, l.get(end));
        	l.set(end, temp);
        	
        	start ++;
        	end --;
        }
       
		System.out.println(l);
	}
	
}

