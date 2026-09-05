import java.util.HashMap;
import java.util.Map;

/**
 * Problem: Find the Highest and Lowest Frequency Elements
 *
 * Description:
 * Count the frequency of each element in an array using a HashMap
 * and determine the elements with the highest and lowest frequencies.
 *
 * Example:
 * Input:  {10, 5, 10, 15, 10, 5}
 * Output:
 * The highest frequency element is: 10
 * The lowest frequency element is: 15
 *
 * Time Complexity : O(N)
 * Space Complexity: O(N)
 */

public class HighestLowestFrequency {

    public static void findFrequency(int[] numbers, int size) {
        if (numbers == null || size == 0) {
            System.out.println("Array is empty.");
            return;
        }

        Map<Integer, Integer> frequencyMap = new HashMap<>();

        for (int index = 0; index < size; index++) {
            frequencyMap.put(numbers[index], frequencyMap.getOrDefault(numbers[index], 0) + 1);
        }

        int maximumFrequency = 0;
        int minimumFrequency = Integer.MAX_VALUE;

        int highestFrequencyElement = 0;
        int lowestFrequencyElement = 0;

        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            int currentElement = entry.getKey();
            int currentFrequency = entry.getValue();

            if (currentFrequency > maximumFrequency) {
                maximumFrequency = currentFrequency;
                highestFrequencyElement = currentElement;
            }

            if (currentFrequency < minimumFrequency) {
                minimumFrequency = currentFrequency;
                lowestFrequencyElement = currentElement;
            }
        }

        System.out.println("The highest frequency element is: " + highestFrequencyElement);
        System.out.println("The lowest frequency element is: " + lowestFrequencyElement);
    }

    public static void main(String[] args) {
        int[] numbers = {10, 5, 10, 15, 10, 5};
        findFrequency(numbers, numbers.length);
    }
}