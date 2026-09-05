import java.util.Arrays;

/**
 * Problem: Insertion Sort
 *
 * Description:
 * Insertion Sort builds the sorted array one element at a time.
 * It takes each element from the unsorted portion and inserts it
 * into its correct position in the sorted portion.
 *
 * Algorithm:
 * 1. Consider the first element as already sorted.
 * 2. Pick the next element (key).
 * 3. Compare the key with elements to its left.
 * 4. Shift all greater elements one position to the right.
 * 5. Insert the key into its correct position.
 * 6. Repeat until the entire array is sorted.
 *
 * Time Complexity:
 * Best Case    : O(N)
 * Average Case : O(N²)
 * Worst Case   : O(N²)
 *
 * Space Complexity: O(1)
 * Stable:   Yes
 * In-Place: Yes
 *
 * Source: Striver A2Z DSA Sheet
 */

public class InsertionSort {

    public static void insertionSort(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return;
        }

        int n = arr.length;

        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] arr = {7, 4, 1, 5, 3};

        System.out.println("Before Sorting: " + Arrays.toString(arr));

        insertionSort(arr);

        System.out.println("After Sorting:  " + Arrays.toString(arr));
    }
}