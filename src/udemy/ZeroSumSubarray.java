package udemy;

public class ZeroSumSubarray {
    public static int hasZeroSumSubarray(int[] arr) {
        int sum = 0;
        java.util.HashSet<Integer> set = new java.util.HashSet<>();

        for (int num : arr) {
            sum += num;

            // If the sum is 0 or has been seen before, there exists a zero-sum subarray
            if (sum == 0 || set.contains(sum)) {
                return 1;
            }

            // Add the current sum to the set
            set.add(sum);
        }

        // No zero-sum subarray found
        return 0;
    }

    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4, 5};
        int result = hasZeroSumSubarray(A);
        System.out.println("Result: " + result);
    }
}
