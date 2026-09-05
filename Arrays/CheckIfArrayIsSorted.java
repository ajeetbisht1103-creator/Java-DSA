/**
 * Problem: Check if an Array is Sorted
 *
 * Description:
 * Check whether the given array is sorted in
 * non-decreasing (ascending) order.
 *
 * Time Complexity: O(N)
 * Space Complexity: O(1)
 */

public class CheckIfArrayIsSorted {

    /**
     * Checks whether the array is sorted in non-decreasing order.
     */
    public static boolean isSorted(int[] array, int n) {
        for (int index = 1; index < n; index++) {
            if (array[index] < array[index - 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 4, 4, 3, 8};
        int n = array.length;

        boolean sorted = isSorted(array, n);

        if (sorted) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}