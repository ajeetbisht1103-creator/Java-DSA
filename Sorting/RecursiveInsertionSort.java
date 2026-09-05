import java.util.Arrays;

/**
 * Problem: Recursive Insertion Sort
 *
 * Description:
 * Sort an array using the Insertion Sort algorithm implemented recursively.
 *
 * Example:
 * Input:  {5, 4, 3, 2, 1}
 * Output: [1, 2, 3, 4, 5]
 *
 * Time Complexity:
 * Best Case    : O(N)
 * Average Case : O(N²)
 * Worst Case   : O(N²)
 *
 * Space Complexity: O(N) - Recursive call stack
 */

public class RecursiveInsertionSort {

    // Clean Public API
    public static void insertionSort(int[] array) {
        if (array == null || array.length <= 1) {
            return;
        }
        insertionSortHelper(array, 0, array.length);
    }

    private static void insertionSortHelper(int[] array, int currentIndex, int size) {
        // Base case
        if (currentIndex == size) {
            return;
        }

        int previousIndex = currentIndex;

        // Place the current element at its correct position
        while (previousIndex > 0 && array[previousIndex - 1] > array[previousIndex]) {
            int temporary = array[previousIndex - 1];
            array[previousIndex - 1] = array[previousIndex];
            array[previousIndex] = temporary;

            previousIndex--;
        }

        // Recursive call for the next element
        insertionSortHelper(array, currentIndex + 1, size);
    }

    public static void main(String[] args) {
        int[] array = {5, 4, 3, 2, 1};

        System.out.println("Before Sorting: " + Arrays.toString(array));

        insertionSort(array);

        System.out.println("After Sorting:  " + Arrays.toString(array));
    }
}