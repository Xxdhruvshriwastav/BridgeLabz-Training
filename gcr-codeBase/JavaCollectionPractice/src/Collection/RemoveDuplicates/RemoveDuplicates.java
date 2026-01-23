package Collection.RemoveDuplicates;

import java.util.*;
public class RemoveDuplicates {

	public static void main(String[] args) {
		
		List<Integer> l = new ArrayList<>();
		l.add(3);
		l.add(1);
		l.add(2);
		l.add(2);
		l.add(3);
		l.add(4);
		l.add(3);
		
		System.out.println(l);
		
		Set<Integer> set = new LinkedHashSet<>(l);
		List<Integer> result = new ArrayList<>(set);
		
		System.out.println(result);
		
	}
}
