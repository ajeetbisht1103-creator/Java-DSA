import java.util.ArrayList;

/**
 * Problem: Check Prime Number
 *
 * Description:
 * Determine whether a given number is prime.
 * A prime number has exactly two factors: 1 and itself.
 *
 * Example:
 * Input:
 * 13
 *
 * Output:
 * Prime Number
 *
 * Time Complexity : O(N)
 * Space Complexity: O(N)
 */

public class CheckPrime {

    static boolean isPrime(int number) {

        ArrayList<Integer> divisors = new ArrayList<>();

        for (int divisor = 1; divisor <= number; divisor++) {

            if (number % divisor == 0) {
                divisors.add(divisor);
            }
        }

        return divisors.size() == 2;
    }

    public static void main(String[] args) {

        int number = 13;

        if (isPrime(number)) {
            System.out.println("Prime Number");
        } else {
            System.out.println("Not a Prime Number");
        }
    }
}
