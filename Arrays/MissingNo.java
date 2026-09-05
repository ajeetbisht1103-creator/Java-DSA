/**
 * Problem Statement: Find the missing number in an array of distinct integers from 1 to N.
 *
 * Time Complexity: O(N) - Single traversal to compute total sum.
 * Space Complexity: O(1) - Constant auxiliary space.
 */

public class MissingNo {

    public static int missingNo(int[] arr) {
        if (arr == null) {
            return -1;
        }

        long n = arr.length + 1;
        long sum = 0;

        for (int num : arr) {
            sum += num;
        }

        long expSum = n * (n + 1) / 2;
        return (int) (expSum - sum);
    }

    public static void main(String[] args) {
        int[] arr = {8, 2, 4, 5, 3, 7, 1};
        System.out.println("Missing number is: " + missingNo(arr));
    }
}