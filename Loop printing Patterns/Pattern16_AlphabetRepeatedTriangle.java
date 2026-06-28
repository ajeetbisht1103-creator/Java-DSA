/**
 * Pattern 16 - Alphabet Repeated Triangle
 *
 * Output:
 * A
 * BB
 * CCC
 * DDDD
 * EEEEE
 *
 * Logic:
 * - Every row prints the same alphabet repeatedly.
 * - Alphabet changes after each row.
 *
 * Time Complexity : O(n²)
 * Space Complexity: O(1)
 */

public class Pattern16_AlphabetRepeatedTriangle {

    public static void main(String[] args) {

        int n = 5;

        for (int row = 0; row < n; row++) {

            char alphabet = (char) ('A' + row);

            for (int col = 0; col <= row; col++) {
                System.out.print(alphabet);
            }

            System.out.println();
        }
    }
}