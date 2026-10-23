import java.util.ArrayList;
import java.util.List;

/**
 * Problem Statement: LeetCode 118 & 119 - Pascal's Triangle (All 3 Variants)
 * 
 * Variant 1: Given Row (r) and Column (c), return the element at (r, c).
 *            Formula: (r-1) C (c-1) -> O(c) Time, O(1) Space
 * 
 * Variant 2: Given Row (r), return the entire r-th row.
 *            Formula: ans = ans * (r - i) / i -> O(r) Time, O(r) Space
 * 
 * Variant 3: Given N, return the first N rows of Pascal's Triangle.
 *            Formula: Generate each row using Variant 2 logic -> O(N^2) Time, O(N^2) Space
 */
public class PascalsTriangle {

    // Variant 1: Find element at given row (r) and column (c) [1-indexed]
    public static int pascalTriangleI(int r, int c) {
        long res = 1;
        int n = r - 1;
        int k = c - 1;

        for (int i = 0; i < k; i++) {
            res = res * (n - i);
            res = res / (i + 1);
        }

        return (int) res;
    }

    // Variant 2: Generate the entire r-th row [1-indexed]
    public static int[] pascalTriangleII(int r) {
        int[] row = new int[r];
        long ans = 1;
        row[0] = (int) ans;

        for (int i = 1; i < r; i++) {
            ans = ans * (r - i);
            ans = ans / i;
            row[i] = (int) ans;
        }

        return row;
    }

    // Variant 3: Generate the entire Pascal's Triangle up to N rows
    public static List<List<Integer>> pascalTriangleIII(int n) {
        List<List<Integer>> triangle = new ArrayList<>();

        for (int row = 1; row <= n; row++) {
            long ans = 1;
            List<Integer> currentRow = new ArrayList<>();
            currentRow.add((int) ans);

            for (int col = 1; col < row; col++) {
                ans = ans * (row - col);
                ans = ans / col;
                currentRow.add((int) ans);
            }

            triangle.add(currentRow);
        }

        return triangle;
    }

    public static void main(String[] args) {
        // Variant 1 Test
        System.out.println("Variant 1 (Row 5, Col 3): " + pascalTriangleI(5, 3)); // Expected: 6

        // Variant 2 Test
        int[] row5 = pascalTriangleII(5);
        System.out.print("Variant 2 (Row 5): ");
        for (int val : row5) {
            System.out.print(val + " ");
        }
        System.out.println(); // Expected: 1 4 6 4 1

        // Variant 3 Test
        System.out.println("Variant 3 (N = 5): " + pascalTriangleIII(5));
    }
}