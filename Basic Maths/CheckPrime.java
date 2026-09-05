/**
 * Problem: Check Prime Number
 *
 * Description:
 * Determine whether a given number is prime.
 * A prime number has exactly two factors: 1 and itself.
 *
 * Example:
 * Input:  13
 * Output: Prime Number
 *
 * Time Complexity:  O(sqrt(N))
 * Space Complexity: O(1)
 */

public class CheckPrime {

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        for (int divisor = 2; divisor * divisor <= number; divisor++) {
            if (number % divisor == 0) {
                return false;
            }
        }

        return true;
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