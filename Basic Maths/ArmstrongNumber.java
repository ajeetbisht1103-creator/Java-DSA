/**
 * Problem: Armstrong Number
 *
 * Description:
 * Check whether a given number is an Armstrong number.
 * An Armstrong number is equal to the sum of its digits
 * each raised to the power of the total number of digits.
 *
 * Example:
 * Input:
 * 153
 *
 * Output:
 * Armstrong Number
 *
 * Time Complexity : O(log₁₀N)
 * Space Complexity: O(1)
 */

public class ArmstrongNumber {

    static boolean isArmstrong(int number) {

        int originalNumber = number;
        int sum = 0;

        int digits = String.valueOf(number).length();

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