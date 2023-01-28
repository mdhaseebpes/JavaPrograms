package Collection;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentSynchronizedHashMap {

    public static void main(String[] args) {

        HashMap<String,Integer> pinCodes  = new HashMap<>();
        pinCodes.put("India" ,1);
        pinCodes.put("USA",2);
        pinCodes.put("Saudi",3);

       Map<String,Integer> code = Collections.synchronizedMap(pinCodes);
        System.out.println(code);

        //concurrentHashMap: does not throw concurrentModificationException

        ConcurrentHashMap<String,String> places = new ConcurrentHashMap<>();

        places.put("Kar" ,"Bangalore");
        places.put("Kerala","Munnar");
        places.put("Tamilnadu","Chennai");

        System.out.println(places);

    }
}
