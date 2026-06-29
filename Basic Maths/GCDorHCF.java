/**
 * Problem: GCD (Greatest Common Divisor) / HCF (Highest Common Factor)
 *
 * Description:
 * Find the Greatest Common Divisor (GCD) of two numbers
 * by checking common factors from the largest to the smallest.
 *
 * Example:
 * Input:
 * 20 40
 *
 * Output:
 * 20
 *
 * Time Complexity : O(min(N, M))
 * Space Complexity: O(1)
 */

public class GCDorHCF {

    static int findGCD(int firstNumber, int secondNumber) {

        int gcd = 1;

        for (int divisor = Math.min(firstNumber, secondNumber); divisor >= 1; divisor--) {

            if (firstNumber % divisor == 0 && secondNumber % divisor == 0) {
                gcd = divisor;
                break;
            }
        }

        return gcd;
    }

    public static void main(String[] args) {

        int firstNumber = 20;
        int secondNumber = 40;

        System.out.println("GCD: " + findGCD(firstNumber, secondNumber));
    }
}