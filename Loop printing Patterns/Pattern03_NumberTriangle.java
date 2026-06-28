/**
 * Pattern 03 - Number Triangle
 *
 * Output:
 * 1
 * 12
 * 123
 * 1234
 * 12345
 *
 * Logic:
 * - Each row prints numbers starting from 1 up to the row number.
 *
 * Time Complexity : O(n²)
 * Space Complexity: O(1)
 */

public class Pattern03_NumberTriangle {

    public static void main(String[] args) {

        int n = 5;

        for (int row = 1; row <= n; row++) {

            for (int number = 1; number <= row; number++) {
                System.out.print(number);
            }

            System.out.println();
        }
    }
}