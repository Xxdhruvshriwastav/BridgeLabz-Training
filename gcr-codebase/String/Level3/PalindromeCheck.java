import java.util.Scanner;

public class PalindromeCheck {

    // Logic 1: Compare start and end
    public static boolean isPalindrome(String text) {
        int start = 0, end = text.length() - 1;
        while (start < end) {
            if (text.charAt(start) != text.charAt(end))
                return false;
            start++;
            end--;
        }
        return true;
    }
    

    // Logic 2: Recursive
    public static boolean isPalindromeRecursive(String text, int start, int end) {
        if (start >= end)
            return true;
        if (text.charAt(start) != text.charAt(end))
            return false;
        return isPalindromeRecursive(text, start + 1, end - 1);
    }

    // Logic 3: Reverse array
    public static boolean isPalindromeByReverse(String text) {
        int len = text.length();
        for (int i = 0; i < len / 2; i++) {
            if (text.charAt(i) != text.charAt(len - 1 - i))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        System.out.println("Palindrome check (Logic1): " + isPalindrome(text));
        System.out.println("Palindrome check (Logic2 Recursive): " + isPalindromeRecursive(text, 0, text.length() - 1));
        System.out.println("Palindrome check (Logic3 Reverse): " + isPalindromeByReverse(text));
        sc.close();
    }
}
