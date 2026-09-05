import java.util.Arrays;
import java.util.Scanner;

/**
 * Problem: Reverse an Array Using Recursion
 *
 * Description:
 * Reverse the elements of an array in-place using recursion.
 *
 * Example:
 * Input:  [1, 2, 3, 4, 5]
 * Output: [5, 4, 3, 2, 1]
 *
 * Time Complexity : O(N)
 * Space Complexity: O(N) - Recursive call stack
 */

public class ReverseArray {

    // Public API entry point
    public static void reverseArray(int[] array) {
        if (array == null || array.length <= 1) {
            return;
        }
        reverseArrayHelper(0, array.length - 1, array);
    }

    // Recursive helper method
    private static void reverseArrayHelper(int left, int right, int[] array) {
        if (left >= right) {
            return;
        }

        // Swap elements
        int temp = array[left];
        array[left] = array[right];
        array[right] = temp;

        reverseArrayHelper(left + 1, right - 1, array);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (!scanner.hasNextInt()) {
            scanner.close();
            return;
        }

        int size = scanner.nextInt();
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        reverseArray(array);

        System.out.println("Reversed Array: " + Arrays.toString(array));

        scanner.close();
    }
}