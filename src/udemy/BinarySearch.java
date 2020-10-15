package udemy;


import java.util.Arrays;

public class BinarySearch {


    public static void main(String[] args) {
        int a[] = {1, 3, 4, 55, 6, 34, 23, 21, 5, 6};
        int searchEle = 23;
        boolean flag = false;
        int l = 0;
        int h = a.length - 1;
        Arrays.sort(a);
        while (l <= h) {
            int mid = (l + h) / 2;
            if (a[mid] == searchEle) {
                System.out.println("element found " + searchEle + " at position " + mid);
                flag = true;
                break;
            } else if (searchEle < a[mid]) {
                h = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        if (flag == false)
            System.out.println("itm not found");
        /*
        Approach 2 using Arrays
         */
        int pos = Arrays.binarySearch(a, 23);
        System.out.println("found at index:" + pos);
    }
}

