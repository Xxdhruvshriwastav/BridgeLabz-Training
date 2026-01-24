package Set.Subsets;

import java.util.HashSet;
import java.util.Set;

public class Subsets {

	public static void main(String[] args) {
		
		Set<Integer> set3 = new HashSet<>();
		
		set3.add(1);
		set3.add(2);
		set3.add(3);
		
		
		
		 Set<Integer> set4 = new HashSet<>();
			
			set4.add(1);
			set4.add(2);
			set4.add(4);
			set4.add(5);
		
		boolean subset = set4.containsAll(set3);
		
		
		
		if(subset) {
			System.out.println("yes, it is");
		} else {
			System.out.println("no, it's not");
		}
	}
}
