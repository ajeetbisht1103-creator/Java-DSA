import java.util.Scanner;

/**
 * Problem: Check if a String is a Palindrome
 *
 * Description:
 * Check whether a given string is a palindrome using recursion.
 * A palindrome is a string that reads the same forwards and backwards.
 *
 * Example:
 * Input:
 * madam
 *
 * Output:
 * true
 *
 * Time Complexity : O(N)
 * Space Complexity: O(N)   // Recursive call stack
 */

public class CheckPalindrome {

    static boolean isPalindrome(int leftIndex, int rightIndex, String text) {

        // Base Case
        if (leftIndex >= rightIndex) {
            return true;
        }

        // Compare characters from both ends
        if (text.charAt(leftIndex) != text.charAt(rightIndex)) {
            return false;
        }

        // Recursive Call
        return isPalindrome(leftIndex + 1, rightIndex - 1, text);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.next().toLowerCase();

        boolean result = isPalindrome(0, input.length() - 1, input);

        System.out.println(result);

        scanner.close();
    }
}