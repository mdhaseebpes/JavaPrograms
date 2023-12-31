package Collection.javaCollection23;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListCompare {

    public static void main(String[] args) {

        //1. sort and equals
        ArrayList<String> l1 = new ArrayList<>(Arrays.asList("A" ,"B" ,"C" ,"D" ,"F"));

        ArrayList<String> l2 = new ArrayList<>(Arrays.asList("A" ,"B" ,"C" ,"D" ,"E"));

        ArrayList<String> l3 = new ArrayList<>(Arrays.asList("A" ,"C", "B","D" ,"F"));

        Collections.sort(l1);
        Collections.sort(l2);

        System.out.println(l1.equals(l2));

        Collections.sort(l3);
        System.out.println(l1.equals(l3));

        //2. compare 2 list and find out additional elements
        ArrayList<String> l4 = new ArrayList<>(Arrays.asList("A" ,"B" ,"C" ,"D" ,"F"));

        ArrayList<String> l5 = new ArrayList<>(Arrays.asList("A" ,"B" ,"C" ,"D" ,"E"));

        l4.removeAll(l5);
        System.out.println(l4.equals(l5));
        System.out.println("additional element is - " +l4);

        System.out.println("-----------------");

        ArrayList<String> l6 = new ArrayList<>(Arrays.asList("A" ,"B" ,"C" ,"D" ,"F"));

        ArrayList<String> l7 = new ArrayList<>(Arrays.asList("A" ,"B" ,"C" ,"D" ,"E"));
        l6.retainAll(l7);
        System.out.println(l6);





    }
}
