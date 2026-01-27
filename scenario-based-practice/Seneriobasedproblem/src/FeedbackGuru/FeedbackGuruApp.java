package FeedbackGuru;

public class FeedbackGuruApp {

    public static void main(String[] args) {

        FeedbackAnalyzer<String> serviceFeedback =
                new FeedbackAnalyzer<>();

        serviceFeedback.readFeedbackFiles("feedbacks");
        serviceFeedback.printSummary();
    }
}
