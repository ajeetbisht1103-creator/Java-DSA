import java.util.Arrays;

/**
 * Problem: Merge Sort
 *
 * Description:
 * Sort an array using the Merge Sort algorithm based on
 * the Divide and Conquer technique.
 *
 * Example:
 * Input:  {3, 2, 8, 5, 1, 4, 23}
 * Output: [1, 2, 3, 4, 5, 8, 23]
 *
 * Time Complexity:
 * Best Case    : O(N log N)
 * Average Case : O(N log N)
 * Worst Case   : O(N log N)
 *
 * Space Complexity: O(N)
 */

public class MergeSort {

    // Clean Public API
    public static void mergeSort(int[] array) {
        if (array == null || array.length <= 1) {
            return;
        }
        mergeSortHelper(array, 0, array.length - 1);
    }

    private static void mergeSortHelper(int[] array, int low, int high) {
        if (low >= high) {
            return;
        }

        int mid = low + (high - low) / 2;

        mergeSortHelper(array, low, mid);
        mergeSortHelper(array, mid + 1, high);

        merge(array, low, mid, high);
    }

    private static void merge(int[] array, int low, int mid, int high) {
        int[] temp = new int[high - low + 1];

        int left = low;
        int right = mid + 1;
        int k = 0;

        // Merge two sorted halves into temporary array
        while (left <= mid && right <= high) {
            if (array[left] <= array[right]) {
                temp[k++] = array[left++];
            } else {
                temp[k++] = array[right++];
            }
        }

        // Copy remaining elements from left half
        while (left <= mid) {
            temp[k++] = array[left++];
        }

        // Copy remaining elements from right half
        while (right <= high) {
            temp[k++] = array[right++];
        }

        // Copy merged elements back into original array
        for (int i = 0; i < temp.length; i++) {
            array[low + i] = temp[i];
        }
    }

    public static void main(String[] args) {
        int[] array = {3, 2, 8, 5, 1, 4, 23};

        System.out.println("Before Sorting: " + Arrays.toString(array));

        mergeSort(array);

        System.out.println("After Sorting:  " + Arrays.toString(array));
    }
}