import java.util.ArrayList;

/**
 * Problem: Merge Sort
 *
 * Description:
 * Sort an array using the Merge Sort algorithm based on
 * the Divide and Conquer technique.
 *
 * Example:
 * Input:
 * {3, 2, 8, 5, 1, 4, 23}
 *
 * Output:
 * 1 2 3 4 5 8 23
 *
 * Time Complexity:
 * Best Case    : O(N log N)
 * Average Case : O(N log N)
 * Worst Case   : O(N log N)
 *
 * Space Complexity:
 * O(N)
 */

public class MergeSort {

    /**
     * Merges two sorted halves of the array.
     */
    public static void merge(int[] array, int low, int mid, int high) {

        ArrayList<Integer> temporaryArray = new ArrayList<>();

        int left = low;
        int right = mid + 1;

        // Merge the two sorted halves
        while (left <= mid && right <= high) {

            if (array[left] <= array[right]) {
                temporaryArray.add(array[left++]);
            } else {
                temporaryArray.add(array[right++]);
            }
        }

        // Copy remaining elements from the left half
        while (left <= mid) {
            temporaryArray.add(array[left++]);
        }

        // Copy remaining elements from the right half
        while (right <= high) {
            temporaryArray.add(array[right++]);
        }

        // Copy merged elements back to the original array
        for (int index = low; index <= high; index++) {
            array[index] = temporaryArray.get(index - low);
        }
    }

    /**
     * Recursively divides the array and sorts it.
     */
    public void mergeSort(int[] array, int low, int high) {

        if (low >= high) {
            return;
        }

        int mid = (low + high) / 2;

        mergeSort(array, low, mid);
        mergeSort(array, mid + 1, high);

        merge(array, low, mid, high);
    }

    public static void main(String[] args) {

        int[] array = {3, 2, 8, 5, 1, 4, 23};

        MergeSort solution = new MergeSort();

        solution.mergeSort(array, 0, array.length - 1);

        System.out.println("Sorted Array:");

        for (int number : array) {
            System.out.print(number + " ");
        }
    }
}