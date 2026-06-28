/**
 * Pattern 04 - Same Number Triangle
 *
 * Output:
 * 1
 * 22
 * 333
 * 4444
 * 55555
 *
 * Logic:
 * - Every row prints its own row number repeatedly.
 *
 * Time Complexity : O(n²)
 * Space Complexity: O(1)
 */

public class Pattern04_SameNumberTriangle {

    public static void main(String[] args) {

        int n = 5;

        for (int row = 1; row <= n; row++) {

            for (int col = 1; col <= row; col++) {
                System.out.print(row);
            }

            System.out.println();
        }
    }
}