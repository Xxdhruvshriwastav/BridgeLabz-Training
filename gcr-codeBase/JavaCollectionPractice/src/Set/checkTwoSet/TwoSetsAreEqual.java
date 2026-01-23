package Set.checkTwoSet;
import java.util.*;

public class TwoSetsAreEqual {
public static void main(String[] args) {
	

	
	Set<Integer> set1 = new HashSet<>();
	
	set1.add(1);
	set1.add(2);
	set1.add(3);
	set1.add(4);
	
	
	Set<Integer> set2 = new HashSet<>();
	
	set2.add(1);
	set2.add(3);
	set2.add(2);
	set2.add(4);
	
	
	if( set1.size() != set2.size()) {
		
		System.out.println(false);
	}
	
	boolean changed = set1.addAll(set2);
	
	if(changed) {
		System.out.println(false);
	} else {
		System.out.println(true);
	}
	
   }
}