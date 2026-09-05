/**
 * Problem Statement: Linear Search
 * Given an array of integers and a target key, search for the key in the array.
 * Return the index if the key is found; otherwise, return -1.
 *
 * Time Complexity: O(N) - Single linear scan through the array.
 * Space Complexity: O(1) - Constant extra space.
 */

public class LinearSearch {

    public static int linearSearch(int[] arr, int key) {
        if (arr == null) {
            return -1;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i; // Key found at index i
            }
        }

        return -1; // Key not found
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        int key1 = 12;
        int key2 = 99;

        int index1 = linearSearch(nums, key1);
        int index2 = linearSearch(nums, key2);

        System.out.println("Element " + key1 + " is at index: " + index1);
        System.out.println("Element " + key2 + " is at index: " + index2);
    }
}