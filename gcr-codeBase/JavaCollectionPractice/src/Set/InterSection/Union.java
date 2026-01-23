package Set.InterSection;

import java.util.HashSet;
import java.util.Set;

public class Union {

	public static void main(String[] args) {
		
		
Set<Integer> set3 = new HashSet<>();
		
		set3.add(1);
		set3.add(2);
		set3.add(3);
		set3.add(4);
		
		
		 Set<Integer> set4 = new HashSet<>();
			
			set4.add(2);
			set4.add(3);
			set4.add(6);
			set4.add(7);
		
			
			set3.addAll(set4);
			
			System.out.println("Union of two set is " + " " + set3);
	  }
	}

