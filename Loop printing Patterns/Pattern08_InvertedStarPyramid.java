/**
 * Pattern 08 - Inverted Star Pyramid
 *
 * Output:
 * *********
 *  *******
 *   *****
 *    ***
 *     *
 *
 * Logic:
 * - Print increasing spaces.
 * - Print decreasing odd number of stars.
 *
 * Time Complexity : O(n²)
 * Space Complexity: O(1)
 */

public class Pattern08_InvertedStarPyramid {

    public static void main(String[] args) {

        int n = 5;

        for (int row = 0; row < n; row++) {

            // Leading spaces
            for (int space = 0; space < row; space++) {
                System.out.print(" ");
            }

            // Stars
            for (int star = (2 * n - 1); star > (2 * row); star--) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}