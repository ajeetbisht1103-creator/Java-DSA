/**
 * Pattern 12 - Number Crown
 *
 * Output:
 * 1      1
 * 12    21
 * 123  321
 * 12344321
 *
 * Logic:
 * - Left side prints increasing numbers.
 * - Middle contains spaces.
 * - Right side prints decreasing numbers.
 *
 * Time Complexity : O(n²)
 * Space Complexity: O(1)
 */

public class Pattern12_NumberCrown {

    public static void main(String[] args) {

        int n = 4;

        for (int row = 1; row <= n; row++) {

            // Left Numbers
            for (int num = 1; num <= row; num++) {
                System.out.print(num);
            }

            // Spaces
            for (int space = 1; space <= 2 * (n - row); space++) {
                System.out.print(" ");
            }

            // Right Numbers
            for (int num = row; num >= 1; num--) {
                System.out.print(num);
            }

            System.out.println();
        }
    }
}