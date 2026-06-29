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
 * Space Complexity: O(N)   // Recursive call stack
 */

public class PrintNameNTimes {

    static void printName(int currentCount, int totalTimes) {

        // Base Case
        if (currentCount > totalTimes) {
            return;
        }

        System.out.println("Sam");

        // Recursive Call
        printName(currentCount + 1, totalTimes);
    }

    public static void main(String[] args) {

        int totalTimes = 5;

        printName(1, totalTimes);
    }
}