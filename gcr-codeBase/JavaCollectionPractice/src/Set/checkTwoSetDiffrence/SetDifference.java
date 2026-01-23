package Set.checkTwoSetDiffrence;

import java.util.HashSet;
import java.util.Set;

public class SetDifference {

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
				
			//	union	
			Set<Integer> union = new HashSet<>(set3);
			union.addAll(set4);
			
			
			// intersection
			Set<Integer> intersection = new HashSet<>(set3);
			 intersection.retainAll(set4);
				
			 
			union.removeAll(intersection);
	
	
			System.out.println("The Diffrence is btw two sets " + union);
			
    }
	
}