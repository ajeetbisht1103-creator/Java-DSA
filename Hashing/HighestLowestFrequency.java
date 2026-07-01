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
 * Input:
 * {10, 5, 10, 15, 10, 5}
 *
 * Output:
 * The highest frequency element is: 10
 * The lowest frequency element is: 15
 *
 * Time Complexity : O(N)
 * Space Complexity: O(N)
 */

public class HighestLowestFrequency {

    public void findFrequency(int[] numbers, int size) {

        // Stores each element and its frequency
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        // Count frequencies
        for (int index = 0; index < size; index++) {
            frequencyMap.put(numbers[index],
                    frequencyMap.getOrDefault(numbers[index], 0) + 1);
        }

        int maximumFrequency = 0;
        int minimumFrequency = size;

        int highestFrequencyElement = 0;
        int lowestFrequencyElement = 0;

        // Find highest and lowest frequency elements
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

        // Display results
        System.out.println("The highest frequency element is: " + highestFrequencyElement);
        System.out.println("The lowest frequency element is: " + lowestFrequencyElement);
    }

    public static void main(String[] args) {

        HighestLowestFrequency solution = new HighestLowestFrequency();

        int[] numbers = {10, 5, 10, 15, 10, 5};

        solution.findFrequency(numbers, numbers.length);
    }
}