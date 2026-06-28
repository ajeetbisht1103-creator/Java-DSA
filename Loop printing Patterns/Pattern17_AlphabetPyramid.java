/**
 * Pattern 17 - Alphabet Pyramid
 *
 * Output:
 *     A
 *    ABA
 *   ABCBA
 *  ABCDCBA
 *
 * Logic:
 * - Print leading spaces.
 * - Increase alphabet until the center.
 * - Then decrease alphabet symmetrically.
 *
 * Time Complexity : O(n²)
 * Space Complexity: O(1)
 */

public class Pattern17_AlphabetPyramid {

    public static void main(String[] args) {

        int n = 4;

        for (int row = 0; row < n; row++) {

            for (int space = n - 2; space >= row; space--) {
                System.out.print(" ");
            }

            char ch = 'A';
            int midpoint = (2 * row + 1) / 2;

            for (int col = 1; col <= 2 * row + 1; col++) {

                System.out.print(ch);

                if (col <= midpoint) {
                    ch++;
                } else {
                    ch--;
                }
            }

            System.out.println();
        }
    }
}
