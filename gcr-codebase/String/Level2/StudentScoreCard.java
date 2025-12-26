public class StudentScoreCard {

    // Method to generate random 2-digit PCM scores
    public static int[][] generatePCMScores(int students) {

        int[][] pcm = new int[students][3];

        for (int i = 0; i < students; i++) {
            pcm[i][0] = (int) (Math.random() * 90) + 10; // Physics
            pcm[i][1] = (int) (Math.random() * 90) + 10; // Chemistry
            pcm[i][2] = (int) (Math.random() * 90) + 10; // Maths
        }
        return pcm;
    }

    
    
    
    // Method to calculate total, average, percentage
    public static double[][] calculateScores(int[][] pcm) {

        double[][] result = new double[pcm.length][3];

        for (int i = 0; i < pcm.length; i++) {

            int total = pcm[i][0] + pcm[i][1] + pcm[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;

            // Round to 2 decimal places
            average = Math.round(average * 100.0) / 100.0;
            percentage = Math.round(percentage * 100.0) / 100.0;

            result[i][0] = total;
            result[i][1] = average;
            result[i][2] = percentage;
        }
        return result;
    }

    // Method to calculate grades based on percentage
    public static String[] calculateGrades(double[][] scoreData) {

        String[] grades = new String[scoreData.length];

        for (int i = 0; i < scoreData.length; i++) {

            double percent = scoreData[i][2];

            if (percent >= 80)
                grades[i] = "A";
            else if (percent >= 70)
                grades[i] = "B";
            else if (percent >= 60)
                grades[i] = "C";
            else if (percent >= 50)
                grades[i] = "D";
            else if (percent >= 40)
                grades[i] = "E";
            else
                grades[i] = "R";
        }
        return grades;
    }

    // Method to display scorecard
    public static void displayScoreCard(int[][] pcm,
            double[][] scores,
            String[] grades) {

        System.out.println("\n================ STUDENT SCORECARD ================");
        System.out.println("Stu\tPhy\tChem\tMath\tTotal\tAvg\t%\tGrade");

        for (int i = 0; i < pcm.length; i++) {
            System.out.printf("%d\t%d\t%d\t%d\t%.0f\t%.2f\t%.2f\t%s%n",
                    (i + 1),
                    pcm[i][0],
                    pcm[i][1],
                    pcm[i][2],
                    scores[i][0],
                    scores[i][1],
                    scores[i][2],
                    grades[i]);
        }
    }

    // Main Method
    public static void main(String[] args) {

        int students = 5; // You can change number of students

        int[][] pcmScores = generatePCMScores(students);
        double[][] calculatedScores = calculateScores(pcmScores);
        String[] grades = calculateGrades(calculatedScores);

        displayScoreCard(pcmScores, calculatedScores, grades);
    }
}
