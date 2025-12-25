public class TrimWithoutTrim {

    public static int[] findTrimIndexes(String s) {
        int start = 0, end = s.length() - 1;

        while (s.charAt(start) == ' ') // reach till the first character
            start++;
        while (s.charAt(end) == ' ') // reache till the last character
            end--;

        return new int[] { start, end };
    }

    public static String customSubstring(String s, int start, int end) {
        String result = "";
        for (int i = start; i <= end; i++) {
            result += s.charAt(i);
        }
        return result;
    }

    public static void main(String[] args) {

        String text = "   Hello World   ";

        int[] idx = findTrimIndexes(text);
        String customTrim = customSubstring(text, idx[0], idx[1]);
        String builtInTrim = text.trim();

        System.out.println("Custom Trim: [" + customTrim + "]");
        System.out.println("Built-in Trim Match: " + customTrim.equals(builtInTrim));
    }
}
