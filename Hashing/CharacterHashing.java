import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

/**
 * Problem: Character Hashing
 *
 * Description:
 * Store the frequency of characters using an array-based hash table.
 *
 * This file demonstrates two approaches:
 *
 * 1. Lowercase Characters Only (a-z)
 *    - Hash array size: 26
 *
 * 2. All ASCII Characters
 *    - Hash array size: 256
 *
 * Time Complexity:
 * Building Hash Array : O(N)
 * Answering Queries   : O(Q)
 * Overall             : O(N + Q)
 *
 * Space Complexity:
 * Lowercase Version : O(26)
 * ASCII Version     : O(256)
 */

public class CharacterHashing {

    public static void main(String[] args) throws Exception {

        System.setIn(new FileInputStream("input.txt"));
        System.setOut(new PrintStream(new FileOutputStream("output.txt")));

        Scanner scanner = new Scanner(System.in);

        String text = scanner.next();

        /*
         * ============================================================
         * Approach 1 : Lowercase Characters Only (a-z)
         * ============================================================
         */

        int[] lowercaseFrequency = new int[26];

        for (int index = 0; index < text.length(); index++) {
            lowercaseFrequency[text.charAt(index) - 'a']++;
        }

        int queries = scanner.nextInt();

        while (queries-- > 0) {

            char character = scanner.next().charAt(0);

            System.out.println(lowercaseFrequency[character - 'a']);
        }

        /*
         * ============================================================
         * Approach 2 : All ASCII Characters
         * ============================================================
         *
         * Uncomment this section when working with uppercase,
         * lowercase, digits or special characters.
         */

        /*
        int[] asciiFrequency = new int[256];

        for (int index = 0; index < text.length(); index++) {
            asciiFrequency[text.charAt(index)]++;
        }

        int queries = scanner.nextInt();

        while (queries-- > 0) {

            char character = scanner.next().charAt(0);

            System.out.println(asciiFrequency[character]);
        }
        */

        scanner.close();
    }
}