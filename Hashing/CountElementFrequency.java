import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Problem: Count Frequency of Each Element in an Array (Using HashMap)
 *
 * Description:
 * Store the frequency of each element in an array using a HashMap
 * and answer multiple frequency queries efficiently.
 *
 * Example:
 * Input:
 * 5
 * 1 2 1 3 2
 * 3
 * 1 2 4
 *
 * Output:
 * 2
 * 2
 * 0
 *
 * Time Complexity:
 * Building HashMap : O(N) average
 * Answering Queries: O(Q) average
 * Overall          : O(N + Q)
 *
 * Space Complexity: O(N)
 */

public class CountElementFrequency {

    public static Map<Integer, Integer> buildFrequencyMap(int[] numbers) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        if (numbers == null) {
            return frequencyMap;
        }

        for (int number : numbers) {
            frequencyMap.put(number, frequencyMap.getOrDefault(number, 0) + 1);
        }

        return frequencyMap;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (!scanner.hasNextInt()) {
            scanner.close();
            return;
        }

        int size = scanner.nextInt();
        int[] numbers = new int[size];

        for (int index = 0; index < size; index++) {
            numbers[index] = scanner.nextInt();
        }

        Map<Integer, Integer> frequencyMap = buildFrequencyMap(numbers);

        if (scanner.hasNextInt()) {
            int queries = scanner.nextInt();

            while (queries-- > 0 && scanner.hasNextInt()) {
                int queryNumber = scanner.nextInt();
                System.out.println(frequencyMap.getOrDefault(queryNumber, 0));
            }
        }

        scanner.close();
    }
}