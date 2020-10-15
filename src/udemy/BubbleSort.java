package udemy;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int a[] = {1, 3, 4, 55, 6, 34, 23, 21, 5, 6};
        System.out.println("Un-sorted array " + Arrays.toString(a));//print array
        int l = a.length - 1;
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < l; j++) {
                if (a[j] > a[j + 1]) {//swap
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        System.out.println("sorted array " + Arrays.toString(a));//print array
    }
}
