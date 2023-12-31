package Collection.javaCollection23;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class SynchronizedArrayList {

    public static void main(String[] args) {

        // 1. Collections.SynchronizedList

        List<String> list = Collections.synchronizedList(Arrays.asList("Java" , "Python" ,"C" ,"NodeJs"));

        //for add , remove we don't need to specify explicit synchronized
        // for fetching and traverse we need to use synchronized

        synchronized (list){
            Iterator<String> it  = list.iterator();
            while (it.hasNext()){
                System.out.println(it.next());
            }
        }

        System.out.println("----------------------");
        // 2. using CopyOnWriteArrayList class no need to define synchronized for add ,remove ,traverse
        CopyOnWriteArrayList<String> name = new CopyOnWriteArrayList<>(Arrays.asList("N" , "QA" ,"diff" ,"sub"));
        name.add("div");
        name.add("remove");
        name.remove(5);

        name.stream().forEach(ele -> System.out.println(ele));

    }
}
