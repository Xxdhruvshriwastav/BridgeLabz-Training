package designpatternpracticeproblem.lms;

public class UserFactory {

	public static User createUser(String type) {
		
		

	        if (type.equalsIgnoreCase("Student"))
	            return new Student();

	        if (type.equalsIgnoreCase("Faculty"))
	            return new Faculty();

	         if (type.equalsIgnoreCase("Librarian"))
	            return new Librarian();

	        return null;
	    }
		
	
	
}
