package udemy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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

        List<Integer> i = new ArrayList<>();
        i.add(100);
        i.add(10);
        i.add(6);

        System.out.println(i);

        int a1[] = {1, 10, 4, 55, 6, 34, 23, 21, 5, 100};
        Arrays.sort(a1);
        System.out.println(Arrays.toString(a1));
    }
}
