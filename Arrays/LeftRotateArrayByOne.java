/**
 * Problem Statement: Given an array of integers, rotate the array to the left by one position.
 *
 * Time Complexity: O(N) - Single traversal to shift elements.
 * Space Complexity: O(1) - Modifies the array in-place using a single temp variable.
 */

public class LeftRotateArrayByOne {

    public static void leftRotateByOne(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return;
        }

        int temp = arr[0];
        for (int i = 1; i < arr.length; i++) {
            arr[i - 1] = arr[i];
        }
        arr[arr.length - 1] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        System.out.print("Before Rotation: ");
        printArray(arr);

        leftRotateByOne(arr);

        System.out.print("After Rotation: ");
        printArray(arr);
    }

    private static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}