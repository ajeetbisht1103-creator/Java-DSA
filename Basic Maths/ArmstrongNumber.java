/**
 * Problem: Armstrong Number
 *
 * Description:
 * Check whether a given number is an Armstrong number.
 * An Armstrong number is equal to the sum of its digits
 * each raised to the power of the total number of digits.
 *
 * Example:
 * Input:  153
 * Output: Armstrong Number
 *
 * Time Complexity:  O(log10 N)
 * Space Complexity: O(1)
 */

public class ArmstrongNumber {

    public static boolean isArmstrong(int number) {
        if (number < 0) {
            return false;
        }

        int originalNumber = number;
        int sum = 0;

        // Calculate total digits mathematically without String conversion
        int digits = (number == 0) ? 1 : (int) Math.log10(number) + 1;

        while (number > 0) {
            int lastDigit = number % 10;
            sum += Math.pow(lastDigit, digits);
            number /= 10;
        }

        return originalNumber == sum;
    }

    public static void main(String[] args) {
        int number = 153;

        if (isArmstrong(number)) {
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not an Armstrong Number");
        }
    }
}