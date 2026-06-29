/**
 * Problem: Check Palindrome Number
 *
 * Description:
 * Check whether a given number is a palindrome.
 * A palindrome number reads the same forwards and backwards.
 *
 * Example:
 * Input:
 * 121
 *
 * Output:
 * Palindrome
 *
 * Time Complexity : O(log₁₀N)
 * Space Complexity: O(1)
 */

public class CheckPalindromeNumber {

    static boolean isPalindrome(int number) {

        int originalNumber = number;
        int reversedNumber = 0;

        while (number > 0) {

            int lastDigit = number % 10;
            number /= 10;

            reversedNumber = (reversedNumber * 10) + lastDigit;
        }

        return originalNumber == reversedNumber;
    }

    public static void main(String[] args) {

        int number = 121;

        if (isPalindrome(number)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
    }
}