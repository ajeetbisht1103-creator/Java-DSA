/**
 * Problem Statement: LeetCode 169 - Majority Element
 * Given an array nums of size n, return the majority element.
 * The majority element is the element that appears more than ⌊n / 2⌋ times.
 * You may assume that the majority element always exists in the array.
 * 
 * Optimal Approach: Boyer-Moore Voting Algorithm
 * 
 * Time Complexity: O(N) - Single pass through the array.
 * Space Complexity: O(1) - Constant auxiliary space.
 */
public class MajorityElement {

    public static int majorityElement(int[] nums) {
        int count = 0;
        int candidate = 0;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }

            if (num == candidate) {
                count++;
            } else {
                count--;
            }
        }

        return candidate;
    }

    public static void main(String[] args) {
        int[] nums1 = {7, 0, 0, 1, 7, 7, 2, 7, 7};
        int[] nums2 = {1, 1, 1, 2, 1, 2};

        System.out.println("Majority Element (Test 1): " + majorityElement(nums1));
        System.out.println("Majority Element (Test 2): " + majorityElement(nums2));
    }
}