package Collection.javaCollection23;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListMethods {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("C");
        list.add("Python");
        list.add(null);
        list.add(null);

        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Web");
        list1.add("Mobile");

        //System.out.println(list1.addAll(list));
        System.out.println(list1);

        list1.addAll(1,list);
        System.out.println("-----------------");
        System.out.println(list1);

        list1.clear();
        System.out.println("-----------------");
        System.out.println(list1);

        ArrayList<String> cloneList = (ArrayList<String>)list.clone();
        System.out.println("-----------------");
        System.out.println(cloneList);

        System.out.println("-----------------");
        list.stream().forEach(ele -> System.out.println(ele));

        System.out.println(list.contains("Java"));
        System.out.println(list.indexOf("Ruby")>0);

        ArrayList<String> ar = new ArrayList<>(Arrays.asList("1" ,"QA" ,"Automation","Manual" ,"QA","Test"));
        System.out.println("-----------------");
        Iterator it  = ar.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        int i = ar.lastIndexOf("QA");
        System.out.println(i);

        ar.remove(1);
        int i1 = ar.lastIndexOf("QA");
        System.out.println(i1);

        System.out.println("-----------------");
        ar.remove("Test");
        System.out.println(ar);

        ArrayList<Integer> num = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        num.removeIf(numbers->numbers%2==0);
        System.out.println("-----------------");
        System.out.println(num);
        num.removeIf(numbers->numbers%2!=0);
        System.out.println("-----------------");
        System.out.println(num);

        ArrayList<String> nameList  = new ArrayList<>(Arrays.asList("ALiza" ,"Waiz" ,"Zaid", "Qa"));
        nameList.retainAll(Collections.singleton("Waiz"));
        System.out.println("-----------------");
        for (String s: nameList){
            System.out.println(s);
        }


        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        ArrayList<Integer> subList = new ArrayList<>(numbers.subList(3,8));
        System.out.println("-----------------");
        subList.stream().forEach(ele -> System.out.println(ele));

        ArrayList<String> names  = new ArrayList<>(Arrays.asList("ALiza" ,"Waiz" ,"Zaid", "Qa"));
       Object a[] = names.toArray();
        System.out.println("-----------------");
       // System.out.println(a[5]);
        for(Object o : names){
            System.out.println((String) o);
        }

    }
}
