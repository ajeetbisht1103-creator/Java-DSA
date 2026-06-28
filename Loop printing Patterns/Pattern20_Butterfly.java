/**
 * Pattern 20 - Butterfly Pattern
 *
 * Output:
 * *        *
 * **      **
 * ***    ***
 * ****  ****
 * **********
 * ****  ****
 * ***    ***
 * **      **
 * *        *
 *
 * Logic:
 * - Upper half:
 *      Increasing stars and decreasing spaces.
 * - Lower half:
 *      Decreasing stars and increasing spaces.
 *
 * Time Complexity : O(n²)
 * Space Complexity: O(1)
 */

public class Pattern20_Butterfly {

    public static void main(String[] args) {

        int n = 5;

        // Upper Half
        for (int row = 1; row <= n; row++) {

            for (int star = 1; star <= row; star++) {
                System.out.print("*");
            }

            for (int space = 1; space <= 2 * (n - row); space++) {
                System.out.print(" ");
            }

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

            for (int space = 1; space <= 2 * (n - row); space++) {
                System.out.print(" ");
            }

            for (int star = 1; star <= row; star++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
