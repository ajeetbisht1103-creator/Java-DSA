import java.util.HashMap;

/**
 * Problem Statement: LeetCode 136 - Single Number
 * Given a non-empty array of integers nums, every element appears twice except for one. 
 * Find that single one.
 * 
 * Approaches:
 * 1. Brute Force: Linear search for count of each element -> O(N^2) Time, O(1) Space
 * 2. Better: Hashing using HashMap -> O(N) Time, O(N) Space
 * 3. Optimal: Bitwise XOR Operation -> O(N) Time, O(1) Space
 */
public class SingleNumber {

    // Brute Force Approach - O(N^2) Time, O(1) Space
    public static int singleNumberBrute(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (nums[j] == nums[i]) {
                    count++;
                }
            }
            if (count == 1) {
                return nums[i];
            }
        }
        return -1;
    }

    // Better Approach - O(N) Time, O(N) Space
    public static int singleNumberBetter(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for (int num : map.keySet()) {
            if (map.get(num) == 1) {
                return num;
            }
        }
        return -1;
    }

    // Optimal Approach (Bitwise XOR) - O(N) Time, O(1) Space
    public static int singleNumber(int[] nums) {
        int xor = 0;
        for (int num : nums) {
            xor ^= num;
        }
        return xor;
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 3, 3};

        System.out.println("Brute Force Output: " + singleNumberBrute(arr));
        System.out.println("Better Approach Output: " + singleNumberBetter(arr));
        System.out.println("Optimal Approach Output: " + singleNumber(arr));
    }
}