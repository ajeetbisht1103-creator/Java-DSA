import java.util.ArrayList;

/**
 * Problem: Print All Divisors
 *
 * Description:
 * Find and print all the divisors of a given number.
 *
 * Example:
 * Input:
 * 12
 *
 * Output:
 * [1, 2, 3, 4, 6, 12]
 *
 * Time Complexity : O(N)
 * Space Complexity: O(N)
 */

public class PrintAllDivisors {

    static ArrayList<Integer> findDivisors(int number) {

        ArrayList<Integer> divisors = new ArrayList<>();

        for (int divisor = 1; divisor <= number; divisor++) {

            if (number % divisor == 0) {
                divisors.add(divisor);
            }
        }

        return divisors;
    }

    public static void main(String[] args) {

        int number = 12;

        System.out.println("Divisors: " + findDivisors(number));
    }
}