/**
 * Pattern 18 - Reverse Alphabet Triangle
 *
 * Output:
 * E
 * DE
 * CDE
 * BCDE
 * ABCDE
 *
 * Logic:
 * - Each row starts from a different alphabet.
 * - End every row at 'E'.
 *
 * Time Complexity : O(n²)
 * Space Complexity: O(1)
 */

public class Pattern18_ReverseAlphabetTriangle {

    public static void main(String[] args) {

        int n = 5;

        for (int row = 0; row < n; row++) {

            for (char ch = (char) ('E' - row); ch <= 'E'; ch++) {
                System.out.print(ch);
            }

            System.out.println();
        }
    }
}
