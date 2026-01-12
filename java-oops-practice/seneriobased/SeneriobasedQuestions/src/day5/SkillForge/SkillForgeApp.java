package day5.SkillForge;

public class SkillForgeApp {

    public static void main(String[] args) {

        Instructor instructor = new Instructor("Rahul", "rahul@skillforge.com");
        Student student = new Student("Ashish", "ashish@gmail.com");

        Course javaCourse = new BeginnerCourse("Java Basics", instructor);
        Course designCourse = new AdvancedCourse("System Design", instructor);

        student.updateProgress(3, javaCourse.getTotalModules());

        if (student.getProgress() == 100) {
            javaCourse.generateCertificate(student);
            designCourse.generateCertificate(student);
        }
    }
}
