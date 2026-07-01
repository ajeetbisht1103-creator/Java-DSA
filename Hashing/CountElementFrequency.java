import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.HashMap;
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
 * 1
 * 2
 * 4
 *
 * Output:
 * 2
 * 2
 * null
 *
 * Note:
 * If the queried element is not present in the array,
 * HashMap.get() returns null.
 *
 * Time Complexity:
 * Building HashMap : O(N)
 * Answering Queries: O(Q)
 * Overall          : O(N + Q)
 *
 * Space Complexity:
 * O(N)
 */

public class CountElementFrequency {

    public static void main(String[] args) throws Exception {

        // Redirect input and output for local testing
        System.setIn(new FileInputStream("input.txt"));
        System.setOut(new PrintStream(new FileOutputStream("output.txt")));

        Scanner scanner = new Scanner(System.in);

        // Read the size of the array
        int size = scanner.nextInt();

        int[] numbers = new int[size];

        // Input array elements
        for (int index = 0; index < size; index++) {
            numbers[index] = scanner.nextInt();
        }

        // HashMap to store frequency of each element
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();

        for (int index = 0; index < size; index++) {

            int currentNumber = numbers[index];
            int frequency = 0;

            if (frequencyMap.containsKey(currentNumber)) {
                frequency = frequencyMap.get(currentNumber);
            }

            frequency++;

            frequencyMap.put(currentNumber, frequency);
        }

        // Read number of queries
        int queries = scanner.nextInt();

        while (queries-- > 0) {

            int number = scanner.nextInt();

            System.out.println(frequencyMap.get(number));
        }

        scanner.close();
    }
}