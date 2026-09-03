/**
 * Problem Statement: LeetCode 189 - Rotate Array
 * Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.
 *
 * Approach: Reversal Algorithm
 * 1. Reverse the entire array.
 * 2. Reverse the first k elements.
 * 3. Reverse the remaining n - k elements.
 *
 * Time Complexity: O(N) - Three linear array reversals.
 * Space Complexity: O(1) - Modifies array in-place without extra memory.
 */
class Solution {
    public void rotate(int[] nums, int k) {
        if (nums == null || nums.length <= 1) {
            return;
        }

        int n = nums.length;
        k = k % n;

        if (k < 0) {
            k = k + n;
        }

        // Step 1: Reverse whole array
        reverse(nums, 0, n - 1);
        // Step 2: Reverse first k elements
        reverse(nums, 0, k - 1);
        // Step 3: Reverse remaining n - k elements
        reverse(nums, k, n - 1);
    }

    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}

public class RotateArrayByKPlaces {
    public static void main(String[] args) {
        Solution solver = new Solution();

        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;

        System.out.print("Original Array: ");
        printArray(arr);

        solver.rotate(arr, k);

        System.out.print("Right Rotated Array by " + k + " places: ");
        printArray(arr);
    }

    private static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
