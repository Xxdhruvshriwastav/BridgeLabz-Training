import java.util.Scanner;

public class CharFrequency {

    // Method to find frequency of characters and return as 2D array
    public static String[][] charFrequency(String text) {
        int[] freq = new int[256]; // ASCII characters

        // Count frequency of each character
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            freq[ch]++;
        }

        // Count unique characters
        int uniqueCount = 0;
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) {
                uniqueCount++;
            }
        }

        // Create 2D array to store characters and their frequencies
        String[][] result = new String[uniqueCount][2];
        int index = 0;
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) {
                result[index][0] = String.valueOf((char) i);
                result[index][1] = String.valueOf(freq[i]);
                index++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        String[][] freq = charFrequency(text);

        System.out.println("Character frequencies:");
        for (int i = 0; i < freq.length; i++) {
            System.out.println(freq[i][0] + " -> " + freq[i][1]);
        }

        sc.close();
    }
}

