package Collection.javaCollection23.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;


public class HashMapCompare {

    public static void main(String[] args) {

        HashMap<Integer,String> map1 = new HashMap<Integer,String>();
        map1.put(1,"one");
        map1.put(2,"two");
        map1.put(3,"three");
        map1.put(3,"four");

        HashMap<Integer,String> map2 = new HashMap<Integer,String>();
        map2.put(1,"one");
        map2.put(2,"two");
        map2.put(3,"three");

        HashMap<Integer,String> map3 = new HashMap<Integer,String>();
        map3.put(1,"one");
        map3.put(2,"two");
        map3.put(3,"three");
        map3.put(4,"four");

        System.out.println(map1.equals(map2));
        System.out.println(map1.equals(map3));

        System.out.println("---------------");
        System.out.println(map1.keySet().equals(map2.keySet()));
        System.out.println(map1.keySet().equals(map3.keySet()));

        //Compare with keys
        HashSet<Integer> combineKeys  = new HashSet<>(map1.keySet());
        //add the key set from map 2
        System.out.println("---------------");
        combineKeys.addAll(map3.keySet());
        combineKeys.removeAll(map1.keySet());
        System.out.println(combineKeys);

        HashMap<Integer,String> map5 = new HashMap<Integer,String>();
        map5.put(4,"A");
        map5.put(5,"B");
        map5.put(6,"C");


        HashMap<Integer,String> map6 = new HashMap<Integer,String>();
        map6.put(7,"A");
        map6.put(8,"B");
        map6.put(9,"C");
        map6.put(10,"C");

        System.out.println("---------------");
        //duplicates are  allowed using ArrayList
        System.out.println(new ArrayList<>(map5.values()).equals(new ArrayList<>(map6.values())));

        //duplicates are not  allowed using HashSet
        System.out.println("---------------");
        System.out.println(new HashSet<>(map5.values()).equals(new HashSet<>(map6.values())));

    }
}
