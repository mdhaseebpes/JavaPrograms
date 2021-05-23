package udemy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DuplicateNumberHashSet {

    public static void main(String[] args) {

        int[] a = {2, 2, 3, 4, 5, 3, 4, 4, 5, 5, 5, 6, 9, 6,15};
        Set<Integer> hs = new HashSet<Integer>();

        for(int i:a)
        {
            if(hs.add(i))
            {
                System.out.println("The duplicate element is " + i);
            }
        }


    }
}
