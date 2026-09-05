import java.util.Scanner;

/**
 * Problem: Character Hashing
 *
 * Description:
 * Store and query the frequency of characters using an array-based hash table.
 *
 * Time Complexity:
 * Building Hash Array : O(N)
 * Answering Queries   : O(Q)
 * Overall             : O(N + Q)
 *
 * Space Complexity:
 * Lowercase Version   : O(26)
 * Full ASCII Version  : O(256)
 */

public class CharacterHashing {

    // Approach 1: Lowercase Characters Only (a-z)
    public static int[] getLowercaseFrequencies(String text) {
        int[] frequency = new int[26];
        if (text == null) {
            return frequency;
        }

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                frequency[ch - 'a']++;
            }
        }
        return frequency;
    }

    // Approach 2: All ASCII Characters (Supports uppercase, lowercase, digits, symbols)
    public static int[] getAsciiFrequencies(String text) {
        int[] frequency = new int[256];
        if (text == null) {
            return frequency;
        }

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch < 256) {
                frequency[ch]++;
            }
        }
        return frequency;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (!scanner.hasNext()) {
            scanner.close();
            return;
        }

        String text = scanner.next();

        // Using All ASCII version for universal character support
        int[] frequencyMap = getAsciiFrequencies(text);

        if (scanner.hasNextInt()) {
            int queries = scanner.nextInt();

            while (queries-- > 0 && scanner.hasNext()) {
                char queryChar = scanner.next().charAt(0);
                if (queryChar < 256) {
                    System.out.println("Frequency of '" + queryChar + "': " + frequencyMap[queryChar]);
                } else {
                    System.out.println("Frequency of '" + queryChar + "': 0");
                }
            }
        }

        scanner.close();
    }
}