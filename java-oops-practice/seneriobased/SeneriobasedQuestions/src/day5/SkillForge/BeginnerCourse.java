package day5.SkillForge;



public class BeginnerCourse extends Course {

    public BeginnerCourse(String title, Instructor instructor) {
        super(title, instructor);
    }

    @Override
    public void generateCertificate(Student student) {
        System.out.println("Beginner Level Certificate awarded to "
                + student.getName());
    }
}
