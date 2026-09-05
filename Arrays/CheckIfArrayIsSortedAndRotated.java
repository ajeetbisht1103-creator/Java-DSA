/**
 * Problem Statement: Given an array nums, return true if the array was originally sorted
 * in non-decreasing order, then rotated some number of positions (including zero).
 * Otherwise, return false.
 *
 * Time Complexity: O(N) - Single pass through the array.
 * Space Complexity: O(1) - Constant auxiliary space.
 */

public class CheckIfArrayIsSortedAndRotated {

    public static boolean check(int[] nums) {
        if (nums == null || nums.length <= 1) {
            return true;
        }

        int n = nums.length;
        int countBreaks = 0;

        for (int i = 0; i < n; i++) {
            // Compare current element with the next element (wraps around using modulo)
            if (nums[i] > nums[(i + 1) % n]) {
                countBreaks++;
            }
            
            // A valid sorted and rotated array can have at most ONE break point
            if (countBreaks > 1) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int[] arr1 = {3, 4, 5, 1, 2};
        int[] arr2 = {2, 1, 3, 4};

        System.out.println("Is {3, 4, 5, 1, 2} sorted and rotated? " + check(arr1));
        System.out.println("Is {2, 1, 3, 4} sorted and rotated? " + check(arr2));
    }
}