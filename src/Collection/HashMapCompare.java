package Collection;

import java.sql.SQLOutput;
import java.util.*;

public class HashMapCompare {

    public static void main(String[] args) {

        HashMap<Integer,String> map1  = new HashMap<>();

        map1.put(1,"A");
        map1.put(2,"B");
        map1.put(3,"C");

        HashMap<Integer,String> map2  = new HashMap<>();

        map2.put(1,"A");
        map2.put(3,"C");
        map2.put(2,"B");

        System.out.println(map1.equals(map2));


        HashMap<Integer,String> map3  = new HashMap<>();

        map3.put(1,"A");
        map3.put(3,"C");
        map3.put(2,"B");
        map3.put(4,"D");

        System.out.println(map3.equals(map2));

        //Find out extra Keys
        System.out.println("***********Extra Key present********");
        HashSet<Integer>  combineKeys = new HashSet<>(map2.keySet());
        combineKeys.addAll(map3.keySet());
        combineKeys.removeAll(map1.keySet());

        System.out.println(combineKeys);

        //Compare with values
        //Allows the duplicate value : HashSet

        HashMap<Integer,String> map4  = new HashMap<>();

        map4.put(1,"A");
        map4.put(3,"C");
        map4.put(2,"B");

        HashMap<Integer,String> map5  = new HashMap<>();

        map5.put(1,"A");
        map5.put(3,"C");
        map5.put(2,"B");
        map5.put(4,"A");

        System.out.println("*********Compare values using HashSet");
        System.out.println(new HashSet<String>(map4.values()).equals(new HashSet<String>(map5.values())));

        System.out.println("**********Compare values using ArrayList");
        System.out.println(new ArrayList<String>(map4.values()).equals(new ArrayList<>(map5.values())));



        //immutable Map with only one single entry:
        System.out.println("*******immutable map with one entry");
        Map<String,Integer> marks =Collections.singletonMap("A",100);
        System.out.println(marks.get("A"));
       // marks.put("B",200); //UnsupportedOperationException

    }

}
