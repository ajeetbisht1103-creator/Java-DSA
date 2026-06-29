/**
 * Problem: Reverse a Number
 *
 * Description:
 * Reverse the digits of a given integer.
 *
 * Example:
 * Input:
 * 1983
 *
 * Output:
 * 3891
 *
 * Time Complexity : O(log₁₀N)
 * Space Complexity: O(1)
 */

public class ReverseNumber {

    static int reverseNumber(int number) {

        int reversedNumber = 0;

        while (number > 0) {

            int lastDigit = number % 10;
            number /= 10;

            reversedNumber = (reversedNumber * 10) + lastDigit;
        }

        return reversedNumber;
    }

    public static void main(String[] args) {

        int number = 1983;

        System.out.println("Reversed Number: " + reverseNumber(number));
    }
}