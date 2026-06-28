/**
 * Pattern 05 - Inverted Star Triangle
 *
 * Output:
 * *****
 * ****
 * ***
 * **
 * *
 *
 * Logic:
 * - Number of stars decreases after every row.
 *
 * Time Complexity : O(n²)
 * Space Complexity: O(1)
 */

public class Pattern05_InvertedStarTriangle {

    public static void main(String[] args) {

        int n = 5;

        for (int row = 0; row < n; row++) {

            for (int col = n; col > row; col--) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}