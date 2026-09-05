/**
 * Problem: Fibonacci Number
 *
 * Description:
 * Find the nth Fibonacci number using recursion.
 *
 * Example:
 * Input:  n = 6
 * Output: 8
 *
 * Time Complexity : O(2^N)
 * Space Complexity: O(N) - Recursive call stack
 */

public class FibonacciNumber {

    public static int fibonacci(int number) {
        // Guard against negative inputs
        if (number < 0) {
            return -1;
        }

        // Base Case
        if (number <= 1) {
            return number;
        }

        // Recursive Calls
        return fibonacci(number - 1) + fibonacci(number - 2);
    }

    public static void main(String[] args) {
        int number = 6;

        int result = fibonacci(number);

        if (result == -1) {
            System.out.println("Invalid input. Fibonacci is undefined for negative numbers.");
        } else {
            System.out.println("The " + number + "th Fibonacci number is: " + result);
        }
    }
}