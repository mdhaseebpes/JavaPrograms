package udemy;

import java.util.ArrayList;

public class SortArrayAsc {

    public static void ascSort(int[] a)
    {

        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]>a[j])
                {
                    //swap
                   a[i] = a[i]+a[j]; //4+1 = 5
                   a[j] = a[i]-a[j]; //5-1 = 4
                   a[i] =  a[i] -a[j]; //5-4 = 1
                }
            }
        }

        System.out.println("Sorted Array ascending");
        for(int b:a){
            System.out.print(b + " ");
        }
    }

    public static void main(String[] args) {
        int[] a = {4,7,1,3,9,2};

        SortArrayAsc.ascSort(a);
    }
}
