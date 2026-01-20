package AddressBookSystem;

import java.util.ArrayList;
import java.util.Collections;



public class Main {

	public static void main(String[] args) {
		
		
		ArrayList<Contact> list = new ArrayList<>();
		
		list.add(new Contact("Ashish", "kumar", 6202201200L, "rudrashriwastav9939@gmail.com", "Gopalganj", "Bihjar", 841438));
		list.add(new Contact("Ravi", "kumar", 6208401200L, "ravi@gmail.com", "Bhopal", "MadhyaPradesh", 462022));
		list.add(new Contact("Shriyansh", "kumar", 7202201200L, "shriyansh@gmail.com", "MadhyaPradesh", "MP", 462024));
		list.add(new Contact("Ritesh", "kumar", 6202201288L, "ritesh@gmail.com", "Rewa", "Mp", 462021));
		list.add(new Contact("Vedansh", "kumar", 6207771200L, "vedansh@gmail.com", "Rewa", "MP", 822022));
		list.add(new Contact("Himesh", "kumar", 8202201200L, "himesh@gmail.com", "Rewa", "MP", 202226));
		
		
		
		
		
		Collections.sort(list, (a, b) -> 
		
		a.firstName.compareToIgnoreCase(b.firstName)
				);
		
		
		
		
		
         for(Contact r : list) {
			
        	 
		System.out.println("First Name is " + " " + r.firstName + " " + "contact no is " + " "+ r.phoneNumber + " " + r.phoneNumber +  " " + "the email id is " + " " +  r.email + " " + " " + "City is" + " " + r.city + " " + "The state is" + " " + r.state + " " + " The pin code no is" + " " + r.city );
		
		    }
         
         System.out.println(" ");
         
         list.get(0).firstName = "Dhruv"; // modify the name 
 
         
         for(Contact r : list) {
 			
 			System.out.println("First Name is " + " " + r.firstName + " " +  "contact no is " + " " + r.phoneNumber +  " " + "the email id is " + " " +  r.email + " " + " " + "City is" + " " + r.city + " " + "The state is" + " " + r.state + " " + " The pin code no is" + " " + r.city   );
 		}
		
		
         
         list.remove(0); // remove the first all detail 
         list.remove(1);  // confusion that i get al element shift left so  it will not delete as array after one will bedeleted
         list.remove(2);
         
         System.out.println(" ");
         
         for(Contact r : list) {
  			
  			System.out.println("First Name is " + " " + r.firstName + " " +  "contact no is " + " " + r.phoneNumber +  " " + "the email id is " + " " +  r.email + " " + " " + "City is" + " " + r.city + " " + "The state is" + " " + r.state + " " + " The pin code no is" + " " + r.city   );
  		}
 		
		
	}
	
	
}
