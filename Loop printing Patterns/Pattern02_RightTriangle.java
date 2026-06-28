/**
 * Pattern 02 - Right Triangle
 *
 * Output:
 * *
 * **
 * ***
 * ****
 * *****
 *
 * Logic:
 * - Outer loop controls the rows.
 * - Inner loop prints stars equal to the current row number.
 *
 * Time Complexity : O(n²)
 * Space Complexity: O(1)
 */

public class Pattern02_RightTriangle {

    public static void main(String[] args) {

        int n = 5;

        for (int row = 0; row < n; row++) {

            for (int col = 0; col <= row; col++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}