package udemy;

import java.util.Arrays;

public class AdjacentArray {

    public static void maxDiff(int[] a)
    {
        int diff = 0;
        for(int i=1;i<a.length;i++){
           if(a[i] - a[i-1]>diff){
               diff = a[i] - a[i-1];
           }

        }
        System.out.println("Maximum difference " + diff);
    }

    public static void main(String[] args) {
        int[] a = {1,5,8,15,24};

        AdjacentArray.maxDiff(a);
    }
}
