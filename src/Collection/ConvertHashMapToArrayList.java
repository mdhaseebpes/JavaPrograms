package Collection;

import java.util.*;

public class ConvertHashMapToArrayList {

    public static void main(String[] args) {

        HashMap<String, String> capital = new HashMap<String, String>();

        capital.put("India", "Delhi");
        capital.put("USA", "Washington");
        capital.put("UK", "London");
        capital.put("UK", "London11");
        capital.put(null, "Bangalore");


        for(Map.Entry<String,String> e : capital.entrySet())
        {
            System.out.println(e.getKey() + " " + e.getValue());
        }

        System.out.println(capital);

        for(Map.Entry<String,String> e : capital.entrySet())
        {
            System.out.println(e.getKey() + " " + e.getValue());
        }

        //converting into arraylist and getting keys

        List<String> place = new ArrayList<>(capital.keySet());
        System.out.println(place);

        List<String> p1 = new ArrayList<>(capital.values());
        System.out.println(p1);

        for(String l: place)
        {
            System.out.println(l);
        }


    }
}
