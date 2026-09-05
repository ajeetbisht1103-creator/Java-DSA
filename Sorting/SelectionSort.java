import java.util.Arrays;

/**
 * Problem: Selection Sort
 *
 * Description:
 * Selection Sort repeatedly selects the smallest element from the
 * unsorted portion of the array and places it at its correct position.
 *
 * Algorithm:
 * 1. Assume the first unsorted element is the minimum.
 * 2. Traverse the remaining unsorted array.
 * 3. Find the actual minimum element.
 * 4. Swap it with the first unsorted element.
 * 5. Repeat until the array becomes sorted.
 *
 * Time Complexity:
 * Best Case    : O(N²)
 * Average Case : O(N²)
 * Worst Case   : O(N²)
 *
 * Space Complexity: O(1)
 * Stable:   No
 * In-Place: Yes
 */

public class SelectionSort {

    public static void selectionSort(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return;
        }

        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap only if a smaller element was found
            if (minIndex != i) {
                int temp = arr[minIndex];
                arr[minIndex] = arr[i];
                arr[i] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {13, 46, 24, 52, 20, 9};

        System.out.println("Before Sorting: " + Arrays.toString(arr));

        selectionSort(arr);

        System.out.println("After Sorting:  " + Arrays.toString(arr));
    }
}