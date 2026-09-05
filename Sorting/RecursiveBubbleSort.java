import java.util.Arrays;

/**
 * Problem: Recursive Bubble Sort
 *
 * Description:
 * Sort an array using the Bubble Sort algorithm implemented recursively.
 *
 * Example:
 * Input:  {13, 46, 24, 52, 20, 9}
 * Output: [9, 13, 20, 24, 46, 52]
 *
 * Time Complexity:
 * Best Case    : O(N) (with early exit optimization)
 * Average Case : O(N²)
 * Worst Case   : O(N²)
 *
 * Space Complexity: O(N) - Recursive call stack
 */

public class RecursiveBubbleSort {

    // Clean Public API
    public static void bubbleSort(int[] array) {
        if (array == null || array.length <= 1) {
            return;
        }
        bubbleSortHelper(array, array.length);
    }

    private static void bubbleSortHelper(int[] array, int size) {
        if (size <= 1) {
            return;
        }

        boolean didSwap = false;

        // Perform one pass and push largest element to the end
        for (int index = 0; index < size - 1; index++) {
            if (array[index] > array[index + 1]) {
                int temp = array[index];
                array[index] = array[index + 1];
                array[index + 1] = temp;

                didSwap = true;
            }
        }

        // If no elements were swapped, array is already sorted
        if (!didSwap) {
            return;
        }

        // Recursive call for remaining unsorted portion
        bubbleSortHelper(array, size - 1);
    }

    public static void main(String[] args) {
        int[] array = {13, 46, 24, 52, 20, 9};

        System.out.println("Before Sorting: " + Arrays.toString(array));

        bubbleSort(array);

        System.out.println("After Sorting:  " + Arrays.toString(array));
    }
}