import java.util.Arrays;

/**
 * Problem: Quick Sort
 *
 * Description:
 * Sort an array using the Quick Sort algorithm based on
 * the Divide and Conquer technique.
 *
 * Example:
 * Input:  {9, 4, 7, 3, 1}
 * Output: [1, 3, 4, 7, 9]
 *
 * Time Complexity:
 * Best Case    : O(N log N)
 * Average Case : O(N log N)
 * Worst Case   : O(N²)
 *
 * Space Complexity:
 * Best/Average : O(log N)
 * Worst Case   : O(N)
 */

public class QuickSort {

    // Clean Public API Entry Point
    public static void quickSort(int[] array) {
        if (array == null || array.length <= 1) {
            return;
        }
        quickSortHelper(array, 0, array.length - 1);
    }

    private static void quickSortHelper(int[] array, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(array, low, high);

            quickSortHelper(array, low, pivotIndex - 1);
            quickSortHelper(array, pivotIndex + 1, high);
        }
    }

    private static int partition(int[] array, int low, int high) {
        int pivot = array[high];
        int smallerElementIndex = low - 1;

        for (int currentIndex = low; currentIndex < high; currentIndex++) {
            if (array[currentIndex] <= pivot) {
                smallerElementIndex++;
                swap(array, currentIndex, smallerElementIndex);
            }
        }

        swap(array, smallerElementIndex + 1, high);
        return smallerElementIndex + 1;
    }

    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void main(String[] args) {
        int[] array = {9, 4, 7, 3, 1};

        System.out.println("Before Sorting: " + Arrays.toString(array));

        quickSort(array);

        System.out.println("After Sorting:  " + Arrays.toString(array));
    }
}