/**
 * Problem Statement: LeetCode 283 - Move Zeroes
 * Given an integer array nums, move all 0's to the end of it while maintaining
 * the relative order of the non-zero elements in-place.
 *
 * Time Complexity: O(N) - Two passes at most.
 * Space Complexity: O(1) - Constant auxiliary space.
 */

public class MoveZeroes {

    public static void moveZeroes(int[] nums) {
        if (nums == null || nums.length <= 1) {
            return;
        }

        int n = nums.length;
        int j = -1;

        // Find the index of the first zero element
        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) {
                j = i;
                break;
            }
        }

        // If no zeroes are found, array requires no operations
        if (j == -1) {
            return;
        }

        // Swap non-zero elements into position j
        for (int i = j + 1; i < n; i++) {
            if (nums[i] != 0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};

        System.out.print("Original Array: ");
        printArray(nums);

        moveZeroes(nums);

        System.out.print("After Moving Zeroes: ");
        printArray(nums);
    }

    private static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}