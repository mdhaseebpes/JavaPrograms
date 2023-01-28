package Collection.javaCollection23.map;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapConcept {

    //Treemap class implemented by Sorted Map interface
    //sorting happens on the base of keys
    //no duplicate keys are allowed
    //null key not allowed
    //multiple null values allowed
    //No thread safe
    // Descending order using tree map we can use Comparator.reverseOrder() by default it is ascending order
    //ex:  TreeMap<Integer,String> salary2 = new TreeMap<>(Comparator.reverseOrder());

    public static void main(String[] args) {

        TreeMap<Integer,String> salary = new TreeMap<>();
        salary.put(1000,"A");
        salary.put(4000,"C");
        salary.put(2000,"B");
        salary.put(3000,"C");
        salary.put(3000,"D");
      //  salary.put(null,"D");
        salary.put(5000,null);
        salary.put(6000,null);

        System.out.println(salary);

        System.out.println(salary.headMap(3000));
        System.out.println(salary.tailMap(2000));

       Set<Integer> keysLessThan3k = salary.headMap(3000).keySet();
        System.out.println(keysLessThan3k);

        Set<Integer> keysLessGR3k = salary.tailMap(3000).keySet();
        System.out.println(keysLessGR3k);

        TreeMap<String,Integer> treeMap = new TreeMap<>();
        treeMap.put("James" ,100);
        treeMap.put("Brad" ,200);
        treeMap.put("Albert" ,400);
        treeMap.put("George" ,50);
        treeMap.put("Larry" ,900);
        treeMap.put("Ted" ,120);
        treeMap.put("Paul" ,300);
        treeMap.put("George" ,30);

        treeMap.forEach((k,v)-> System.out.println(" key = " + k  + " value = " + v));

        // descending order using tree map by default it is ascending order
        TreeMap<Integer,String> salary2 = new TreeMap<>(Comparator.reverseOrder());
        salary2.put(1000,"A");
        salary2.put(4000,"C");
        salary2.put(2000,"B");
        salary2.put(3000,"C");
        salary2.put(3000,"D");

        System.out.println(salary2);
        salary2.forEach((k,v)-> System.out.println(" key = " + k  + " value = " + v));
    }
}
