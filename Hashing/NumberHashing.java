import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

/**
 * Problem: Number Hashing (Frequency Count)
 *
 * Description:
 * Store the frequency of integers using an array-based hash table
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
 * 0
 *
 * Time Complexity:
 * Building Hash Array : O(N)
 * Answering Queries   : O(Q)
 * Overall             : O(N + Q)
 *
 * Space Complexity:
 * O(K)
 * where K is the size of the hash array.
 */

public class NumberHashing {

    public static void main(String[] args) throws Exception {

        // Redirect input and output for local testing
        System.setIn(new FileInputStream("input.txt"));
        System.setOut(new PrintStream(new FileOutputStream("output.txt")));

        Scanner scanner = new Scanner(System.in);

        // Read array size
        int size = scanner.nextInt();

        int[] numbers = new int[size];

        // Input array elements
        for (int index = 0; index < size; index++) {
            numbers[index] = scanner.nextInt();
        }

        // Hash array to store frequencies
        int[] frequency = new int[11];

        for (int index = 0; index < size; index++) {
            frequency[numbers[index]]++;
        }

        // Number of queries
        int queries = scanner.nextInt();

        while (queries-- > 0) {

            int number = scanner.nextInt();

            System.out.println(frequency[number]);
        }

        scanner.close();
    }
}