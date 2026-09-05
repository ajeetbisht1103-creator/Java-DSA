import java.util.ArrayList;
import java.util.List;

/**
 * Problem Statement: Union of Two Sorted Arrays
 * Given two sorted arrays arr1 and arr2, find the union of two arrays.
 * The union of two arrays contains distinct elements from both arrays in sorted order.
 *
 * Time Complexity: O(N + M) - Single pass through both arrays.
 * Space Complexity: O(N + M) - Space required for output list.
 */

public class UnionOfSortedArrays {

    public static List<Integer> findUnion(int[] arr1, int[] arr2) {
        List<Integer> union = new ArrayList<>();
        int i = 0, j = 0;
        int n = arr1.length;
        int m = arr2.length;

        while (i < n && j < m) {
            if (arr1[i] < arr2[j]) {
                if (union.isEmpty() || union.get(union.size() - 1) != arr1[i]) {
                    union.add(arr1[i]);
                }
                i++;
            } else if (arr2[j] < arr1[i]) {
                if (union.isEmpty() || union.get(union.size() - 1) != arr2[j]) {
                    union.add(arr2[j]);
                }
                j++;
            } else {
                if (union.isEmpty() || union.get(union.size() - 1) != arr1[i]) {
                    union.add(arr1[i]);
                }
                i++;
                j++;
            }
        }

        while (i < n) {
            if (union.isEmpty() || union.get(union.size() - 1) != arr1[i]) {
                union.add(arr1[i]);
            }
            i++;
        }

        while (j < m) {
            if (union.isEmpty() || union.get(union.size() - 1) != arr2[j]) {
                union.add(arr2[j]);
            }
            j++;
        }

        return union;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 6, 6};
        int[] arr2 = {3, 4, 5, 5, 6, 7, 9};

        List<Integer> result = findUnion(arr1, arr2);

        System.out.print("Union of Arrays: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}