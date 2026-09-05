import java.util.Scanner;

/**
 * Problem: Number Hashing (Frequency Count)
 *
 * Description:
 * Store the frequency of integers using an array-based hash table
 * and answer multiple frequency queries efficiently.
 *
 * Time Complexity:
 * Building Hash Array : O(N)
 * Answering Queries   : O(Q)
 * Overall             : O(N + Q)
 *
 * Space Complexity:
 * O(K) where K is the size of the hash array (max value allowed).
 */

public class NumberHashing {

    private static final int DEFAULT_MAX_HASH_SIZE = 1000000; // Handles values up to 10^6

    public static int[] buildHashArray(int[] numbers, int maxVal) {
        int[] frequency = new int[maxVal + 1];
        if (numbers == null) {
            return frequency;
        }

        for (int number : numbers) {
            if (number >= 0 && number <= maxVal) {
                frequency[number]++;
            }
        }
        return frequency;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (!scanner.hasNextInt()) {
            scanner.close();
            return;
        }

        int size = scanner.nextInt();
        int[] numbers = new int[size];

        int maxNum = 0;
        for (int index = 0; index < size; index++) {
            numbers[index] = scanner.nextInt();
            if (numbers[index] > maxNum) {
                maxNum = numbers[index];
            }
        }

        // Dynamically scale hash array size or fall back to limit
        int hashSize = Math.min(maxNum, DEFAULT_MAX_HASH_SIZE);
        int[] frequency = buildHashArray(numbers, hashSize);

        if (scanner.hasNextInt()) {
            int queries = scanner.nextInt();

            while (queries-- > 0 && scanner.hasNextInt()) {
                int queryNumber = scanner.nextInt();
                if (queryNumber >= 0 && queryNumber <= hashSize) {
                    System.out.println(frequency[queryNumber]);
                } else {
                    System.out.println(0);
                }
            }
        }

        scanner.close();
    }
}