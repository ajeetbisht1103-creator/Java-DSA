import java.util.Arrays;

/**
 * Problem Statement: LeetCode 48 - Rotate Image
 * You are given an n x n 2D matrix representing an image, rotate the image by 90 degrees (clockwise).
 * You have to rotate the image in-place.
 * 
 * Optimal Approach: Transpose Matrix -> Reverse Each Row
 * 1. Transpose: Swap matrix[i][j] with matrix[j][i] for j > i.
 * 2. Reverse Rows: Reverse elements of each individual row using two pointers.
 * 
 * Time Complexity: O(N^2) - Two passes over the matrix elements.
 * Space Complexity: O(1) - In-place rotation.
 */
public class RotateImage {

    public static void rotate(int[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            return;
        }

        int n = matrix.length;

        // Step 1: Transpose the matrix
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // Step 2: Reverse each row
        for (int i = 0; i < n; i++) {
            reverseRow(matrix[i]);
        }
    }

    private static void reverseRow(int[] row) {
        int left = 0;
        int right = row.length - 1;

        while (left < right) {
            int temp = row[left];
            row[left] = row[right];
            row[right] = temp;
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        rotate(matrix);

        System.out.println("Rotated Matrix (90 degrees clockwise):");
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }
}