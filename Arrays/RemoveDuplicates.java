/**
 * Problem Statement: LeetCode 26 - Remove Duplicates from Sorted Array
 * Given an integer array nums sorted in non-decreasing order, remove 
 * the duplicates in-place such that each unique element appears only once.
 * Return the number of unique elements k.
 * 
 * Time Complexity: O(N) - Single pass through the array.
 * Space Complexity: O(1) - Modifies the array in-place without extra space.
 */
public class RemoveDuplicates {

    public static int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int k = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[k] = nums[i];
                k++;
            }
        }

        return k;
    }

    public static void main(String[] args) {
        int[] arr = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};

        int k = removeDuplicates(arr);

        System.out.println("Number of unique elements: " + k);
        System.out.print("Array with unique elements: ");
        for (int i = 0; i < k; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}