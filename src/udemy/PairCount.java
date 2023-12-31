package udemy;

import java.util.HashMap;
import java.util.Map;

public class PairCount {
    public static int countPairsWithSum(int[] arr, int targetSum) {
        if (arr == null || arr.length < 2) {
            return 0;
        }

        // Create a HashMap to store the frequency of each element in the array
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        int pairCount = 0;

        // Traverse the array
        for (int num : arr) {
            // Calculate the complement required for the current element to reach the target sum
            int complement = targetSum - num;

            // Check if the complement exists in the frequencyMap
            if (frequencyMap.containsKey(complement)) {
                // If it exists, increment the pairCount by the frequency of the complement
                pairCount += frequencyMap.get(complement);
            }

            // Update the frequency of the current element in the frequencyMap
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // Return the total count of pairs with the target sum
        return pairCount;
    }

    public static void main(String[] args) {
        int[] A = {1, 2, 3, 2, 1};
        int B = 5;

        int result = countPairsWithSum(A, B);
        System.out.println("Pairs with sum " + B + ": " + result);
    }
}
