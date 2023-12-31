package Collection.javaCollection23;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListMethods {
    //linked list is a default class in java
    //it can be used as a List , stack , Queue
    // it allows the null entry
    //dynamic collection
    //Insertion and deletion can be easily implemented
    //It can contain duplicate elements
    //Not thread safe (Not synchronized)
    //Manipulation is fast because we don't need shifting compare to Arraylist


    public static void main(String[] args) {

        LinkedList<String> names  = new LinkedList<>();
        names.add("AA");
        names.add("BB");

        System.out.println(names.size());
        System.out.println("----------");
       Iterator<String> it  = names.iterator();
       while(it.hasNext()){
           System.out.println(it.next());
       }

        System.out.println("----------");
       names.stream().forEach(data-> System.out.println(data));

       LinkedList<String> users = new LinkedList<>();
        users.add("CC");
        users.add("DD");


        names.addAll(users);
        System.out.println("----------");
        names.stream().forEach(e-> System.out.println(e));

        names.addFirst("aa");
        names.addLast("EE");

        System.out.println("-----");
        System.out.println(names);

        names.remove(0);
        System.out.println(names);

        names.removeAll(users);

        System.out.println(names);

        names.clear();
        System.out.println(names);

        System.out.println("---------");
        LinkedList<String> lang  = new LinkedList<>();
        lang.add("Java");
        lang.add("C");
        lang.add("Ruby");
        lang.add("C");
        lang.add("Ruby");
        lang.add(null);
        lang.add(null);

        System.out.println("------");
        System.out.println(lang);

        System.out.println(lang.size());

        Iterator<String> it2 = lang.descendingIterator();
        while(it2.hasNext()){
            System.out.println(it2.next());
        }



    }
}
