/**
 * Problem Statement: Given a binary array, find the maximum number of consecutive 1s in this array.
 *
 * Time Complexity: O(N) - Single pass through the array.
 * Space Complexity: O(1) - Constant space used for counters.
 */

public class MaxConsecutiveOnes {

    public static int maxConsecutiveOnes(int[] arr) {
        if (arr == null) {
            return 0;
        }

        int count1 = 0;
        int max = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                count1++;
            } else {
                count1 = 0;
            }
            max = Math.max(count1, max);
        }

        return max;
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 0, 1, 1, 1};
        System.out.println("Maximum consecutive ones: " + maxConsecutiveOnes(arr));
    }
}