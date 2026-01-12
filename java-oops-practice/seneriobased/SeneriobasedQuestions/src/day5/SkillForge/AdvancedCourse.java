package day5.SkillForge;



public class AdvancedCourse extends Course {

    public AdvancedCourse(String title, Instructor instructor) {
        super(title, instructor);
    }

    @Override
    public void generateCertificate(Student student) {
        System.out.println("Advanced Professional Certificate awarded to "
                + student.getName());
    }
}
