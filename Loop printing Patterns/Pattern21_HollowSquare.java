/**
 * Pattern 21 - Hollow Square
 *
 * Output:
 * ****
 * *  *
 * *  *
 * ****
 *
 * Logic:
 * - Print '*' on the border.
 * - Print spaces inside.
 *
 * Time Complexity : O(n²)
 * Space Complexity: O(1)
 */

public class Pattern21_HollowSquare {

    public static void main(String[] args) {

        int n = 4;

        for (int row = 0; row < n; row++) {

            for (int col = 0; col < n; col++) {

                if (row == 0 || row == n - 1 || col == 0 || col == n - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }

            System.out.println();
        }
    }
}