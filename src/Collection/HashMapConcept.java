package Collection;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class HashMapConcept {

    /**
     * HashMap class implements Map Interface
     * HashMap stores data in Key and value pair
     * HashMap does not contain duplicate values i.e. contains unique values
     * HashMap contains one null key and multiple null values -- index of null key is 0 --> Hashcode of null key is also 0
     * HashMap does not maintain order
     * HashMap is non synchronized  - Not thread safe
     * i.e. hashmap can be accessed by multiple threads at a time
     * Fail fast condition/concurrent modification exception happens due to non - synchronized
     */

    public static void main(String[] args) {
        Employee emp = new Employee("A", 1, "QA");
        Employee emp1 = new Employee("B", 2, "Dev");
        Employee emp2 = new Employee("C", 3, "Admin");

        HashMap<Integer, Employee> h = new HashMap<Integer, Employee>();

        h.put(1, emp);
        h.put(2, emp1);
        h.put(3, emp2);


        System.out.println(h);

        for (Map.Entry<Integer, Employee> e1 : h.entrySet()) {
            int key = e1.getKey();
            Employee e = e1.getValue();

            System.out.println(key + " Info " + e.name + " " + e.age + " " + e.dept);
        }
        System.out.println("******************");
        HashMap<Integer, String> hm = new HashMap<Integer, String>();
        hm.put(1, "Aliza");
        hm.put(5, "Aliza");
        hm.put(2, "3 years");
        hm.put(3, "Girl");
        hm.replace(2, "Aliza");
        for (Map.Entry e : hm.entrySet()) {
            System.out.println(e.getKey() + " " + e.getValue());
        }
        if (hm.containsValue("Aliza"))
            System.out.println("Value is found");
        System.out.println(hm);
        System.out.println("******************* Clone");
        HashMap<Integer, String> hm1 = new HashMap<Integer, String>();
        hm1 = (HashMap<Integer, String>) hm.clone();

        for (Map.Entry e : hm1.entrySet()) {
            System.out.println("Clone " + e.getKey() + " " + e.getValue());
        }

        System.out.println("*************************************** keyset");
        //iterator
        HashMap<String, String> capital = new HashMap<String, String>();

        capital.put("India", "Delhi");
        capital.put("USA", "Washington");
        capital.put("UK", "London");
        capital.put("UK", "London11");
        capital.put(null, "Bangalore");
        capital.put(null, "Mysore");
        capital.put(null, null);
        capital.put("France", null);
        capital.put("Russia", null);
        capital.put("India", "Delhi");

        //iterate using key set and while loop
        Iterator<String> capitalMap = capital.keySet().iterator();

        while (capitalMap.hasNext()) {
            String Key = capitalMap.next();
            String Value = capital.get(Key);

            System.out.println("Key = " + Key + " Value =" + Value);
        }
        System.out.println("****************************************** entryset");
        //iterate using   and for each loop
        for (Map.Entry<String, String> e1 : capital.entrySet()) {
            System.out.println("Key = " + e1.getKey() + " Value =" + e1.getValue());
        }
        System.out.println("****************************************** lambda");
        //iterate hashmap using java 8 for each and lambda
        capital.forEach((k, v) -> System.out.println("Key = " + k + " Value =" + v));

        HashMap<String, String> capital1 = new HashMap<String, String>();

        capital1.put("India", "Delhi");
        capital1.put("USA", "Washington");
        capital1.put("UK", "London");
        capital1.put("UK", "London11");
        capital1.put(null, "Bangalore");
        capital1.put(null, "Mysore");
        capital1.put(null, null);
        capital1.put("France", null);
        capital1.put("Russia", null);
        capital1.put("India", "Delhi");

      Iterator<String> it2=  capital1.keySet().iterator();
      while (it2.hasNext()){
         String keyV = it2.next();
         String val =capital1.get(keyV);
          System.out.println("key = " + keyV + " value = " + val);

      }

      Iterator<Map.Entry<String,String>> it3 = capital1.entrySet().iterator();
      while(it3.hasNext()){
        Map.Entry<String,String> keyValue = it3.next();
          System.out.println("Key Value --" + keyValue.getKey() + "  " + keyValue.getValue());

      }

        //converting to synchronized map
        Map<String,String> syncCapitalMap =  Collections.synchronizedMap(capital);
        System.out.println(syncCapitalMap);

        //concurrent hash Map : does not throw any ConcurrentModificationException
        ConcurrentHashMap capital12 = new ConcurrentHashMap();
        capital12.put("India" ,"New Delhi");
        capital12.put("Karnataka" ,"Bengaluru");
        capital12.put("Kerala","Kochi");

        System.out.println(capital12);

    }
}
