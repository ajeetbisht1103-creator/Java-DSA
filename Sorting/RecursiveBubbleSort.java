/**
 * Problem: Recursive Bubble Sort
 *
 * Description:
 * Sort an array using the Bubble Sort algorithm implemented recursively.
 *
 * Example:
 * Input:
 * {13, 46, 24, 52, 20, 9}
 *
 * Output:
 * 9 13 20 24 46 52
 *
 * Time Complexity:
 * Best Case    : O(N²)
 * Average Case : O(N²)
 * Worst Case   : O(N²)
 *
 * Space Complexity:
 * O(N) (Recursive call stack)
 */

public class RecursiveBubbleSort {

    /**
     * Recursively sorts the array using Bubble Sort.
     */
    public static void bubbleSort(int[] array, int size) {

        // Base case
        if (size == 1) {
            return;
        }

        // Move the largest element to its correct position
        for (int index = 0; index <= size - 2; index++) {

            if (array[index] > array[index + 1]) {

                int temporary = array[index];
                array[index] = array[index + 1];
                array[index + 1] = temporary;
            }
        }

        // Recursive call for remaining elements
        bubbleSort(array, size - 1);
    }

    public static void main(String[] args) {

        int[] array = {13, 46, 24, 52, 20, 9};

        int size = array.length;

        System.out.println("Before Sorting:");

        for (int number : array) {
            System.out.print(number + " ");
        }

        bubbleSort(array, size);

        System.out.println("\n");

        System.out.println("After Sorting:");

        for (int number : array) {
            System.out.print(number + " ");
        }
    }
}