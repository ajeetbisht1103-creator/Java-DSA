import java.util.Arrays;

/**
 * Problem Statement: Intersection of Two Sorted Arrays
 * Given two sorted arrays nums1 and nums2, return an array of their intersection.
 * Each element in the result must appear as many times as it shows in both arrays.
 * 
 * Time Complexity: O(N + M) - Single pass using two pointers.
 * Space Complexity: O(min(N, M)) - Memory allocated for the intersection result.
 */
public class ArrayIntersection {

    public static int[] intersectionArray(int[] nums1, int[] nums2) {
        if (nums1 == null || nums2 == null) {
            return new int[0];
        }

        int n1 = nums1.length;
        int n2 = nums2.length;
        int i = 0, j = 0, k = 0;

        int[] arr = new int[Math.min(n1, n2)];

        while (i < n1 && j < n2) {
            if (nums1[i] == nums2[j]) {
                arr[k++] = nums1[i];
                i++;
                j++;
            } else if (nums1[i] > nums2[j]) {
                j++;
            } else {
                i++;
            }
        }

        return Arrays.copyOf(arr, k);
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 2, 3, 4, 5};
        int[] nums2 = {2, 2, 3, 5, 6};

        int[] result = intersectionArray(nums1, nums2);

        System.out.println("Intersection: " + Arrays.toString(result));
    }
}