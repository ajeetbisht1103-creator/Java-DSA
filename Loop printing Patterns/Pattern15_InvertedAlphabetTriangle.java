/**
 * Pattern 15 - Inverted Alphabet Triangle
 *
 * Output:
 * ABCDE
 * ABCD
 * ABC
 * AB
 * A
 *
 * Logic:
 * - Begin every row from 'A'.
 * - Reduce one character after every row.
 *
 * Time Complexity : O(n²)
 * Space Complexity: O(1)
 */

public class Pattern15_InvertedAlphabetTriangle {

    public static void main(String[] args) {

        int n = 5;

        for (int row = n; row >= 1; row--) {

            char ch = 'A';

            for (int col = 1; col <= row; col++) {
                System.out.print(ch);
                ch++;
            }

            System.out.println();
        }
    }
}