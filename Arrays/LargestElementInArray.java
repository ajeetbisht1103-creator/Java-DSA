/**
 * Problem: Largest Element in an Array
 *
 * Description:
 * Find the largest element present in a given array.
 *
 * Example:
 * Input:
 * {0, 1, 7, 77, 88, 41, 101, 100, 108}
 *
 * Output:
 * 108
 *
 * Time Complexity:
 * O(N)
 *
 * Space Complexity:
 * O(1)
 */

public class LargestElementInArray {

    /**
     * Returns the largest element in the array.
     */
    public static int findLargestElement(int[] array) {

        int maximum = array[0];

        for (int index = 1; index < array.length; index++) {

            if (array[index] > maximum) {
                maximum = array[index];
            }
        }

        return maximum;
    }

    public static void main(String[] args) {

        int[] array = {0, 1, 7, 77, 88, 41, 101, 100, 108};

        System.out.println("The largest element is: " + findLargestElement(array));
    }
}