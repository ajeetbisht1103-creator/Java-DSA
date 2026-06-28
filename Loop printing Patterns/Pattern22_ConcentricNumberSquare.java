/**
 * Pattern 22 - Concentric Number Square
 *
 * Output:
 * 4 4 4 4 4 4 4
 * 4 3 3 3 3 3 4
 * 4 3 2 2 2 3 4
 * 4 3 2 1 2 3 4
 * 4 3 2 2 2 3 4
 * 4 3 3 3 3 3 4
 * 4 4 4 4 4 4 4
 *
 * Logic:
 * - Calculate the minimum distance from each cell to any border.
 * - Subtract that distance from the maximum value.
 *
 * Time Complexity : O(n²)
 * Space Complexity: O(1)
 */

public class Pattern22_ConcentricNumberSquare {

    public static void main(String[] args) {

        int n = 4;
        int size = 2 * n - 1;

        for (int row = 0; row < size; row++) {

            for (int col = 0; col < size; col++) {

                int top = row;
                int left = col;
                int right = size - 1 - col;
                int bottom = size - 1 - row;

                int minDistance = Math.min(
                        Math.min(top, bottom),
                        Math.min(left, right)
                );

                System.out.print((n - minDistance) + " ");
            }

            System.out.println();
        }
    }
}