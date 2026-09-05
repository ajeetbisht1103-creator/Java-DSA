/**
 * Problem: Reverse a Number
 *
 * Description:
 * Reverse the digits of a given integer. Returns 0 if reversing causes integer overflow.
 *
 * Example:
 * Input:  1983
 * Output: 3891
 *
 * Time Complexity:  O(log10 N)
 * Space Complexity: O(1)
 */

public class ReverseNumber {

    public static int reverseNumber(int number) {
        long reversedNumber = 0;

        while (number != 0) {
            int lastDigit = number % 10;
            reversedNumber = (reversedNumber * 10) + lastDigit;
            number /= 10;
        }

        // Handle 32-bit signed integer overflow
        if (reversedNumber > Integer.MAX_VALUE || reversedNumber < Integer.MIN_VALUE) {
            return 0;
        }

        return (int) reversedNumber;
    }

    public static void main(String[] args) {
        int number = 1983;

        System.out.println("Reversed Number: " + reverseNumber(number));
    }
}