/**
 * Pattern 07 - Star Pyramid
 *
 * Output:
 *     *
 *    ***
 *   *****
 *  *******
 * *********
 *
 * Logic:
 * - Print leading spaces to center the pyramid.
 * - Print (2 × row + 1) stars in each row.
 *
 * Time Complexity : O(n²)
 * Space Complexity: O(1)
 */

public class Pattern07_StarPyramid {

    public static void main(String[] args) {

        int n = 5;

        for (int row = 0; row < n; row++) {

            // Print leading spaces
            for (int space = n - 1; space > row; space--) {
                System.out.print(" ");
            }

            // Print stars
            for (int star = 0; star < (2 * row + 1); star++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}