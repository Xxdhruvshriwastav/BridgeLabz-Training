package ExamProctor;

public class ExamProctorApp {

    public static void main(String[] args) {

        ExamSession exam = new ExamSession();

        // Setup questions
        exam.addQuestion(new Question(1, "A"));
        exam.addQuestion(new Question(2, "B"));
        exam.addQuestion(new Question(3, "C"));

        // Navigation
        exam.visitQuestion(1);
        exam.submitAnswer(1, "A");

        exam.visitQuestion(2);
        exam.submitAnswer(2, "C");

        exam.visitQuestion(3);
        exam.submitAnswer(3, "C");

        exam.goBack();   // stack operation

        // Auto evaluation
        int finalScore = exam.evaluateScore();
        System.out.println("Final Score = " + finalScore);
    }
}
