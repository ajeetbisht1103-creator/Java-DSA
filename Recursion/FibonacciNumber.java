/**
 * Problem: Fibonacci Number
 *
 * Description:
 * Find the nth Fibonacci number using recursion.
 *
 * Fibonacci Series:
 * 0, 1, 1, 2, 3, 5, 8, 13, ...
 *
 * Formula:
 * F(n) = F(n - 1) + F(n - 2)
 *
 * Example:
 * Input:
 * n = 6
 *
 * Output:
 * 8
 *
 * Time Complexity : O(2^N)
 * Space Complexity: O(N)   // Recursive call stack
 */

public class FibonacciNumber {

    static int fibonacci(int number) {

        // Base Case
        if (number <= 1) {
            return number;
        }

        // Recursive Calls
        int last = fibonacci(number - 1);
        int secondLast = fibonacci(number - 2);

        return last + secondLast;
    }

    public static void main(String[] args) {

        int number = 6;

        System.out.println("The " + number + "th Fibonacci number is: " + fibonacci(number));
    }
}