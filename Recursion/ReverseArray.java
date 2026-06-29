import java.util.Arrays;
import java.util.Scanner;

/**
 * Problem: Reverse an Array Using Recursion
 *
 * Description:
 * Reverse the elements of an array using recursion by swapping
 * the first and last elements, then recursively reversing the
 * remaining subarray.
 *
 * Example:
 * Input:
 * 1 2 3 4 5
 *
 * Output:
 * [5, 4, 3, 2, 1]
 *
 * Time Complexity : O(N)
 * Space Complexity: O(N)   // Recursive call stack
 */

public class ReverseArray {

    static void reverseArray(int left, int right, int[] array) {

        // Base Case
        if (left >= right) {
            return;
        }

        // Swap the elements
        int temp = array[left];
        array[left] = array[right];
        array[right] = temp;

        // Recursive Call
        reverseArray(left + 1, right - 1, array);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] array = new int[5];

        System.out.println("Enter 5 elements:");

        for (int index = 0; index < array.length; index++) {
            array[index] = scanner.nextInt();
        }

        reverseArray(0, array.length - 1, array);

        System.out.println("Reversed Array: " + Arrays.toString(array));

        scanner.close();
    }
}