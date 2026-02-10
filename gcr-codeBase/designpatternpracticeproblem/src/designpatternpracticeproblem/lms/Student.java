package designpatternpracticeproblem.lms;

public class Student implements User
{

	@Override
	public void update(String message) {
		System.out.println("Student notified:" + message);
		
	}

	@Override
	public void getRole() {
		System.out.println("Role: Student");
		
	}

}
