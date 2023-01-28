package Collection.javaCollection23;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateElements {

    public static void main(String[] args) {

        //1 .Linked Hash Set
        List<Object> list = new ArrayList<>(Arrays.asList("java", "java" ,
                2,55,66,2,77,88,'a' ,'b' ,'b', true ,true, "achieve","motivate"));
        System.out.println(list);
        LinkedHashSet<Object> linkSet = new LinkedHashSet<>(list);

        ArrayList<Object> newList = new ArrayList<>(linkSet);
        System.out.println("Updated array list ");
        System.out.println(newList);

        System.out.println("-------------------------");

        // 2. JDK 8 stream
        List<Object> list1 = new ArrayList<>(Arrays.asList("java", "java" ,
                2,55,66,2,77,88,'a' ,'b' ,'b', true ,true, "achieve","motivate"));
        System.out.println(list1);
        List<Object>  newList1 =  list1.stream().distinct().collect(Collectors.toList());
        System.out.println("Updated array list using stream ");
        System.out.println(newList1);


    }
}
