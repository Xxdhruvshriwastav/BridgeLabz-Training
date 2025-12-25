import java.util.Scanner;

public class MostFrequentCharacter {

    // Method to find most frequent character
    public static char findMostFrequentChar(String str) {
        char mostFrequent = str.charAt(0);
        int maxCount = 0;

        for (int i = 0; i < str.length(); i++) {
            int count = 0;

            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }

            if (count > maxCount) {
                maxCount = count;
                mostFrequent = str.charAt(i);
            }
        }
        return mostFrequent;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String input = sc.next();

        char result = findMostFrequentChar(input);

        System.out.println("Most Frequent Character: '" + result + "'");

        // Close the scanner object

        sc.close();
    }
}
