/**
 * Problem: Print Name N Times
 *
 * Description:
 * Print a given name exactly N times using recursion.
 *
 * Example:
 * Input:
 * Name = "Sam"
 * N = 5
 *
 * Output:
 * Sam
 * Sam
 * Sam
 * Sam
 * Sam
 *
 * Time Complexity : O(N)
 * Space Complexity: O(N) - Recursive call stack
 */

public class PrintNameNTimes {

    // Public API entry point
    public static void printName(String name, int totalTimes) {
        if (totalTimes <= 0 || name == null) {
            return;
        }
        printNameHelper(name, 1, totalTimes);
    }

    // Helper recursive method
    private static void printNameHelper(String name, int currentCount, int totalTimes) {
        if (currentCount > totalTimes) {
            return;
        }

        System.out.println(name);

        printNameHelper(name, currentCount + 1, totalTimes);
    }

    public static void main(String[] args) {
        String name = "Sam";
        int totalTimes = 5;

        printName(name, totalTimes);
    }
}