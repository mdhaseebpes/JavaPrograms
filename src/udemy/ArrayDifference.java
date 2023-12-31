package udemy;

import java.util.Arrays;

import java.util.Arrays;

public class ArrayDifference {
    public static int maxEvenMinOddDifference(int[] arr) {
        int maxEven = Integer.MIN_VALUE;
        int minOdd = Integer.MAX_VALUE;

        for (int num : arr) {
            if (num % 2 == 0 && num > maxEven) {
                maxEven = num;
            } else if (num % 2 != 0 && num < minOdd) {
                minOdd = num;
            }
        }

        if (maxEven == Integer.MIN_VALUE || minOdd == Integer.MAX_VALUE) {
            // No even or odd numbers in the array
            return 0;
        } else {
            return maxEven - minOdd;
        }
    }

    public static void main(String[] args) {
        int[] A = {0, 2, 9};
        int result = maxEvenMinOddDifference(A);
        System.out.println("Difference between max even and min odd: " + result);
    }
}

