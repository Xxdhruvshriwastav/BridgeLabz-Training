import java.util.*;

public class LongestLength {

    // check plaindrome method
    public static int longestLengthOfSentence(String s) {

        String[] words = s.split(" ");

        int maxLength = 0;

        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > maxLength) {
                maxLength = words[i].length(); // check, like in first "this " words[i].length() = 4
            }
        }

        return maxLength;
    }

    // main method

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the text");

        String str = "This is the gretest country";

        int result = longestLengthOfSentence(str);

        System.out.println("The max length is " + result);

        sc.close();

    }
}
