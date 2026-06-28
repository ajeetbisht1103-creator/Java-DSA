/**
 * Pattern 09 - Diamond
 *
 * Output:
 *     *
 *    ***
 *   *****
 *  *******
 * *********
 * *********
 *  *******
 *   *****
 *    ***
 *     *
 *
 * Logic:
 * - Combine Star Pyramid and Inverted Star Pyramid.
 *
 * Time Complexity : O(n²)
 * Space Complexity: O(1)
 */

public class Pattern09_Diamond {

    public static void main(String[] args) {

        int n = 5;

        // Upper Half
        for (int row = 0; row < n; row++) {

            for (int space = n - 1; space > row; space--) {
                System.out.print(" ");
            }

            for (int star = 0; star < (2 * row + 1); star++) {
                System.out.print("*");
            }

            System.out.println();
        }

        // Lower Half
        for (int row = 0; row < n; row++) {

            for (int space = 0; space < row; space++) {
                System.out.print(" ");
            }

            for (int star = (2 * n - 1); star > (2 * row); star--) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}