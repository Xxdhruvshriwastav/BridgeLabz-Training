import java.util.Scanner;

public class FirstNonRepeatingCharacter {

    public static char firstNonRepeatingChar(String text) {
        int[] freq = new int[256]; // ASCII frequency

        for (int i = 0; i < text.length(); i++) {
            freq[text.charAt(i)]++;
        }

        for (int i = 0; i < text.length(); i++) {
            if (freq[text.charAt(i)] == 1)
                return text.charAt(i);
        }
        return '\0'; // None
    }

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        char result = firstNonRepeatingChar(text);
        System.out.println("First non-repeating character: " + (result == '\0' ? "None" : result));
        sc.close();
    }
}
