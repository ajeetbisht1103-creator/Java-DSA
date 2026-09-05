/**
 * Problem: Count Digits
 *
 * Description:
 * Count the total number of digits present in a given integer.
 *
 * Example:
 * Input:  12345
 * Output: 5
 *
 * Time Complexity:  O(log10 N)
 * Space Complexity: O(1)
 */

public class CountDigits {

    public static int countDigits(int number) {
        if (number == 0) {
            return 1;
        }

        // Handle negative numbers safely
        number = Math.abs(number);

        int digitCount = 0;

        while (number > 0) {
            digitCount++;
            number /= 10;
        }

        return digitCount;
    }

    public static void main(String[] args) {
        int number = 12345;

        System.out.println("Number of digits: " + countDigits(number));
    }
}