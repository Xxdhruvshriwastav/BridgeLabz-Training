package Collection.FindFrequency;

import java.util.*;

public class FindFrequency {
	
	public static void main(String[] args) {
		
	

	String [] arr = {"apple", "banana",  "apple", "orange"};
	
	Map<String, Integer> m1 = new HashMap<>();
	
	
     for(String name : arr) {
    	 m1.put(name, m1.getOrDefault(name, 0) +1);
    	 
     }

     for (Map.Entry<String, Integer> entry : m1.entrySet()) {
         System.out.println(entry.getKey() + " = " + entry.getValue());
     }
  }

}
