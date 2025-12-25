import java.util.Scanner;

public class SplitWithoutSplit {

    public static String[] splitWords(String text) {

        // count spaces to determine number of words

        int wordCount = 1;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ')
                wordCount++;
        }

        int[] spaceIndex = new int[wordCount - 1];
        int idx = 0;

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ')
                spaceIndex[idx++] = i; // give the index of space, on which position space are there
                                       // like i love java => space at index 1 and 6 [1, 6]
        }

        String[] words = new String[wordCount];
        int start = 0;

        for (int i = 0; i < spaceIndex.length; i++) {
            words[i] = text.substring(start, spaceIndex[i]);
            start = spaceIndex[i] + 1;
        }

        words[wordCount - 1] = text.substring(start);
        return words;
    }

    public static boolean compareArrays(String[] a, String[] b) {
        if (a.length != b.length)
            return false;

        for (int i = 0; i < a.length; i++) {
            if (!a[i].equals(b[i]))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String[] custom = splitWords(text);
        String[] builtIn = text.split(" ");

        System.out.println("Arrays Match: " + compareArrays(custom, builtIn));
        sc.close();
    }
}

