import java.util.Scanner;

public class CharFrequencyNested {

    // Method to find frequency of characters using nested loops
    public static String[] charFrequency(String text) {
        char[] chars = text.toCharArray(); // Convert text to char array
        int n = chars.length;
        int[] freq = new int[n]; // Array to store frequency of each character

        // Nested loop to calculate frequency
        for (int i = 0; i < n; i++) {
            if (chars[i] == '0')
                continue; // Skip if already counted

            freq[i] = 1; // Initialize frequency

            for (int j = i + 1; j < n; j++) {
                if (chars[i] == chars[j]) {
                    freq[i]++;
                    chars[j] = '0'; // Mark duplicate as counted
                }
            }
        }

        // Count number of unique characters
        int uniqueCount = 0;
        for (int i = 0; i < n; i++) {
            if (chars[i] != '0')
                uniqueCount++;
        }

        // Create 1D String array to store characters and their frequencies
        String[] result = new String[uniqueCount];
        int index = 0;
        for (int i = 0; i < n; i++) {
            if (chars[i] != '0') {
                result[index] = chars[i] + " -> " + freq[i];
                index++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        String[] freqResult = charFrequency(text);

        System.out.println("Character frequencies:");
        for (String s : freqResult) {
            System.out.println(s);
        }

        sc.close();
    }
}
