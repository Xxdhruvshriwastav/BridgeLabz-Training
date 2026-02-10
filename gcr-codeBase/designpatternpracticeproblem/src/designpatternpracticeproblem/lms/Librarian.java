package designpatternpracticeproblem.lms;

public class Librarian implements User{

	@Override
	public void update(String message) {
		System.out.println("Librarian notified: " + message);
		
	}

	@Override
	public void getRole() {
		System.out.println("Role: Librarian");
		
	}

}
