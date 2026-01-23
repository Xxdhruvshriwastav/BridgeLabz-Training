package Set.SortedList;

import java.util.*;

public class SortedList {

	public static void main(String[] args) {
		
		Set<Integer> s = new HashSet<>();
		s.add(5);
		s.add(3);
		s.add(9);
		s.add(1);
		
		List<Integer> list = new ArrayList<>(s);
		Collections.sort(list);
		
	 System.out.println("the sorted form of sets is" + list);
	}
}
