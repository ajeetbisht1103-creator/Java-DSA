/**
 * Pattern 13 - Incremental Number Triangle
 *
 * Output:
 * 1
 * 2 3
 * 4 5 6
 * 7 8 9 10
 * 11 12 13 14 15
 *
 * Logic:
 * - Maintain a variable that stores the current number.
 * - Print the current number and increment it after every print.
 *
 * Time Complexity : O(n²)
 * Space Complexity: O(1)
 */

public class Pattern13_IncrementalNumberTriangle {

    public static void main(String[] args) {

        int n = 5;
        int number = 1;

        for (int row = 1; row <= n; row++) {

            for (int col = 1; col <= row; col++) {
                System.out.print(number + " ");
                number++;
            }

            System.out.println();
        }
    }
}