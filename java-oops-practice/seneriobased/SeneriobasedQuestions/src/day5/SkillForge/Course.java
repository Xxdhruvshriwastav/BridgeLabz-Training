package day5.SkillForge;


public class Course implements ICertifiable {

    private String title;
    private Instructor instructor;
    protected double rating;        // protected logic
    private String[] modules;

    // Constructor with default modules
    public Course(String title, Instructor instructor) {
        this.title = title;
        this.instructor = instructor;
        this.modules = new String[] { "Introduction", "Core Concepts", "Final Project" };
    }

    // Constructor with custom modules
    public Course(String title, Instructor instructor, String[] modules) {
        this.title = title;
        this.instructor = instructor;
        this.modules = modules;
    }

    // Encapsulated rating logic
    protected void updateRating(double newRating) {
        if (newRating >= 0 && newRating <= 5) {
            rating = (rating + newRating) / 2;
        }
    }

    // Read-only internal reviews
    public double getRating() {
        return rating;
    }

    public int getTotalModules() {
        return modules.length;
    }

    @Override
    public void generateCertificate(Student student) {
        System.out.println("Certificate issued to " + student.getName()
                + " for completing course: " + title);
    }
}

