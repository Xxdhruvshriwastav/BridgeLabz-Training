package day5.SkillForge;

public class Student extends User {

    private int progress; // percentage

    public Student(String name, String email) {
        super(name, email);
        this.progress = 0;
    }

    // Operators used for progress tracking
    public void updateProgress(int completed, int total) {
        progress = (completed * 100) / total;
    }

    public int getProgress() {
        return progress;
    }
}

