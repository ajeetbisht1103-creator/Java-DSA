/**
 * Problem Statement: Given an integer array sorted in non-decreasing order, remove
 * the duplicates in-place such that each unique element appears only once.
 * The relative order of the elements should be kept the same. Return the number of unique elements.
 *
 * Time Complexity: O(N) - Single pass through the array.
 * Space Complexity: O(1) - Modifies the array in-place without extra space.
 */
public class RemoveDuplicatesFromSortedArray {

    public static int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int uniqueIndex = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[uniqueIndex] != nums[i]) {
                uniqueIndex++;
                nums[uniqueIndex] = nums[i];
            }
        }

        return uniqueIndex + 1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 2, 2, 3, 3, 3, 3, 4, 4};

        int k = removeDuplicates(arr);

        System.out.println("Number of unique elements: " + k);
        System.out.print("Array with unique elements: ");
        for (int i = 0; i < k; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}