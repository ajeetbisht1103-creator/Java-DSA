import java.util.Arrays;

/**
 * Problem Statement: LeetCode 73 - Set Matrix Zeroes
 * Given an m x n integer matrix, if an element is 0, set its entire row and column to 0's.
 * You must do it in-place.
 * 
 * Optimal Approach: Using the First Row & First Column as Markers
 * Time Complexity: O(M * N) - Two passes through the matrix.
 * Space Complexity: O(1) - Constant auxiliary space.
 */
public class SetMatrixZeroes {

    public static void setZeroes(int[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            return;
        }

        int m = matrix.length;
        int n = matrix[0].length;

        boolean setRowZero = false;
        boolean setColZero = false;

        // Check if the first row contains any zeroes
        for (int j = 0; j < n; j++) {
            if (matrix[0][j] == 0) {
                setRowZero = true;
                break;
            }
        }

        // Check if the first column contains any zeroes
        for (int i = 0; i < m; i++) {
            if (matrix[i][0] == 0) {
                setColZero = true;
                break;
            }
        }

        // Mark zeroes on the first row and column
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }

        // Update inner matrix using markers
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }

        // Zero out the first row if needed
        if (setRowZero) {
            for (int j = 0; j < n; j++) {
                matrix[0][j] = 0;
            }
        }

        // Zero out the first column if needed
        if (setColZero) {
            for (int i = 0; i < m; i++) {
                matrix[i][0] = 0;
            }
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 1, 1},
            {1, 0, 1},
            {1, 1, 1}
        };

        setZeroes(matrix);

        System.out.println("Modified Matrix:");
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }
}