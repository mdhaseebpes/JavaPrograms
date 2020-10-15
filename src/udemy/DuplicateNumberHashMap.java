package udemy;

import java.util.HashMap;
import java.util.Map;

public class DuplicateNumberHashMap {

    //time complexity  = o(n)
    public static void main(String[] args) {
        int[] a = {2, 2, 3, 4, 5, 3, 4, 4, 5, 5, 5, 6, 9, 6};

        Map<Integer,Integer>  hm = new HashMap<Integer, Integer>();

        for(int x:a)
        {
            if(!hm.containsKey(x))
            {
                hm.put(x,1);
            }
            else{
                hm.put(x,hm.get(x)+1);
            }
        }

        for(Integer i:hm.keySet())
        {
            if(hm.get(i)>1)
            {
                System.out.println("Duplicate value is " + i);
            }
        }
    }
}
