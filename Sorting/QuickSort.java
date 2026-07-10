`/**
 * Problem: Quick Sort
 *
 * Description:
 * Sort an array using the Quick Sort algorithm based on
 * the Divide and Conquer technique.
 *
 * Example:
 * Input:
 * {9, 4, 7, 3, 1}
 *
 * Output:
 * 1 3 4 7 9
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

    /**
     * Recursively sorts the array using Quick Sort.
     */
    public static void quickSort(int[] array, int low, int high) {

        if (low < high) {

            int pivotIndex = partition(array, low, high);

            quickSort(array, low, pivotIndex - 1);
            quickSort(array, pivotIndex + 1, high);
        }
    }

    /**
     * Partitions the array around the pivot element.
     */
    public static int partition(int[] array, int low, int high) {

        int pivot = array[high];

        int smallerElementIndex = low - 1;

        for (int currentIndex = low; currentIndex < high; currentIndex++) {

            if (array[currentIndex] <= pivot) {

                smallerElementIndex++;

                int temporary = array[currentIndex];
                array[currentIndex] = array[smallerElementIndex];
                array[smallerElementIndex] = temporary;
            }
        }

        int temporary = array[smallerElementIndex + 1];
        array[smallerElementIndex + 1] = array[high];
        array[high] = temporary;

        return smallerElementIndex + 1;
    }

    public static void main(String[] args) {

        int[] array = {9, 4, 7, 3, 1};

        System.out.println("Before Sorting:");

        for (int number : array) {
            System.out.print(number + " ");
        }

        quickSort(array, 0, array.length - 1);

        System.out.println("\n");

        System.out.println("After Sorting:");

        for (int number : array) {
            System.out.print(number + " ");
        }
    }
}