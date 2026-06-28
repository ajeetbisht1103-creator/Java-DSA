/**
 * Pattern 10 - Half Diamond
 *
 * Output:
 * *
 * **
 * ***
 * ****
 * *****
 * ****
 * ***
 * **
 * *
 *
 * Logic:
 * - Print an increasing triangle.
 * - Print a decreasing triangle.
 *
 * Time Complexity : O(n²)
 * Space Complexity: O(1)
 */

public class Pattern10_HalfDiamond {

    public static void main(String[] args) {

        int n = 5;

        // Upper Half
        for (int row = 1; row <= n; row++) {

            for (int star = 1; star <= row; star++) {
                System.out.print("*");
            }

            System.out.println();
        }

        // Lower Half
        for (int row = n - 1; row >= 1; row--) {

            for (int star = 1; star <= row; star++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}