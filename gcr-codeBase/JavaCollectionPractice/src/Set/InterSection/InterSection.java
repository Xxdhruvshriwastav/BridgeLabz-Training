package Set.InterSection;
import java.util.*;

public class InterSection {

	public static void main(String[] args) {
		
		Set<Integer> set1 = new HashSet<>();
		
		set1.add(1);
		set1.add(2);
		set1.add(3);
		set1.add(4);
		
		
		
         Set<Integer> set2 = new HashSet<>();
		
		set2.add(2);
		set2.add(3);
		set2.add(6);
		set2.add(7);
		
		Set<Integer> intersection = new HashSet<>(set1);
		
		intersection.retainAll(set2);
		System.out.println(intersection);
		
//		for (Integer x : set1) {
//		    if (set2.contains(x)) {
//		        intersection.add(x);
//		    }
//		}
		
		
   }
}