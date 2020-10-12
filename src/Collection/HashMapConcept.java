package Collection;

import java.util.HashMap;
import java.util.Map;

public class HashMapConcept {

    /**
     * HashMap class implements Map Interface
     * HashMap stores data in Key and value pair
     * HashMap does not contain duplicate values i.e. contains unique values
     * HashMap contains one null key and multiple null values
     * HashMap does not maintain order
     * HashMap is non synchronized  - Not thread safe
     * i.e. hashmap can be accessed by multiple threads at a time
     * Fail fast condition/concurrent modification exception happens due to non - synchronized
     */

    public static void main(String[] args) {


        Employee emp = new Employee("A" ,1 ,"QA");
        Employee emp1 = new Employee("B" ,2 ,"Dev");
        Employee emp2 = new Employee("C" ,3 ,"Admin");

        HashMap<Integer,Employee> h = new HashMap<Integer, Employee>();

        h.put(1,emp);
        h.put(2,emp1);
        h.put(3,emp2);


        System.out.println(h.toString());

        for(Map.Entry<Integer,Employee> e1: h.entrySet())
        {
           int key = e1.getKey();
           Employee e = e1.getValue();

            System.out.println(key + " Info " + e.name + " " + e.age + " " + e.dept);

        }

        System.out.println("******************");

        HashMap<Integer, String> hm = new HashMap<Integer, String>();

        hm.put(1,"Aliza");
        hm.put(1,"Aliza");
        hm.put(2, "3 years");
        hm.put(3, "Girl");
        hm.replace(2,"4 years");

        for(Map.Entry e: hm.entrySet())
        {
            System.out.println(e.getKey() + " " + e.getValue());
        }

        if(hm.containsValue("Aliza"))
            System.out.println("Value is found");
        System.out.println(hm);

        System.out.println("*******************");

        HashMap<Integer, String> hm1 = new HashMap<Integer, String>();

       hm1= (HashMap<Integer, String>)hm.clone();

        for(Map.Entry e: hm1.entrySet())
        {
            System.out.println("Clone " + e.getKey() + " " + e.getValue());
        }


    }
}
