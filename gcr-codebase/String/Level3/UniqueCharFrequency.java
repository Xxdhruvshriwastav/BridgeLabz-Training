import java.util.Scanner;

public class UniqueCharFrequency {

    // Method to find unique characters in a string using charAt() and nested loops
    public static char[] uniqueCharacters(String text) {
        int n = text.length();
        char[] temp = new char[n];
        int count = 0;

        for (int i = 0; i < n; i++) {
            char ch = text.charAt(i);
            boolean isUnique = true;

            // Check if character already exists in temp array
            for (int j = 0; j < count; j++) {
                if (temp[j] == ch) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                temp[count] = ch;
                count++;
            }
        }

        // Copy only the unique characters into final array
        char[] unique = new char[count];
        for (int i = 0; i < count; i++) {
            unique[i] = temp[i];
        }

        return unique;
    }

    // Method to find frequency of characters using ASCII array and return 2D array
    public static String[][] charFrequency(String text) {
        int[] freq = new int[256]; // Frequency array for ASCII characters

        // Count frequency of each character
        for (int i = 0; i < text.length(); i++) {
            freq[text.charAt(i)]++;
        }

        // Get unique characters using the uniqueCharacters() method
        char[] unique = uniqueCharacters(text);

        // Create 2D array to store characters and their frequencies
        String[][] result = new String[unique.length][2];
        for (int i = 0; i < unique.length; i++) {
            result[i][0] = String.valueOf(unique[i]);
            result[i][1] = String.valueOf(freq[unique[i]]);
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
