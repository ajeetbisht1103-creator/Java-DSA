import java.util.Arrays;

/**
 * Problem: Bubble Sort
 *
 * Description:
 * Bubble Sort repeatedly compares adjacent elements and swaps them
 * if they are in the wrong order. After each pass, the largest
 * unsorted element "bubbles" to its correct position.
 *
 * Algorithm:
 * 1. Traverse the array from left to right.
 * 2. Compare every pair of adjacent elements.
 * 3. Swap them if they are in the wrong order.
 * 4. After each pass, the largest element reaches its correct position.
 * 5. Repeat for the remaining unsorted part of the array.
 * 6. Stop early if no swaps occur in a pass.
 *
 * Time Complexity:
 * Best Case    : O(N)
 * Average Case : O(N²)
 * Worst Case   : O(N²)
 *
 * Space Complexity:
 * O(1)
 *
 * Stable:   Yes
 * In-Place: Yes
 *
 * Source: Striver A2Z DSA Sheet
 */

public class BubbleSort {

    public static void bubbleSort(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return;
        }

        int n = arr.length;

        for (int i = n - 1; i > 0; i--) {
            boolean didSwap = false;

            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    didSwap = true;
                }
            }

            if (!didSwap) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {13, 46, 24, 52, 20, 9};

        System.out.println("Before Sorting: " + Arrays.toString(arr));

        bubbleSort(arr);

        System.out.println("After Sorting:  " + Arrays.toString(arr));
    }
}