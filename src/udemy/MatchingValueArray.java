package udemy;

import java.util.ArrayList;
import java.util.Objects;

public class MatchingValueArray {

    public  static  void matchingValue(int[] a ,int[] b){
        ArrayList<Integer> matching = new ArrayList<Integer>();
        for(int i=0;i<a.length;i++)
        {
          if(a[i] == b[i]){
              matching.add(a[i]);
          }

        }
        System.out.println(matching);
      Object[] finalArray = matching.toArray();
       // System.out.println(finalArray);
        for(Object o : finalArray){
            System.out.println(o);
        }

    }


    public static void main(String[] args) {

        int a[] = {1, 4 ,8 ,9 ,0};
        int b[]  = {1,2,8,4,7};
        MatchingValueArray.matchingValue(a,b);
    }

}
