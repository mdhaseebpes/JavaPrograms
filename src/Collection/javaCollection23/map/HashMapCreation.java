package Collection.javaCollection23.map;


import java.util.AbstractMap;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HashMapCreation {

    public static Map<String,Integer>  marks;
    static {
        marks = new HashMap<>();
        marks.put("eng" ,88);
        marks.put("maths" ,99);
        marks.put("bio",90);
    }
    public static void main(String[] args) {


        HashMap<String,String> map1 = new HashMap<>();
        Map<String,String> map2 = new HashMap<>();

        //2 . static way :static hashMap
        System.out.println(HashMapCreation.marks.get("maths"));
        marks.put("ziology" ,88);
        System.out.println(marks);
        System.out.println(HashMapCreation.marks.get("ziology"));

        // 3. Immutable Map with one single entry
        Map<String,Integer> map3 = Collections.singletonMap("test",77);
        System.out.println(map3.get("test"));
      //  map3.put("stage",99); //UnsupportedOperationException

        //JDK 8
        //creating 2D array of String using stream and collection in the form Map
        Map<String,String> map4 = Stream.of(new String[] []{
            {"A" ,"A+ Grade"},
            {"B" ,"B Grade"}, {"C" ,"AB Grade"},{"D" ,"D+ Grade"}
        }).collect(Collectors.toMap(data -> data[0],data -> data[1]));

        System.out.println(map4.get("D"));
        System.out.println(map4);

        //using simple entry : mutable map
        Map<String,String> map5 = Stream.of(
                new AbstractMap.SimpleEntry<>("A" ,"Apple"),
                new AbstractMap.SimpleEntry<>("B" ,"Ball"),
                new AbstractMap.SimpleEntry<>("C" ,"Apple")

        ).collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue));
        System.out.println(map5);
        map5.put("C","Cat");
        System.out.println(map5);


        //using simple entry : Immutable map
        Map<String,String> map6 = Stream.of(
                new AbstractMap.SimpleImmutableEntry<>("A" ,"Apple"),
                new AbstractMap.SimpleImmutableEntry<>("B" ,"Ball"),
                new AbstractMap.SimpleImmutableEntry<>("C" ,"Apple")

        ).collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue));
        System.out.println(map6);
        map6.put("D","Cat");
        System.out.println(map6.get("D"));

        //JDK 1.9
        //Map.of()
        //Map.of("key","value")
        //Map.ofEntries(
        //  new AbstractMap.SimpleEntry<>("A" ,"Apple"));

    }
}
