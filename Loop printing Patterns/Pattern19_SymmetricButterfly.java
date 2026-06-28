/**
 * Pattern 19 - Symmetric Butterfly
 *
 * Output:
 * *****     *****
 * ****       ****
 * ***         ***
 * **           **
 * *             *
 * *             *
 * **           **
 * ***         ***
 * ****       ****
 * *****     *****
 *
 * Logic:
 * - Upper half:
 *      - Print decreasing stars.
 *      - Print increasing spaces.
 *      - Print decreasing stars.
 * - Lower half:
 *      - Print increasing stars.
 *      - Print decreasing spaces.
 *      - Print increasing stars.
 *
 * Time Complexity : O(n²)
 * Space Complexity: O(1)
 */

public class Pattern19_SymmetricButterfly {

    public static void main(String[] args) {

        int n = 5;

        // Upper Half
        for (int row = 0; row < n; row++) {

            for (int star = 0; star < n - row; star++) {
                System.out.print("*");
            }

            for (int space = 0; space < 2 * row; space++) {
                System.out.print(" ");
            }

            for (int star = 0; star < n - row; star++) {
                System.out.print("*");
            }

            System.out.println();
        }

        // Lower Half
        for (int row = 0; row < n; row++) {

            for (int star = 0; star <= row; star++) {
                System.out.print("*");
            }

            for (int space = 0; space < 2 * (n - row - 1); space++) {
                System.out.print(" ");
            }

            for (int star = 0; star <= row; star++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}