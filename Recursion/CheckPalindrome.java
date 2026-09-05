import java.util.Scanner;

/**
 * Problem: Check if a String is a Palindrome
 *
 * Description:
 * Check whether a given string is a palindrome using recursion.
 *
 * Example:
 * Input:  madam
 * Output: true
 *
 * Time Complexity : O(N)
 * Space Complexity: O(N) - Recursive call stack
 */

public class CheckPalindrome {

    // Public API entry point
    public static boolean isPalindrome(String text) {
        if (text == null) {
            return false;
        }
        return isPalindromeHelper(0, text.length() - 1, text);
    }

    // Recursive helper method
    private static boolean isPalindromeHelper(int leftIndex, int rightIndex, String text) {
        if (leftIndex >= rightIndex) {
            return true;
        }

        if (text.charAt(leftIndex) != text.charAt(rightIndex)) {
            return false;
        }

        return isPalindromeHelper(leftIndex + 1, rightIndex - 1, text);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (scanner.hasNextLine()) {
            String input = scanner.nextLine().trim().toLowerCase();
            System.out.println(isPalindrome(input));
        }

        scanner.close();
    }
}