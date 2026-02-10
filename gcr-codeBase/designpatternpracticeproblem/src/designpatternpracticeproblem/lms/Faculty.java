package designpatternpracticeproblem.lms;

public class Faculty implements  User{

	@Override
	public void update(String message) {
		System.out.println("Faculty: notified" + message);
		
	}

	@Override
	public void getRole() {
		System.out.println("Role: Faculty");
		
	}

}
