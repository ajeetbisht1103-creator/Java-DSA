/**
 * Pattern 06 - Inverted Number Triangle
 *
 * Output:
 * 12345
 * 1234
 * 123
 * 12
 * 1
 *
 * Logic:
 * - Start every row from 1.
 * - Print one less number after each row.
 *
 * Time Complexity : O(n²)
 * Space Complexity: O(1)
 */

public class Pattern06_InvertedNumberTriangle {

    public static void main(String[] args) {

        int n = 5;

        for (int row = 0; row < n; row++) {

            int number = 1;

            for (int col = n; col > row; col--) {
                System.out.print(number);
                number++;
            }

            System.out.println();
        }
    }
}