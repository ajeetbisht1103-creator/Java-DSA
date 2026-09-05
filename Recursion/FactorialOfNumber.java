/**
 * Problem: Factorial of a Given Number
 *
 * Description:
 * Calculate the factorial of a given number using recursion.
 * Returns -1 for negative inputs where factorial is undefined.
 *
 * Example:
 * Input:  n = 5
 * Output: 120
 *
 * Time Complexity : O(N)
 * Space Complexity: O(N) - Recursive call stack
 */

public class FactorialOfNumber {

    public static long factorial(int number) {
        // Factorial is undefined for negative integers
        if (number < 0) {
            return -1;
        }

        // Base Case
        if (number == 0 || number == 1) {
            return 1;
        }

        // Recursive Call
        return number * factorial(number - 1);
    }

    public static void main(String[] args) {
        int number = 5;

        long result = factorial(number);

        if (result == -1) {
            System.out.println("Factorial is undefined for negative numbers.");
        } else {
            System.out.println("Factorial of " + number + " = " + result);
        }
    }
}