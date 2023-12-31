package udemy;


public class RotationChecker {


    /*Write a Java program for below : Write a function that returns true if one array is a rotation of another.
            NOTE: There are no duplicates in each of these arrays.
            Example: [1, 2, 3, 4, 5, 6, 7] is a rotation of [4, 5, 6, 7, 1, 2, 3].
            Sure! Here's a Java program that checks if one array is a rotation of another:*/
    public static boolean isRotation(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }

        int n = arr1.length;

        // Find the first element of arr1 in arr2
        int index = -1;
        for (int i = 0; i < n; i++) {
            if (arr2[i] == arr1[0]) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            return false;
        }

        // Compare the elements of arr1 and arr2 starting from index
        for (int i = 0; i < n; i++) {
            if (arr1[i] != arr2[(index + i) % n]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7};
        int[] arr2 = {4, 5, 6, 7, 1, 2, 3};

        if (isRotation(arr1, arr2)) {
            System.out.println("arr2 is a rotation of arr1");
        } else {
            System.out.println("arr2 is not a rotation of arr1");
        }
    }
}
