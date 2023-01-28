package udemy;

import java.util.ArrayList;

public class UniqueValueArray {

    public static void main(String[] args) {

        int[] a = {2, 2, 3, 4, 5, 3, 4, 4, 5, 5, 5, 6, 9, 6};
        ArrayList<Integer> list = new ArrayList<Integer>();

        for (int i = 0; i < a.length; i++) {
            int k = 0;

            if (!list.contains(a[i])) {
                list.add(a[i]);
                k++;

                for (int j = i + 1; j < a.length; j++) {
                    if (a[i] == a[j]) {
                        k++;
                    }
                }
                System.out.println(a[i] + " is repeated :" + k );

            }
        }
    }
}

