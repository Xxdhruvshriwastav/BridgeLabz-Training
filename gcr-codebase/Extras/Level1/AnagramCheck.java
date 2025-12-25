import java.util.Scanner;

public class AnagramCheck {

    // Method to check anagram
    // same length
    // same char but on different position ex-- triangle or integral
    public static boolean isAnagram(String s1, String s2) {

        if (s1.length() != s2.length()) {
            return false;
        }

        int[] freq = new int[256]; // ASCII characters

        for (int i = 0; i < s1.length(); i++) {
            freq[s1.charAt(i)]++;
            freq[s2.charAt(i)]--;
        }

        for (int i = 0; i < freq.length; i++) {
            if (freq[i] != 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = sc.next();

        System.out.print("Enter second string: ");
        String str2 = sc.next();

        if (isAnagram(str1, str2)) {
            System.out.println("Strings are Anagrams");
        } else {
            System.out.println("Strings are NOT Anagrams");
        }

        // Close the scanner object
        sc.close();
    }
}
