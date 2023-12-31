package Collection.javaCollection23.map;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class HashMapConcept {

    public static void main(String[] args) {

        HashMap<String,String> capital = new HashMap<>();
        capital.put("India" ,"New Delhi");
        capital.put("Karnataka" ,"Bengaluru");
        capital.put("Mysore" ,null);
        capital.put("Kerala","Kochi");
        capital.put("Goa",null);
        capital.put(null,"patna");
        capital.put(null,"Ranchi");

       Iterator<String> it = capital.keySet().iterator();
       while (it.hasNext()){
         String key =  it.next();
        String value  = capital.get(key);
        System.out.println("key = " + key + " value = " + value);
       }

        System.out.println("----------------------");
      Iterator<Map.Entry<String,String>> map = capital.entrySet().iterator();
       while (it.hasNext()){
         Map.Entry<String, String> entry = map.next();
           System.out.println("key = " + entry.getKey() + "value = " + entry.getValue());
       }

        System.out.println("----------------------");
       //iterate hashmap using java 8 for each and lambda
      capital.forEach((k,v) -> System.out.println(k + " = " + v));

      //converting to synchronized map
      Map<String,String> syncCapitalMap =  Collections.synchronizedMap(capital);
        System.out.println(syncCapitalMap);

        //concurrent hash Map : does not throw any ConcurrentModificationException
        ConcurrentHashMap capital1 = new ConcurrentHashMap();
        capital1.put("India" ,"New Delhi");
        capital1.put("Karnataka" ,"Bengaluru");
        capital1.put("Kerala","Kochi");

        System.out.println(capital1);
    }
}
