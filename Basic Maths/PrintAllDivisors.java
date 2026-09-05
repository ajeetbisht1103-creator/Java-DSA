import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Problem: Print All Divisors
 *
 * Description:
 * Find and return all the divisors of a given number in sorted order.
 *
 * Example:
 * Input:  12
 * Output: [1, 2, 3, 4, 6, 12]
 *
 * Time Complexity:  O(sqrt(N) + D log D) - where D is the total number of divisors (for sorting).
 * Space Complexity: O(D) - space needed to store divisors.
 */

public class PrintAllDivisors {

    public static List<Integer> findDivisors(int number) {
        List<Integer> divisors = new ArrayList<>();

        if (number <= 0) {
            return divisors;
        }

        for (int i = 1; i * i <= number; i++) {
            if (number % i == 0) {
                divisors.add(i);

                // Add corresponding paired divisor if it's not a duplicate square root
                if (i != number / i) {
                    divisors.add(number / i);
                }
            }
        }

        Collections.sort(divisors);
        return divisors;
    }

    public static void main(String[] args) {
        int number = 12;

        System.out.println("Divisors: " + findDivisors(number));
    }
}