/**
 * Problem: GCD (Greatest Common Divisor) / HCF (Highest Common Factor)
 *
 * Description:
 * Find the Greatest Common Divisor (GCD) of two numbers using the Euclidean Algorithm.
 *
 * Example:
 * Input:  20 40
 * Output: 20
 *
 * Time Complexity:  O(log(min(A, B)))
 * Space Complexity: O(1)
 */

public class GCDorHCF {

    public static int findGCD(int firstNumber, int secondNumber) {
        firstNumber = Math.abs(firstNumber);
        secondNumber = Math.abs(secondNumber);

        while (firstNumber > 0 && secondNumber > 0) {
            if (firstNumber > secondNumber) {
                firstNumber %= secondNumber;
            } else {
                secondNumber %= firstNumber;
            }
        }

        return (firstNumber == 0) ? secondNumber : firstNumber;
    }

    public static void main(String[] args) {
        int firstNumber = 20;
        int secondNumber = 40;

        System.out.println("GCD: " + findGCD(firstNumber, secondNumber));
    }
}