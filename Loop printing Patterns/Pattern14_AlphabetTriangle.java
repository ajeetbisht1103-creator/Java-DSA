/**
 * Pattern 14 - Alphabet Triangle
 *
 * Output:
 * A
 * AB
 * ABC
 * ABCD
 * ABCDE
 *
 * Logic:
 * - Every row starts from 'A'.
 * - Print characters up to the current row.
 *
 * Time Complexity : O(n²)
 * Space Complexity: O(1)
 */

public class Pattern14_AlphabetTriangle {

    public static void main(String[] args) {

        int n = 5;

        for (char row = 'A'; row < 'A' + n; row++) {

            for (char ch = 'A'; ch <= row; ch++) {
                System.out.print(ch);
            }

            System.out.println();
        }
    }
}