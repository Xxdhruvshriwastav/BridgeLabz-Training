package ExamProctor;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ExamSession {

    // Stack to track navigation (last visited question)
    private Stack<Integer> navigationStack = new Stack<>();

    // Store answers: questionId → answer
    private Map<Integer, String> answerMap = new HashMap<>();

    // Store correct answers
    private Map<Integer, String> correctAnswerMap = new HashMap<>();

    // Add questions (setup)
    public void addQuestion(Question q) {
        correctAnswerMap.put(q.questionId, q.correctAnswer);
    }

    // Navigate to a question
    public void visitQuestion(int questionId) {
        navigationStack.push(questionId);
        System.out.println("Visited Question: " + questionId);
    }

    // Save answer
    public void submitAnswer(int questionId, String answer) {
        answerMap.put(questionId, answer);
        System.out.println("Answer saved for Q" + questionId);
    }

    // Go back to last visited question
    public void goBack() {
        if (navigationStack.isEmpty()) {
            System.out.println("No previous question");
            return;
        }
        int lastQuestion = navigationStack.pop();
        System.out.println("Returned from Question: " + lastQuestion);
    }

    // 🔥 Function to evaluate score
    public int evaluateScore() {
        int score = 0;

        for (int qId : correctAnswerMap.keySet()) {
            if (answerMap.containsKey(qId) &&
                answerMap.get(qId).equalsIgnoreCase(correctAnswerMap.get(qId))) {
                score++;
            }
        }
        return score;
    }
}

