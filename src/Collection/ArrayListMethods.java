package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListMethods {

    public static void main(String[] args) {

        ArrayList<String> ar1 = new ArrayList<String>();

        ar1.add("Test");
        ar1.add("Application");
        ar1.add("with automation");
        ar1.add("using Selenium");

        System.out.println(ar1);

        System.out.println("********************");
       ArrayList<String> clonelist = (ArrayList<String>)ar1.clone();

        System.out.println(clonelist);

        ArrayList<Integer> list  = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,0));
        list.removeIf(num -> num%2==0);

        System.out.println(list);

        ArrayList<Integer> list1  = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,0));
        list1.removeIf(num -> num%2!=0);

        System.out.println(list1);

        ArrayList<String>  a  = new ArrayList<String>(Arrays.asList("All" ,"Apple" , "Bat","Cricket","Tom","Peter","Tom"));
        a.removeIf(a1 -> a1.startsWith("A"));

        System.out.println(a);

        a.retainAll(Collections.singleton("Tom"));
        System.out.println(a);

        //find the common elements
        ArrayList<String>  a3  = new ArrayList<String>(Arrays.asList("Tom","Peter","Tom","John"));
        ArrayList<String>  a4  = new ArrayList<String>(Arrays.asList("Tom","Peter","Tom","Randy"));

        a3.retainAll(a4);
        System.out.println(a3);






    }
}
