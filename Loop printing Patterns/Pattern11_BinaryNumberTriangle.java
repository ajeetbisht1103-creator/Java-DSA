/**
 * Pattern 11 - Binary Number Triangle
 *
 * Output:
 * 1
 * 01
 * 101
 * 0101
 * 10101
 *
 * Logic:
 * - Odd rows start with 1.
 * - Even rows start with 0.
 * - Alternate between 0 and 1.
 *
 * Time Complexity : O(n²)
 * Space Complexity: O(1)
 */

public class Pattern11_BinaryNumberTriangle {

    public static void main(String[] args) {

        int n = 5;

        for (int row = 1; row <= n; row++) {

            int value = (row % 2 == 0) ? 0 : 1;

            for (int col = 1; col <= row; col++) {

                System.out.print(value);

                value = 1 - value;
            }

            System.out.println();
        }
    }
}
