import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Problem Statement: Leaders in an Array
 * An element is a leader if it is greater than or equal to all the elements 
 * to its right side. The rightmost element is always a leader.
 * 
 * Time Complexity: O(N) - Single pass from right to left, plus O(N) for reversing.
 * Space Complexity: O(1) auxiliary - Extra space only used for the output array.
 */
public class LeadersInAnArray {

    public static List<Integer> leaders(int[] nums) {
        List<Integer> result = new ArrayList<>();
        if (nums == null || nums.length == 0) {
            return result;
        }

        int n = nums.length;
        int maxRight = nums[n - 1];
        result.add(maxRight);

        // Traverse from right to left
        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] >= maxRight) {
                result.add(nums[i]);
                maxRight = nums[i];
            }
        }

        // Reverse to maintain original left-to-right relative order
        Collections.reverse(result);

        return result;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 5, 3, 1, 2};
        int[] nums2 = {-3, 4, 5, 1, -4, -5};
        int[] nums3 = {5, 5, 1};

        System.out.println("Output 1: " + leaders(nums1)); // [5, 3, 2]
        System.out.println("Output 2: " + leaders(nums2)); // [5, 1, -4, -5]
        System.out.println("Output 3: " + leaders(nums3)); // [5, 5, 1]
    }
}