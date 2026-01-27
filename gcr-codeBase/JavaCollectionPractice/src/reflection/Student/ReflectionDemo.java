package reflection.Student;

public class ReflectionDemo {

    public static void main(String[] args) throws Exception {

        //  Load class dynamically and write pacakage name inside correctlly
    	
        Class<?> studentClass = Class.forName("annotations.Student.Student");

        //  Create object WITHOUT new keyword
        Object obj = studentClass.getDeclaredConstructor().newInstance();

        //  type cast
        Student student = (Student) obj;

        //  Call method
        student.show();
    }
}
