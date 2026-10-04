import java.util.Arrays;

/**
 * Problem Statement: LeetCode 2149 - Rearrange Array Elements by Sign
 * You are given a 0-indexed integer array nums of even length consisting of an equal 
 * number of positive and negative integers.
 * Rearrange the elements such that:
 * 1. Every consecutive pair has opposite signs.
 * 2. For all integers with the same sign, their relative order is preserved.
 * 3. The array begins with a positive integer.
 * 
 * Optimal Approach: Single Pass with Two Pointers (posIndex = 0, negIndex = 1)
 * Time Complexity: O(N) - Single traversal.
 * Space Complexity: O(N) - Output array space.
 */
public class RearrangeArrayElementsBySign {

    public static int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        
        int posIndex = 0; // Positives go to even indices (0, 2, 4, ...)
        int negIndex = 1; // Negatives go to odd indices (1, 3, 5, ...)

        for (int num : nums) {
            if (num > 0) {
                result[posIndex] = num;
                posIndex += 2;
            } else {
                result[negIndex] = num;
                negIndex += 2;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {3, 1, -2, -5, 2, -4};

        int[] ans = rearrangeArray(nums);

        System.out.println("Rearranged Array: " + Arrays.toString(ans));
    }
}