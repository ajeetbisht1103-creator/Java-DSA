/**
 * Pattern 01 - Solid Square
 *
 * Output:
 * *****
 * *****
 * *****
 * *****
 * *****
 *
 * Logic:
 * - Outer loop controls the rows.
 * - Inner loop prints n stars in every row.
 *
 * Time Complexity : O(n²)
 * Space Complexity: O(1)
 */

public class Pattern01_SolidSquare {

    public static void main(String[] args) {

        int n = 5;

        for (int row = 0; row < n; row++) {

            for (int col = 0; R < n; col++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}