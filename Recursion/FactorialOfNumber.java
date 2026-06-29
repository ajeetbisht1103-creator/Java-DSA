/**
 * Problem: Factorial of a Given Number
 *
 * Description:
 * Calculate the factorial of a given number using recursion.
 *
 * Factorial:
 * n! = n × (n - 1) × (n - 2) × ... × 1
 *
 * Example:
 * Input:
 * n = 5
 *
 * Output:
 * 120
 *
 * Time Complexity : O(N)
 * Space Complexity: O(N)   // Recursive call stack
 */

public class FactorialOfNumber {

    static int factorial(int number) {

        // Base Case
        if (number == 0 || number == 1) {
            return 1;
        }

        // Recursive Call
        return number * factorial(number - 1);
    }

    public static void main(String[] args) {

        int number = 5;

        System.out.println("Factorial of " + number + " = " + factorial(number));
    }
}
