package FeedbackGuru;

import java.io.*;
import java.util.*;
import java.util.regex.*;

public class FeedbackAnalyzer<T> {

    private static final Pattern RATING_PATTERN =
            Pattern.compile("(\\d{1,2})/10");

    private Map<FeedbackCategory, List<T>> categorizedFeedback =
            new EnumMap<>(FeedbackCategory.class);

    public FeedbackAnalyzer() {
        for (FeedbackCategory category : FeedbackCategory.values()) {
            categorizedFeedback.put(category, new ArrayList<>());
        }
    }

    public void readFeedbackFiles(String folderPath) {
        File folder = new File(folderPath);
        File[] files = folder.listFiles((d, name) -> name.endsWith(".txt"));

        if (files == null) {
            System.out.println("No feedback files found.");
            return;
        }

        for (File file : files) {
            processFile(file);
        }
    }

    private void processFile(File file) {
        try (BufferedReader br =
                     new BufferedReader(new FileReader(file))) {

            String line;
            while ((line = br.readLine()) != null) {
                try {
                    processLine(line);
                } catch (Exception e) {
                    System.out.println("Invalid feedback skipped: " + line);
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + file.getName());
        }
    }

    @SuppressWarnings("unchecked")
    private void processLine(String line) {
        Matcher matcher = RATING_PATTERN.matcher(line);

        if (!matcher.find()) {
            throw new IllegalArgumentException("Rating not found");
        }

        int rating = Integer.parseInt(matcher.group(1));
        FeedbackCategory category = categorize(rating);

        categorizedFeedback.get(category).add((T) line);
    }

    private FeedbackCategory categorize(int rating) {
        if (rating >= 8) return FeedbackCategory.POSITIVE;
        if (rating >= 5) return FeedbackCategory.NEUTRAL;
        return FeedbackCategory.NEGATIVE;
    }

    public void printSummary() {
        System.out.println("\n=== Feedback Summary ===");
        categorizedFeedback.forEach((category, feedbacks) -> {
            System.out.println(category + " (" + feedbacks.size() + "):");
            feedbacks.forEach(f -> System.out.println(" - " + f));
        });
    }
}
