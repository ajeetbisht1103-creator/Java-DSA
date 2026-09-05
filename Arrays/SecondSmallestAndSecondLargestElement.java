/**
 * Problem: Find Second Smallest and Second Largest Element in an Array
 *
 * Description:
 * Find the second smallest and second largest elements in a given array.
 *
 * Time Complexity: O(N)
 * Space Complexity: O(1)
 */

public class SecondSmallestAndSecondLargestElement {

    public static int findSecondSmallest(int[] array, int n) {
        if (n < 2) {
            return -1;
        }

        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int index = 0; index < n; index++) {
            if (array[index] < smallest) {
                secondSmallest = smallest;
                smallest = array[index];
            } else if (array[index] < secondSmallest && array[index] != smallest) {
                secondSmallest = array[index];
            }
        }

        return (secondSmallest == Integer.MAX_VALUE) ? -1 : secondSmallest;
    }

    public static int findSecondLargest(int[] array, int n) {
        if (n < 2) {
            return -1;
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int index = 0; index < n; index++) {
            if (array[index] > largest) {
                secondLargest = largest;
                largest = array[index];
            } else if (array[index] > secondLargest && array[index] != largest) {
                secondLargest = array[index];
            }
        }

        return (secondLargest == Integer.MIN_VALUE) ? -1 : secondLargest;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 4, 7, 7, 5};
        int n = array.length;

        int secondSmallest = findSecondSmallest(array, n);
        int secondLargest = findSecondLargest(array, n);

        System.out.println("Second smallest is " + secondSmallest);
        System.out.println("Second largest is " + secondLargest);
    }
}