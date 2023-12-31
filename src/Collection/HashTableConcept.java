package Collection;

import java.util.*;

public class HashTableConcept {
    /**
     * HashTable does not allow duplicate values combination of both Key and Value
     * HashTable is synchronized i.e. thread Safe
     * No NULL KEY and VALUE in HashTable  - will get Null Pointer Exception
     * *
     */
/*    HashMap	Hashtable
1) HashMap is non synchronized. It is not-thread safe and can't be shared between
many threads without proper synchronization code.
    Hashtable is synchronized. It is thread-safe and can be shared with many threads.
        2) HashMap allows one null key and multiple null values.
    Hashtable doesn't allow any null key or value.
            3) HashMap is a new class introduced in JDK 1.2.
    Hashtable is a legacy class.
            4) HashMap is fast.
    Hashtable is slow.
    5) We can make the HashMap as synchronized by calling this code
    Map m = Collections.synchronizedMap(hashMap);
    Hashtable is internally synchronized and can't be unsynchronized.
            6) HashMap is traversed by EntrySet.
    Hashtable is traversed by Enumerator and EntrySet.
7) Iterator in HashMap is fail-fast.
    Enumerator in Hashtable is not fail-fast.
8) HashMap inherits AbstractMap class.
    Hashtable inherits Dictionary class.
    */

    public static void main(String[] args) {

        HashSet<String> hs = new HashSet<>();

        hs.add("ALI");
        hs.add("ALI");
        hs.add("Khan");

       Iterator<String> it = hs.iterator();
       while(it.hasNext())
       {
           System.out.println(it.next());
       }

        System.out.println("*******************");
        Hashtable<Integer , String> ht = new Hashtable<Integer, String>();

        ht.put(1,"Aliza");
        ht.put(2, "3 years");
        ht.put(3, "Girl");
        ht.replace(2,"4 years");
        ht.put(1,"Aliza");

        System.out.println("*********Using entry set Hash table*********");
     for(Map.Entry<Integer, String> m: ht.entrySet()){
         System.out.println(m.getKey() + " " + m.getValue());
     }

        //Enumeration in hastable is used to iterate values in sequential manner

        System.out.println("******************************");
       Enumeration e = ht.elements();

        System.out.println("Enumeration " + e);

        while(e.hasMoreElements()){
            System.out.println(e.nextElement());
        }

        Set s =ht.entrySet();
        System.out.println("SET " + s);

        Hashtable<String,String> cap = new Hashtable<>();
        System.out.println("Enumeration hashtable");
        cap.put("1","Bangalore");
        cap.put("2","Chennai");
        cap.put("3","Delhi");

        Enumeration en = cap.elements();

        while(en.hasMoreElements())
        {
            System.out.println(en.nextElement());
        }

    }
}
